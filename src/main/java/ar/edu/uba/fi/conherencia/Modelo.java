package ar.edu.uba.fi.conherencia;

public abstract class Modelo {
    protected int plazas;

    public Modelo(int plazas) {

        this.plazas = plazas;
    }

    public abstract Double alquilerPorPlazas();
}
