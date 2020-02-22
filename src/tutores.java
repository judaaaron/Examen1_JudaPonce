
import java.util.ArrayList;


public class tutores  extends Alumnos{
    
    private ArrayList clases = new ArrayList();
    int ganancias, tutoDadas, enseñanza;

    public tutores() {
        super();
    }

    public tutores(int ganancias, int tutoDadas, int enseñanza, String nombre, String carrera, String lugar, String usuario, String password, String nCuenta, String edad, String tipoAlumno) {
        super(nombre, carrera, lugar, usuario, password, nCuenta, edad, tipoAlumno);
        this.ganancias = ganancias;
        this.tutoDadas = tutoDadas;
        this.enseñanza = enseñanza;
    }
    

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutoDadas() {
        return tutoDadas;
    }

    public void setTutoDadas(int tutoDadas) {
        this.tutoDadas = tutoDadas;
    }

    public int getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(int enseñanza) {
        this.enseñanza = enseñanza;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
  
    
}
