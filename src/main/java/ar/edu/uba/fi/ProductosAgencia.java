package ar.edu.uba.fi;

public interface ProductosAgencia {
    Double alquilarPorDias(int dias);

    Double comprar();

    Double manejar();

    boolean esIgualA(ProductosAgencia unProductosAgencia);

    boolean tieneMismoIdentificador(String identificador);
}