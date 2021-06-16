
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Alumno;
import modelo.Maestro;
import modelo.Usuario;
import persistencia.Singleton;

public class Controlador 
{
    private Singleton singleton;
    
    
    private ArrayList<Maestro> maestrosDisponibles = new ArrayList<Maestro>();
    private ArrayList<Maestro> maestrosTutores = new ArrayList<Maestro>();
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    
    
    private Connection conexion;
    
    private ResultSet rs = null;
    
    
    private PreparedStatement queryInsertar; 
    private PreparedStatement queryConsultar; 
    private PreparedStatement queryActualizar; 
    private PreparedStatement queryEliminar;   
   
    
    
    // VENTANA REGISTRO

    // Maestro
    private final String qInsertarUsuario = "INSERT INTO Usuarios VALUES (0, ?, ?, ?, ?)";
    private final String qLastInsertedID = "SELECT LAST_INSERT_ID()";
    private final String qInsertarMaestro = "INSERT INTO Maestros VALUES (?, ?)";

    // Alumno
    private final String qInsertarAlumno = "INSERT INTO Alumnos VALUES (?)";


    // VENTANA LOGIN

    private final String qSelectUsuario = "SELECT * FROM Usuarios WHERE Email=? AND Contrasena=?";
    
    private final String qConsultarMaestros = "SELECT * FROM Maestros WHERE MaestroID=?";
    private final String qConsultarAlumnos = "SELECT * FROM Alumnos WHERE AlumnoID=?";


    // VENTANA INTERFAZ ALUMNO

    // Registrar un tutor
    private final String qInsertarTutorias = "INSERT INTO Tutorias VALUES (0, ?, ?)";

    // Ver lista de Maestros disponibles
    private final String  qSelectMaestrosDisponibles = "SELECT Maestros.MaestroID \"MaestroID\", Usuarios.Nombre \"Nombre\", Usuarios.Email \"Email\", Maestros.Especialidad \"Especialidad\" FROM Usuarios INNER JOIN Maestros ON Maestros.MaestroID = Usuarios.UsuarioID WHERE Maestros.MaestroID NOT IN (SELECT MaestroID FROM Tutorias WHERE AlumnoID = ?)";

    // Ver lista de Tutores 
    private final String qSelectMaestrosTutores = "SELECT Maestros.MaestroID \"MaestroID\", Usuarios.Nombre \"Nombre\", Usuarios.Email \"Email\", Maestros.Especialidad \"Especialidad\" FROM Usuarios INNER JOIN Maestros ON Maestros.MaestroID = Usuarios.UsuarioID WHERE Maestros.MaestroID IN (SELECT MaestroID FROM Tutorias WHERE AlumnoID = ?)";

    // Modificar perfil
    private final String qActualizarAlumno = "UPDATE Usuarios SET Nombre = ?, Email = ?, Edad = ?, Contrasena = ? WHERE UsuarioID = ?";


    // VENTANA INTERFAZ MAESTRO

    // Ver lista de Tutorados
    private final String  qSelectTutorados = "SELECT Alumnos.AlumnoID \"AlumnoID\", Usuarios.Nombre \"Nombre\", Usuarios.Email \"Email\", Usuarios.Edad \"Edad\" FROM Usuarios INNER JOIN Alumnos ON Alumnos.AlumnoID = Usuarios.UsuarioID WHERE Alumnos.AlumnoID IN (SELECT AlumnoID FROM Tutorias WHERE MaestroID = ?)";

    // Modificar perfil
    private final String qActualizarMaestro = "UPDATE Usuarios SET Nombre = ?, Email = ?, Edad = ?, Contrasena = ? WHERE UsuarioID = ?";

    // Eliminar tutoria
    private final String qEliminarTutoria = "DELETE FROM Tutorias WHERE AlumnoID = ? AND MaestroID = ?";

    
    
    private final String qConsultarAlumno = "SELECT Usuarios.Nombre \"Nombre\", Usuarios.Email \"Email\", Usuarios.Edad \"Edad\", Usuarios.Contrasena \"Contrasena\" FROM Usuarios INNER JOIN Alumnos ON Alumnos.AlumnoID = Usuarios.UsuarioID WHERE UsuarioID=?;";
    
    private final String qConsultarMaestro = "SELECT Usuarios.Nombre \"Nombre\", Usuarios.Email \"Email\", Usuarios.Edad \"Edad\", Usuarios.Contrasena \"Contrasena\", Maestros.Especialidad \"Especialidad\" FROM Usuarios INNER JOIN Maestros ON Maestros.MaestroID = Usuarios.UsuarioID WHERE UsuarioID=?;";
    
    
    
    
    public Controlador() throws Exception
    {     
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception ex)
        {
            System.out.println("Controlador: Error al instanciar controlador");
        }
    }
    
    public void abrirConexion() throws Exception
    {
        try
        {
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/tutorate?serverTimezone=GMT-5","root","");
        }
        catch(Exception ex)
        {
            System.out.println("Controlador: Error al abrir conexion con BD");
            
        }
    }
    
    public void cerrarConexion() throws Exception
    {
        try
        {
            conexion.close();
        }
        catch(Exception ex)
        {
            System.out.println("Controlador: Error al cerrar conexion con BD");
        }
    }

    
    // GETTERS Y SETTERS
    
    public ArrayList<Maestro> getMaestrosDisponibles() 
    {
        return maestrosDisponibles;
    }

    public void setMaestrosDisponibles(ArrayList<Maestro> maestrosDisponibles) 
    {
        this.maestrosDisponibles = maestrosDisponibles;
    }

    public ArrayList<Maestro> getMaestrosTutores() 
    {
        return maestrosTutores;
    }

    public void setMaestrosTutores(ArrayList<Maestro> maestrosTutores) 
    {
        this.maestrosTutores = maestrosTutores;
    }
    
    public ArrayList<Alumno> getAlumnos() 
    {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) 
    {
        this.alumnos = alumnos;
    }
    
    
    // INSERTAR
    
    public void insertarUsuario(String nombre, String email, int edad, String contraseña) throws Exception
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qInsertarUsuario);
            queryInsertar.setString(1, nombre);
            queryInsertar.setString(2, email);
            queryInsertar.setInt(3, edad);
            queryInsertar.setString(4, contraseña);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al insertar un usuario" + "\nError: " + ex);  
        }
    }
   
    public void insertarAlumno(String nombre, String email, int edad, String contraseña) throws Exception
    {
        try 
        {
            insertarUsuario(nombre, email, edad, contraseña);
                    
            queryInsertar = conexion.prepareStatement(qInsertarAlumno);
            queryInsertar.setInt(1, consultarUltimoRegistro());
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al insertar un alumno" + "\nError: " + ex);  
        }
    }
    
    public void insertarMaestro(String nombre, String email, int edad, String contraseña, String especialidad) throws Exception
    {
        try 
        {
            insertarUsuario(nombre, email, edad, contraseña);
                    
            queryInsertar = conexion.prepareStatement(qInsertarMaestro);
            queryInsertar.setInt(1, consultarUltimoRegistro());
            queryInsertar.setString(2, especialidad);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al insertar un maestro" + "\nError: " + ex);  
        }
    }
    
    public void insertarTutoria(int MaestroID, int AlumnoID) throws Exception
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qInsertarTutorias);
            queryInsertar.setInt(1, MaestroID);
            queryInsertar.setInt(2, AlumnoID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al insertar una tutoria" + "\nError: " + ex);  
        }
    }
    
    
    
    // CONSULTAR
        
    public int consultarUltimoRegistro() throws Exception
    {
        try 
        {
            queryConsultar = conexion.prepareStatement(qLastInsertedID);
            rs = queryConsultar.executeQuery();
            
            if(rs.next())
            {
                return rs.getInt("LAST_INSERT_ID()");
            }
            else
            {
                return -1;
            }
            
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultarUltimoRegistro" + "\nError: " + ex);  
            return -1;
        }
    }
    
    public int consultarLogin(String email, String contrasena) throws Exception
    {
        try 
        {
            queryConsultar = conexion.prepareStatement(qSelectUsuario);
            queryConsultar.setString(1, email);
            queryConsultar.setString(2, contrasena);
            rs = queryConsultar.executeQuery();
            
            if(rs.next())
            {
                Usuario usuario = new Usuario(rs.getInt("UsuarioID"), rs.getString("Nombre"), rs.getString("Email"), rs.getInt("Edad"), 
                        rs.getString("Contrasena"));
                
                if(!consultarEsMaestro(usuario))
                {
                    if(!consultarEsAlumno(usuario))
                    {
                        return -2; // esto no es posible
                    }
                    else
                    {
                        System.out.println("Se ha realizado un login como ALUMNO exitosamente");
                    }
                }
                else
                {
                    System.out.println("Se ha realizado un login como MAESTRO exitosamente");
                }
                
                
                return 1;
            }
            else
            {
                return -1;   
            }
            
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultarLogin" + "\nError: " + ex); 
            return -1;
        }
    }
    
    public boolean consultarEsMaestro(Usuario usuario) throws Exception
    {
        try 
        {
            queryConsultar = conexion.prepareStatement(qConsultarMaestros);
            queryConsultar.setInt(1, usuario.getUsuarioID());
            rs = queryConsultar.executeQuery();
            if(rs.next())
            {
                Singleton.get().setMaestro(new Maestro(usuario, rs.getString("Especialidad")));
                Singleton.get().setEsMaestro(true);
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultarEsMaestro" + "\nError: " + ex);  
            return false;
        }
    }
    
    public boolean consultarEsAlumno(Usuario usuario) throws Exception
    {
        try 
        {
            queryConsultar = conexion.prepareStatement(qConsultarAlumnos);
            queryConsultar.setInt(1, usuario.getUsuarioID());
            rs = queryConsultar.executeQuery();
            
            if(rs.next())
            {
                Singleton.get().setAlumno(new Alumno(usuario));
                Singleton.get().setEsMaestro(false);
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultarEsAlumno" + "\nError: " + ex);  
            return false;
        }
    }
    
    public void consultarMaestrosDisponibles(int AlumnoID) throws Exception
    {
        try 
        {
            maestrosDisponibles.clear();
            
            queryConsultar = conexion.prepareStatement(qSelectMaestrosDisponibles);
            queryConsultar.setInt(1, AlumnoID);
            rs = queryConsultar.executeQuery();
            
            while(rs.next())
            {
                maestrosDisponibles.add(new Maestro(rs.getInt("MaestroID"), rs.getString("Nombre"), rs.getString("Email"), 0, "", 
                        rs.getString("Especialidad")));
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultar maestros disponibles" + "\nError: " + ex);  
        }
    }
    
    public void consultarMaestrosTutores(int AlumnoID) throws Exception
    {
        try 
        {
            maestrosTutores.clear();
            
            queryConsultar = conexion.prepareStatement(qSelectMaestrosTutores);
            queryConsultar.setInt(1, AlumnoID);
            rs = queryConsultar.executeQuery();
            
            while(rs.next())
            {
                maestrosTutores.add(new Maestro(rs.getInt("MaestroID"), rs.getString("Nombre"), rs.getString("Email"), 0, "", 
                        rs.getString("Especialidad")));
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultar maestros tutores" + "\nError: " + ex);  
        }
    }
    
    public void consultarTutorados(int MaestroID) throws Exception
    {
        try 
        {
            alumnos.clear();
            
            queryConsultar = conexion.prepareStatement(qSelectTutorados);
            queryConsultar.setInt(1, MaestroID);
            rs = queryConsultar.executeQuery();
            
            while(rs.next())
            {
                alumnos.add(new Alumno(rs.getInt("AlumnoID"), rs.getString("Nombre"), rs.getString("Email"), rs.getInt("Edad"), ""));
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultar tutorados" + "\nError: " + ex);  
        }
    }
    
    public boolean consultarMaestro(int MaestroID) throws Exception
    {
        try 
        {
            queryConsultar = conexion.prepareStatement(qConsultarMaestro);
            queryConsultar.setInt(1, MaestroID);
            rs = queryConsultar.executeQuery();
            if(rs.next())
            {
                Singleton.get().setMaestro(new Maestro(MaestroID, rs.getString("Nombre"), rs.getString("Email"), 
                        rs.getInt("Edad"), rs.getString("Contrasena"), rs.getString("Especialidad")));
                Singleton.get().setEsMaestro(true);
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultarMaestro" + "\nError: " + ex);  
            return false;
        }
    }
    
    public boolean consultarAlumno(int AlumnoID) throws Exception
    {
        try 
        {
            queryConsultar = conexion.prepareStatement(qConsultarAlumno);
            queryConsultar.setInt(1, AlumnoID);
            rs = queryConsultar.executeQuery();
            
            if(rs.next())
            {
                Singleton.get().setAlumno(new Alumno(AlumnoID, rs.getString("Nombre"), rs.getString("Email"), 
                        rs.getInt("Edad"), rs.getString("Contrasena")));
                Singleton.get().setEsMaestro(false);
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al consultarAlumno" + "\nError: " + ex);  
            return false;
        }
    }
    
    
    // ACTUALIZAR
    
    public void actualizarAlumno(String nombre, String email, int edad, String contraseña, int AlumnoID) throws Exception
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qActualizarAlumno);
            queryInsertar.setString(1, nombre);
            queryInsertar.setString(2, email);
            queryInsertar.setInt(3, edad);
            queryInsertar.setString(4, contraseña);
            queryInsertar.setInt(5, AlumnoID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al actualizar un alumno" + "\nError: " + ex);  
        }
    }
    
    public void actualizarMaestro(String nombre, String email, int edad, String contraseña, int MaestroID) throws Exception
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qActualizarMaestro);
            queryInsertar.setString(1, nombre);
            queryInsertar.setString(2, email);
            queryInsertar.setInt(3, edad);
            queryInsertar.setString(4, contraseña);
            queryInsertar.setInt(5, MaestroID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al actualizar un maestro" + "\nError: " + ex);  
        }
    }
    
    
    
    // ELIMINAR
    
    public void eliminarTutoria(int AlumnoID, int MaestroID) throws Exception
    {
        try 
        {
            queryInsertar = conexion.prepareStatement(qEliminarTutoria);
            queryInsertar.setInt(1, AlumnoID);
            queryInsertar.setInt(2, MaestroID);
            queryInsertar.executeUpdate();
        }
        catch (SQLException ex) 
        {
            System.out.println("Controlador: Error al eliminar una tutoria" + "\nError: " + ex);  
        }
    }
    
   
    
    
    
}