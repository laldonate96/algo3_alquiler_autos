package ar.edu.uba.fi.tiempo;

public class Tiempo {
    int dias;
    int horas;

    public Tiempo(int dias, int horas) {
        this.dias = dias;
        this.horas = horas;
    }

    public int convertirAHoras() {
        return (int) (dias * 24 + horas);
    }

    public int convertirADias() {
        return (int) (dias + horas / 24);
    }
}
