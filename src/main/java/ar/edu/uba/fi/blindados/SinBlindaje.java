package ar.edu.uba.fi.blindados;

public class SinBlindaje implements Blindaje {
    @Override
    public Double modificarPrecio(int precio) {
        return precio * 1.0;
    }
}