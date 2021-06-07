
package modelo;

//bean
public class Alumno extends Usuario {
    private String tutor;
   
    //No añadimos un tutor en el constructor por si el usuario no quiere agregarlo cuando crea su cuenta
    public Alumno(int id, String nombre, String email, int edad,String contraseña,String especialidad) {
        super(id,nombre,email,edad,contraseña);
        this.tutor="";
    }

    public Alumno() {
     super();
     this.tutor="";
    }

    public String getTutores() {
      return this.tutor="";
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
  
}
