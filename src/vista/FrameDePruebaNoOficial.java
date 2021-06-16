
package vista;

import controlador.Controlador;
import javax.swing.JOptionPane;

public class FrameDePruebaNoOficial extends javax.swing.JFrame 
{
    Controlador controlador;
    
    
    public FrameDePruebaNoOficial() 
    {
        try
        {
            initComponents();
        
            controlador = new Controlador(); 
            
            setLocationRelativeTo(null);
            setResizable(false);
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con crear controlador");
        }
    }
    
    
    // INSERTAR
    
    public void insertarMaestro(String nombre, String email, int edad, String contraseña, String especialidad)
    {
        try
        {
            controlador.abrirConexion();
            controlador.insertarMaestro(nombre, email, edad, contraseña, especialidad);
            controlador.cerrarConexion();
            System.out.println("Se ha creado un maestro con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con insertarMaestro");
        }
    }
    
    public void insertarAlumno(String nombre, String email, int edad, String contraseña)
    {
        try
        {
            controlador.abrirConexion();
            controlador.insertarAlumno(nombre, email, edad, contraseña);
            controlador.cerrarConexion();
            System.out.println("Se ha creado un alumno con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con insertarAlumno");
        }
    }
    
    public void insertarTutoria(int MaestroID, int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.insertarTutoria(MaestroID, AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se ha creado una tutoria con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con insertarTutoria");
        }
    }
    
    
    
    
    // CONSULTAR
    
    
    public void consultarLogin(String email, String contrasena)
    {
        try
        {
            controlador.abrirConexion();
            int res = controlador.consultarLogin(email, contrasena);
            if(res == -1)
            {
                JOptionPane.showMessageDialog(this, "No existe usuario");
            }
            else if(res == -2)
            {
                JOptionPane.showMessageDialog(this, "IMPOSIBOOOOOOOL");
            }
            else
            {
                
            }
            controlador.cerrarConexion();
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarLogin");
        }
    }
    
    public void consultarMaestrosDisponibles(int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarMaestrosDisponibles(AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se han consultado los maestros disponibles con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarMaestrosDisponibles");
        }
    }
    
    public void consultarMaestrosTutores(int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarMaestrosTutores(AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se han consultado los tutores con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarMaestrosTutores");
        }
    }
    
    public void consultarTutorados(int MaestroID) 
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarMaestrosTutores(MaestroID);
            controlador.cerrarConexion();
            System.out.println("Se han consultado los tutorados con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarTutorados");
        }
    }
    
    
    
    // ACTUALIZAR
    
    public void actualizarMaestro(String nombre, String email, int edad, String contraseña, String especialidad, int MaestroID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.actualizarMaestro(nombre, email, edad, contraseña, especialidad, MaestroID);
            controlador.cerrarConexion();
            System.out.println("Se ha actualizado un maestro con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con actualizarMaestro");
        }
    }
    
    public void actualizarAlumno(String nombre, String email, int edad, String contraseña, int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.actualizarAlumno(nombre, email, edad, contraseña, AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se ha actualizado un alumno con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con actualizarAlumno");
        }
    }
    
    
    
    // ELIMINAR
    
    public void eliminarTutoria(int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.eliminarTutoria(AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se ha eliminado una tutoria con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con eliminarTutoria");
        }
    }
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 588));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    /*
        insertarAlumno(txtNombreAlumnos.getText(), txtEmailAlumnos.getText(), Integer.parseInt(txtEdadAlumnos.getText()), 
                txtContrasenaAlumnos.getText());
    
        
        insertarMaestro(txtNombreMaestros.getText(), txtEmailMaestros.getText(), Integer.parseInt(txtEdadMaestros.getText()), 
                   txtContrasenaMaestros.getText(), txtEspecialidadMaestros.getText());
    
    
        insertarTutoria(txtTableIDMaestro.getText(), Singleton.get().getAlumno().getAlumnoID());
    
    */
    
    
    
    
    
    /*
    
    consultarLogin(txtEmail.getText(), txtContrasena.getText());
    if(Singleton.get().getEsMaestro())
    {
        VentanaMaestro formMaestro = new VentanaMaestro();
        formMaestro.setVisible(true);
    }
    else
    {
        VentanaAlumno formAlumno = new VentanaAlumno();
        formAlumno.setVisible(true);
    }
    
    */
    
    
    
    /*
    
    consultarMaestrosDisponibles(Singleton.get().getAlumno().getAlumnoID());
    ArrayList<Maestro> maestros = controlador.getMaestros();
    
    
    consultarMaestrosTutores(Singleton.get().getAlumno().getAlumnoID());
    ArrayList<Maestro> maestros = controlador.getMaestros();
    
    
    consultarTutorados(Singleton.get().getMaestro().getMaestroID());
    ArrayList<Alumno> alumnos = controlador.getAlumnos();
    
    */
    
    
    
    /*
    actualizarMaestro(txtNombre.getText(), txtEmail.getText(), Integer.parseInt(txtEdad.getText()), 
                txtContrasena.getText(), txtEspecialidad.getText(), Singleton.get().getMaestro().getMaestroID())
    
            
    actualizarAlumno(txtNombre.getText(), txtEmail.getText(), Integer.parseInt(txtEdad.getText()), 
                txtContrasena.getText(), Singleton.get().getAlumno().getAlumnoID())
    
    */
    
    
    
    
    /*
    
    eliminarTutoria(Singleton.get().getAlumno().getAlumnoID());
    
    */
    
    
    
    
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FrameDePruebaNoOficial().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
