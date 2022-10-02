package ar.edu.uba.fi.herencia;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Vehiculo> vehiculos;

    public Agencia() {
        vehiculos = new ArrayList<>();

    }
    public void registrar(Vehiculo vehiculo) {
        Vehiculo v = this.encontrarVehiculo( vehiculo );

        if ( v != null) {
            throw new VehiculoDuplicado();
        }
        vehiculos.add(vehiculo);

    }

    public double alquilarDias(String unaPatenteStr, int unosDias) {
        Vehiculo v = this.encontrarVehiculo( unaPatenteStr );

        return v.alquilar(unosDias);
    }

    private Vehiculo encontrarVehiculo(String unaPatenteStr) {
        for(Vehiculo v : vehiculos) {
            if ( v.sos(unaPatenteStr) ) {
                return v;
            }
        }

        throw new RuntimeException();
    }

    private Vehiculo encontrarVehiculo(Vehiculo vehiculo) {
        for(Vehiculo v : vehiculos) {
            if ( v.sos(vehiculo) ) {
                return v;
            }
        }

        return null;
    }
}
