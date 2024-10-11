package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.tiempo.Tiempo;

public class Microbus extends Vehiculo {

    public Microbus(String patente) {
        super(patente);
    }

    public Double alquilar(Tiempo tiempo) {
        return Double.valueOf((1500 * tiempo.convertirADias()) + 500);
    }
}
