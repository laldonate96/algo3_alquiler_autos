package ar.edu.uba.fi;

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
}
