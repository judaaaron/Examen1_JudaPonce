
public class Ingenieros  extends EstudiantesNormales{
    
    
    private int destreza, nivelcomunicacion;

    public Ingenieros() {
        super();
    }

    public Ingenieros(int destreza, int nivelcomunicacion, int conocimiento, int aprendizaje, String nombre, String carrera, String lugar, String usuario, String password, int edad, int nCuenta) {
        super(conocimiento, aprendizaje, nombre, carrera, lugar, usuario, password, edad, nCuenta);
        this.destreza = destreza;
        this.nivelcomunicacion = nivelcomunicacion;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getNivelcomunicacion() {
        return nivelcomunicacion;
    }

    public void setNivelcomunicacion(int nivelcomunicacion) {
        this.nivelcomunicacion = nivelcomunicacion;
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
