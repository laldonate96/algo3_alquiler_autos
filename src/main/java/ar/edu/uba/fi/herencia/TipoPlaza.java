package ar.edu.uba.fi.herencia;

public abstract class TipoPlaza {
    private final int precioPlaza;

    public TipoPlaza(int precioPlaza) {
        this.precioPlaza = precioPlaza;
    }

    public double alquilar(Integer numeroPlazas) {
        return numeroPlazas * precioPlaza;
    }
}
