
public class Alumnos {

    private String nombre, carrera, lugar, usuario, password;
    private int edad, nCuenta;

    public Alumnos() {
    }

    public Alumnos(String nombre, String carrera, String lugar, String usuario, String password, int edad, int nCuenta) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.lugar = lugar;
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
        this.nCuenta = nCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
