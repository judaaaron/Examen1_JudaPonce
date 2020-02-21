
public class Licenciados  extends EstudiantesNormales{
    
    private int nivelInteres;

    public Licenciados() {
        super();
    }

    public Licenciados(int nivelInteres, int conocimiento, int aprendizaje, String nombre, String carrera, String lugar, String usuario, String password, int edad, int nCuenta) {
        super(conocimiento, aprendizaje, nombre, carrera, lugar, usuario, password, edad, nCuenta);
        this.nivelInteres = nivelInteres;
    }

    public int getNivelInteres() {
        return nivelInteres;
    }

    public void setNivelInteres(int nivelInteres) {
        this.nivelInteres = nivelInteres;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
   

    @Override
    public boolean examen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
