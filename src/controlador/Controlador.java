
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Alumno;
import modelo.Maestro;

public class Controlador 
{
    private Alumno alumno = new Alumno();
    private Maestro maestro = new Maestro();
    
    private Connection conexion;
    
    private PreparedStatement queryInsertar; 
    private PreparedStatement queryConsultar; 
    private PreparedStatement queryActualizar; 
    private PreparedStatement queryEliminar; 
    
    private final String qInsertarMaestro = "INSERT INTO Maestros VALUES (0, ?, ?, ?, ?, ?)";
    private final String qInsertarAlumno = "INSERT INTO Alumnos VALUES (0, ?, ?, ?, ?, ?)";

    private final String qConsultarMaestros = "SELECT * FROM Maestros";
    private final String qConsultarAlumnos = "SELECT * FROM Alumnos";

    private final String qConsultarMaestroPorID = "SELECT * FROM Maestros WHERE MaestroID = ?";
    private final String qConsultarAlumnoPorID = "SELECT * FROM Alumnos WHERE AlumnoID = ?";
    
    private final String qConsultarMaestroPorNombre = "SELECT * FROM Maestros WHERE Nombre = ?";

    private final String qActualizarMaestroPorID = "UPDATE Maestros SET Nombre = ?, Email = ?, Edad = ?, Especialidad = ?, Contrasena = ? WHERE MaestroID = ?";
    private final String qActualizarAlumnoPorID = "UPDATE Alumnos SET Nombre = ?, Email = ?, Edad = ?, Contrasena = ? WHERE AlumnoID = ?";

    private final String qEliminarMaestroPorID = "DELETE FROM Maestros WHERE MaestroID = ?";
    private final String qEliminarAlumnoPorID = "DELETE FROM Alumnos WHERE AlumnoID = ?";

    
    
    
    String nombreProfe;
    int idProfe;
    
    
    
    
    
    public Controlador() 
    {     
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception ex)
        {
            System.out.println("Error al instanciar controlador");
        }
    }
    
    public void abrirConexion() 
    {
        try
        {
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/tutorate?serverTimezone=GMT-5","root","");
        }
        catch(Exception ex)
        {
            System.out.println("Error al abrir conexion con BD");
        }
    }
    
    public void cerrarConexion() 
    {
        try
        {
            conexion.close();
        }
        catch(Exception ex)
        {
            System.out.println("Error al cerrar conexion con BD");
        }
    }
    
   
    
    public Alumno getAlumno() 
    {
        return alumno;
    }

    public void setAlumno(Alumno alumno) 
    {
        this.alumno = alumno;
    }
    
    public Maestro getMaestro(Maestro maestro) 
    {
        return maestro;
    }

    public void setMaestro(Maestro maestro) 
    {
        this.maestro = maestro;
    }
    
    
    
    public void crearAlumno(String nombre, String email, int edad, String contraseña)
    {
        alumno = new Alumno(nombre, email, edad, contraseña);
        
        //System.out.println("Se ha creado el objeto Alumno");
    }
    
    public void crearMaestro(String nombre, String email, int edad, String contraseña, String especialidad)
    {
        maestro = new Maestro(nombre, email, edad, contraseña, especialidad);
        
        //System.out.println("Se ha cargado el objeto Maestro");
    }
    
    
   
    public void insertarAlumno() 
    {
        try 
        {
            
            consultarMaestroPorNombre(maestro.getNombre());
            
            
            queryInsertar = conexion.prepareStatement(qInsertarAlumno);
            queryInsertar.setString(1, alumno.getNombre());
            queryInsertar.setString(2, alumno.getEmail());
            queryInsertar.setInt(3, alumno.getEdad());
            queryInsertar.setString(4, alumno.getContraseña());
            queryInsertar.setInt(5, idProfe);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al insertar un alumno" + "\nError: " + ex);  
        }
    }
    
    public void insertarMaestro() 
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qInsertarMaestro);
            queryInsertar.setString(1, maestro.getNombre());
            queryInsertar.setString(2, maestro.getEmail());
            queryInsertar.setInt(3, maestro.getEdad());
            queryInsertar.setString(4, maestro.getEspecialidad());
            queryInsertar.setString(5, maestro.getContraseña());
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al insertar un maestro" + "\nError: " + ex);  
        }
    }
    
    
    
    public void consultarAlumnoPorID(int ID) 
    {
        try 
        {
            ResultSet rs = null;
            
            queryConsultar = conexion.prepareStatement(qConsultarAlumnoPorID);
            queryConsultar.setInt(1, ID);
            rs = queryConsultar.executeQuery();
            
            if(rs.next())
            {
                crearAlumno(rs.getString("Nombre"), rs.getString("Email"), rs.getInt("Edad"), rs.getString("Contrasena"));
            }
            else
            {
                crearAlumno("", "", 0, "");
            }
            
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultar un alumno" + "\nError: " + ex);  
        }
    }
    
    public void consultarMaestroPorID(int ID) 
    {
        try 
        {
            ResultSet rs = null;
            
            queryConsultar = conexion.prepareStatement(qConsultarMaestroPorID);
            queryConsultar.setInt(1, ID);
            rs = queryConsultar.executeQuery();
            
            if(rs.next())
                crearMaestro(rs.getString("Nombre"), rs.getString("Email"), rs.getInt("Edad"), rs.getString("Contrasena"),
                        rs.getString("Especialidad"));
            else
                crearMaestro("", "", 0, "", "");
            
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultar un maestro por id" + "\nError: " + ex);  
        }
    }
    
    public void consultarMaestroPorNombre(String nombre) 
    {
        try 
        {
            ResultSet rs = null;
            
            queryConsultar = conexion.prepareStatement(qConsultarMaestroPorNombre);
            queryConsultar.setString(1, nombre);
            rs = queryConsultar.executeQuery();
            
            /*if(rs.next())
                crearMaestro(rs.getString("Nombre"), rs.getString("Email"), rs.getInt("Edad"), rs.getString("Contrasena"),
                        rs.getString("Especialidad"));
            else
                crearMaestro("", "", 0, "", "");*/
            
            if(rs.next())
                idProfe = rs.getInt("MaestroID");
            
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultar un maestro por nombre" + "\nError: " + ex);  
        }
    }
    
    
    
    public void actualizarAlumno(int ID) 
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qActualizarAlumnoPorID);
            queryInsertar.setString(1, alumno.getNombre());
            queryInsertar.setString(2, alumno.getEmail());
            queryInsertar.setInt(3, alumno.getEdad());
            queryInsertar.setString(4, alumno.getContraseña());
            queryInsertar.setInt(5, ID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al actualizar un alumno" + "\nError: " + ex);  
        }
    }
    
    public void actualizarMaestro(int ID) 
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qActualizarMaestroPorID);
            queryInsertar.setString(1, maestro.getNombre());
            queryInsertar.setString(2, maestro.getEmail());
            queryInsertar.setInt(3, maestro.getEdad());
            queryInsertar.setString(4, maestro.getEspecialidad());
            queryInsertar.setString(5, maestro.getContraseña());
            queryInsertar.setInt(6, ID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al actualizar un maestro" + "\nError: " + ex);  
        }
    }
    
    
    
    public void eliminarAlumno(int ID) 
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qEliminarAlumnoPorID);
            queryInsertar.setInt(1, ID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al eliminar un alumno" + "\nError: " + ex);  
        }
    }
    
    public void eliminarMaestro(int ID) 
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qEliminarMaestroPorID);
            queryInsertar.setInt(1, ID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al eliminar un maestro" + "\nError: " + ex);  
        }
    }
    
   
    
}
