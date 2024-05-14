package ar.edu.uba.fi.blindados;

public class Blindado implements Blindaje {
    @Override
    public Double modificarPrecio(int precio) {
        return precio * 1.15;
    }
}
