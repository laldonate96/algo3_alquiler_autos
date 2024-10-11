package ar.edu.uba.fi;

import ar.edu.uba.fi.tiempo.Tiempo;
import ar.edu.uba.fi.vehiculos.Vehiculo;

import java.util.ArrayList;

public class Cliente {
    private final String nombre;
    private ArrayList<Alquiler> alquileres = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void registrarAlquiler(Vehiculo vehiculo, Tiempo tiempo) {
        alquileres.add(new Alquiler(vehiculo, tiempo));
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
