package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.blindados.Blindaje;
import ar.edu.uba.fi.categorias.Categoria;
import ar.edu.uba.fi.tiempo.Tiempo;

public class Coche extends Vehiculo {

    private final int plazas;
    private final Categoria categoria;
    private final Blindaje blindaje;

    public Coche(String patente, int plazas, Categoria categoria, Blindaje blindaje) {
        super(patente);
        this.plazas = plazas;
        this.categoria = categoria;
        this.blindaje = blindaje;
    }

    public Double alquilar(Tiempo tiempo) {
        return blindaje.modificarPrecio((500 + categoria.precioPlazas(plazas)) * tiempo.convertirADias());
    }
}
