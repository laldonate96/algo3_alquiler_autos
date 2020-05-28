package ar.edu.uba.fi;

public class BMW {
    private Patente patente;
    private int modelo;
    private int plazas;

    public BMW(Patente patente, int modelo, int plazas) {

        this.patente = patente;
        this.modelo = modelo;
        this.plazas = plazas;
    }

    public Double alquilarPor(int cantidadDias) {

        return alquilerBase(cantidadDias) + alquilerPlazas();
    }

    private Double alquilerPlazas() {
        return 150.0 * plazas;
    }

    private Double alquilerBase(int cantidadDias) {
        return 500.0 * cantidadDias;
    }
}
