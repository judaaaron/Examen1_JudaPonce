
public class Medicos extends EstudiantesNormales{
    private int nivelSolidaridad, preocupacion;

    public Medicos() {
    }

    public Medicos(int nivelSolidaridad, int preocupacion, int conocimiento, int aprendizaje, String nombre, String carrera, String lugar, String usuario, String password, int edad, int nCuenta) {
        super(conocimiento, aprendizaje, nombre, carrera, lugar, usuario, password, edad, nCuenta);
        this.nivelSolidaridad = nivelSolidaridad;
        this.preocupacion = preocupacion;
    }

    public int getNivelSolidaridad() {
        return nivelSolidaridad;
    }

    public void setNivelSolidaridad(int nivelSolidaridad) {
        this.nivelSolidaridad = nivelSolidaridad;
    }

    public int getPreocupacion() {
        return preocupacion;
    }

    public void setPreocupacion(int preocupacion) {
        this.preocupacion = preocupacion;
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
