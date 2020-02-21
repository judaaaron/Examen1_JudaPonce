
public class Examenes {
    
    private String clase,tema;
    private int conocimientoRequerido, puntaje;

    public Examenes() {
    }

    public Examenes(String clase, String tema, int conocimientoRequerido, int puntaje) {
        this.clase = clase;
        this.tema = tema;
        this.conocimientoRequerido = conocimientoRequerido;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getConocimientoRequerido() {
        return conocimientoRequerido;
    }

    public void setConocimientoRequerido(int conocimientoRequerido) {
        this.conocimientoRequerido = conocimientoRequerido;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Examenes{" + "clase=" + clase + ", tema=" + tema + ", conocimientoRequerido=" + conocimientoRequerido + ", puntaje=" + puntaje + '}';
    }
    
    
    
    
    
}
