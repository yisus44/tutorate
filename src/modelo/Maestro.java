
package modelo;

public class Maestro extends Usuario 
{
    private String especialidad;
   
    public Maestro(int id, String nombre, String email, int edad, String contraseña, String especialidad) 
    {
        super(id, nombre, email, edad, contraseña);
        this.especialidad = especialidad;
    }
    
    public Maestro(Usuario usuario, String especialidad) 
    {
        super(usuario.getUsuarioID(), usuario.getNombre(), usuario.getEmail(), usuario.getEdad(), usuario.getContraseña());
        this.especialidad = especialidad;
    }

    
    public String getEspecialidad() 
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }

    
    
    public boolean renunciar()
    {
        try
        {
            return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }  
    }
}
