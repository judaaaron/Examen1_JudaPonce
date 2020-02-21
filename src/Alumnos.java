
public class Alumnos {

    private String nombre, carrera, lugar, usuario, password,nCuenta,edad;


    public Alumnos() {
    }

    public Alumnos(String nombre, String carrera, String lugar, String usuario, String password, String nCuenta, String edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.lugar = lugar;
        this.usuario = usuario;
        this.password = password;
        this.nCuenta = nCuenta;
        this.edad = edad;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
