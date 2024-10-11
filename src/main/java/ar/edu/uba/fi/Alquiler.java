package ar.edu.uba.fi;

import ar.edu.uba.fi.vehiculos.Vehiculo;
import ar.edu.uba.fi.tiempo.Tiempo;

public class Alquiler {


    private final Vehiculo vehiculo;
    private final Tiempo tiempo;

    public Alquiler(Vehiculo vehiculo, Tiempo tiempo) {
        this.vehiculo = vehiculo;
        this.tiempo = tiempo;
    }

    public double calcularPrecio() {
        return vehiculo.alquilar(tiempo);
    }
}
