package ar.edu.uba.fi;

public interface ProductosAgencia {
    Double alquilarPorDias(int dias);

    boolean esIgualA(ProductosAgencia unProductosAgencia);

    boolean tieneMismoIdentificador(String identificador);
}