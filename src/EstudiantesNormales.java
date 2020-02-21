
import java.util.ArrayList;

public abstract class EstudiantesNormales extends Alumnos {

    private int conocimiento, aprendizaje;
    private ArrayList<Examenes> exams = new ArrayList();

    public EstudiantesNormales() {
        super();
    }

    public EstudiantesNormales(int conocimiento, int aprendizaje, String nombre, String carrera, String lugar, String usuario, String password, int edad, int nCuenta) {
        super(nombre, carrera, lugar, usuario, password, edad, nCuenta);
        this.conocimiento = conocimiento;
        this.aprendizaje = aprendizaje;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public int getAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(int aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    public ArrayList<Examenes> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Examenes> exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract boolean examen();

}
