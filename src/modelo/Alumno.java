package modelo;

//el id del tutor sera lo que unira las clases xd
public class Alumno extends Usuario {
    private int tutor;
<<<<<<< HEAD
=======
    private int AlumnoID;
>>>>>>> yisus
   
    //No añadimos un tutor en el constructor por si el usuario no quiere agregarlo cuando crea su cuenta
    public Alumno(int id, String nombre, String email, int edad, String contraseña, int AlumnoID) {
        super(id,nombre,email,edad,contraseña);
<<<<<<< HEAD
=======
        this.AlumnoID=AlumnoID;
>>>>>>> yisus
        this.tutor=0;
    }
    
    public Alumno(String nombre, String email, int edad, String contraseña, int tutor) {
        super(nombre,email,edad,contraseña);
        this.tutor=0;
<<<<<<< HEAD
        this.tutor=tutor;
=======
>>>>>>> yisus
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
    
    public int getAlumnoID() {
      return this.AlumnoID;
    }

    public void setAlumnoID(int AlumnoID) {
        this.AlumnoID = AlumnoID;
    }
}
