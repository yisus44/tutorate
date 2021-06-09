
package modelo;

//el id del tutor sera lo que unira las clases xd
public class Alumno extends Usuario {
    private int tutor;
   
    //No añadimos un tutor en el constructor por si el usuario no quiere agregarlo cuando crea su cuenta
    public Alumno(int id, String nombre, String email, int edad, String contraseña) {
        super(id,nombre,email,edad,contraseña);
        this.tutor=0;
    }
    
    public Alumno(String nombre, String email, int edad, String contraseña, int tutor) {
        super(nombre,email,edad,contraseña);
        this.tutor=0;
        this.tutor=tutor;
    }

    public Alumno() {
     super();
     this.tutor=0;
    }

    public int getTutor() {
      return this.tutor;
    }

    public void setTutor(int tutor) {
        this.tutor = tutor;
    }
  
}
