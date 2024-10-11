package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.tiempo.Tiempo;

public class Camion extends Vehiculo {

    public Camion(String patente) {
        super(patente);
    }

    public Double alquilar(Tiempo tiempo) {
        return 30000.00;
    }
}
