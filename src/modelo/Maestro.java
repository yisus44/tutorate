
package modelo;

//bean
public class Maestro extends Usuario {


    private String especialdad;
    private int MaestroID;
   

    public Maestro(int id, int MaestroID, String nombre, String email, int edad, String contraseña, String especialidad) {
        super(id,nombre,email,edad,contraseña);
        this.MaestroID=MaestroID;
        this.especialdad=especialidad;
    }
    
    public Maestro(String nombre, String email, int edad, String contraseña, String especialidad) {
        super(nombre,email,edad,contraseña);
        this.especialdad=especialidad;
    }

    public Maestro() {
     super();
      this.especialdad="";
    }


    public String getEspecialidad() {
        return especialdad;
    }

    public void setNombre(String especialdad) {
        this.especialdad = especialdad;
    }
    
    public int getMaestroID(){
        return MaestroID;
    }
    
    public void setMaestro(int MaestroID) {
        this.MaestroID = MaestroID;
    }
    
    public boolean renunciar(){
        //creo que este metodo esta de mas 
        //porque existe .dispose() jasjda
        try{
            return true;
        }catch(Exception ex){
            System.out.println(ex);
            return false;
        }  
    }
}
