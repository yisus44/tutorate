
package modelo;


public class Usuario 
{
    public int UsuarioID;
    public String nombre;
    public String email;
    public int edad;
    public String contraseña;
   

    public Usuario(int id, String nombre, String email, int edad, String contraseña) 
    {
        this.UsuarioID = id;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.contraseña = contraseña;
    }

    public int getUsuarioID() 
    {
        return UsuarioID;
    }

    public void setUsuarioID(int ID) 
    {
        this.UsuarioID = ID;
    }
    
    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public String getContraseña() 
    {
        return contraseña;
    }

    public void setContraseña(String contraseña) 
    {
        this.contraseña = contraseña;
    }
    
    public int login(String contraseña, String email)
    {
        if(this.contraseña.equals(contraseña) && this.email.equals(email))
        {
            return this.UsuarioID;
        }
        else
        {
            return -1;
        }
    }
    
}
