package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.tiempo.Tiempo;

public class Furgoneta extends Vehiculo {
    private final double pma;

    public Furgoneta(String patente, double pma) {
        super(patente);
        this.pma = pma;
    }

    public Double alquilar(Tiempo tiempo) {
       return ((300 * pma ) + 500 ) * tiempo.convertirADias();
    }
}
