package ar.edu.uba.fi;

import ar.edu.uba.fi.vehiculos.Vehiculo;

import java.util.ArrayList;

public class Cliente {
    private final String nombre;
    private ArrayList<Alquiler> alquileres = new ArrayList<>();
    private TarjetaCredito tarjetaCredito;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.tarjetaCredito = new TarjetaCredito("4576-nombre-000",100000);
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

    public void pagarAlquiler(int numeroAlquiler){
        Alquiler alquiler = this.alquileres.get(numeroAlquiler -1);
        double saldoAPagar = alquiler.calcularPrecio();
        this.tarjetaCredito.descontarSaldo(saldoAPagar);
        this.alquileres.remove(alquiler);
    }

}
