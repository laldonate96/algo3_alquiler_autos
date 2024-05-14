package ar.edu.uba.fi;

import ar.edu.uba.fi.vehiculos.Vehiculo;

public class Alquiler {


    private final Vehiculo vehiculo;
    private final int dias;

    public Alquiler(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public double calcularPrecio() {
        return vehiculo.alquilarPorDias(dias);
    }

    public String nombreDelVehiculo(){
        return this.vehiculo.getPatente();
    }

    public int dias() {
        return this.dias;
    }
}
