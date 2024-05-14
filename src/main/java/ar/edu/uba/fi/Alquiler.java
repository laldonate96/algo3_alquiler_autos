package ar.edu.uba.fi;

public class Alquiler {


    private final ProductosAgencia productosAgencia;
    private final int dias;

    public Alquiler(ProductosAgencia productosAgencia, int dias) {
        this.productosAgencia = productosAgencia;
        this.dias = dias;
    }

    public double calcularPrecio() {
        return productosAgencia.alquilarPorDias(dias);
    }
}
