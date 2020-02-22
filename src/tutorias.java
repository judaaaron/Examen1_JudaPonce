
public class tutorias {

    private int hora, aula, dia, mes, year;
    private String clase, tema;
    private tutores tutorias;

    public tutorias() {
    }

    public tutorias(int hora, int aula, int dia, int mes, int year, String clase, String tema, tutores tutorias) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.clase = clase;
        this.tema = tema;
        this.tutorias = tutorias;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public tutores getTutorias() {
        return tutorias;
    }

    public void setTutorias(tutores tutorias) {
        this.tutorias = tutorias;
    }

    @Override
    public String toString() {
        return "tutorias{" + "hora=" + hora + ", aula=" + aula + ", dia=" + dia + ", mes=" + mes + ", year=" + year + ", clase=" + clase + ", tema=" + tema + ", tutorias=" + tutorias + '}';
    }

}
