package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.tiempo.Tiempo;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String patente) {
        super(patente);
    }

    public Double alquilar(Tiempo tiempo) {
        return (double) (tiempo.convertirAHoras() * 1200);
    }
}
