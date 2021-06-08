
package modelo;

//bean
public class Usuario {

    //Definir atributos
    public int ID;
    public int edad;
    public String nombre;
    public String email;
    public String contraseña;
   

    public Usuario(int id, String nombre, String email, int edad, String contraseña) {
        this.ID = id;
        this.nombre = nombre;
        this.email = email;
        this.edad=edad;
        this.contraseña=contraseña;
    }
    
    public Usuario(String nombre, String email, int edad, String contraseña) {
        this.ID = 0;
        this.nombre = nombre;
        this.email = email;
        this.edad=edad;
        this.contraseña=contraseña;
    }

    public Usuario() {
        this.ID =0;
        this.edad=18;
        this.nombre="";
        //En una aplicacion normal aqui lanzariamos un error
        //si no se proviera la contraseña o el email
        this.email="";
        this.contraseña="";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public int login(String contraseña, String email){
        if(this.contraseña.equals(contraseña) && this.email.equals(email)){
            return this.ID;
        }else{
            return -1;
        }
    }
    
}
