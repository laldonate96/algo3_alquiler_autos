package ar.edu.uba.fi;

import java.util.ArrayList;

public class Cliente {
    private final String nombre;
    private ArrayList<Alquiler> alquileres = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void registrarAlquiler(ProductosAgencia productosAgencia, int dias) {
        alquileres.add(new Alquiler(productosAgencia,dias));
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
