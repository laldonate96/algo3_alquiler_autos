package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nombre;
    private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void registrarAlquiler(Vehiculo vehiculo, int dias) {
        alquileres.add(new Alquiler(vehiculo,dias));
    }

    public Double calcularPrecioAlquileres() {
        double suma = 0;
        for (Alquiler alquiler: alquileres){
            suma += alquiler.calcularPrecio();
        }
        return suma;
    }

    public boolean esIgualA(Cliente unCliente) {
        return unCliente.tieneNombre(nombre);
    }

    private boolean tieneNombre(String unNombre) {
        return (unNombre == nombre);
    }
}
