
package modelo;


public class Alumno extends Usuario 
{
    public Alumno(int id, String nombre, String email, int edad, String contraseña) 
    {
        super(id, nombre, email, edad, contraseña);
    }
    
    public Alumno(Usuario usuario) 
    {
        super(usuario.getUsuarioID(), usuario.getNombre(), usuario.getEmail(), usuario.getEdad(), usuario.getContraseña());
    }
    
    /*public Alumno(String nombre, String email, int edad, String contraseña)
    {
        super(nombre,email,edad,contraseña);
        this.tutor=0;
    }

    public Alumno() 
    {
        super();
        this.tutor=0;
    }*/
  
}
