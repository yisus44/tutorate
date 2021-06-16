
package persistencia;

import modelo.Alumno;
import modelo.Maestro;

public class Singleton 
{
    Maestro maestro;
    Alumno alumno;
    boolean esMaestro;
    
    private static Singleton singleton;
    
    /*public Singleton(Maestro maestro)
    {
        this.maestro = maestro;
        esMaestro = true;
        this.alumno = null;
    }
    
    public Singleton(Alumno alumno)
    {
        this.alumno = alumno;
        esMaestro = false;
        this.maestro = null;
    }*/
    
    public Singleton()
    {
        maestro = null;
        alumno = null;
        esMaestro = false;
    }
    
    public static Singleton get()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
    
    

    public Maestro getMaestro() 
    {
        return maestro;
    }

    public void setMaestro(Maestro maestro) 
    {
        this.maestro = maestro;
    }

    public Alumno getAlumno() 
    {
        return alumno;
    }

    public void setAlumno(Alumno alumno) 
    {
        this.alumno = alumno;
    }

    public boolean isEsMaestro() 
    {
        return esMaestro;
    }

    public void setEsMaestro(boolean esMaestro) 
    {
        this.esMaestro = esMaestro;
    }
    
    
}
