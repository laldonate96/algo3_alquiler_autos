package ar.edu.uba.fi.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private final List<Vehiculo> vehiculos;

    public Agencia() {
        vehiculos = new ArrayList<>();

    }
    public void registrar(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double alquilarDias(String unaPatenteStr, int unosDias) {
        Vehiculo v = this.buscarVehiculo( unaPatenteStr );

        return v.alquilar(unosDias);
    }

    private Vehiculo buscarVehiculo(String unaPatenteStr) {
        for(Vehiculo v : vehiculos) {
            if ( v.sos(unaPatenteStr) ) {
                return v;
            }
        }

        throw new RuntimeException();
    }
}
