package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.categorias.Categoria;

public class Coche extends Vehiculo {

    private final int plazas;
    private final Categoria categoria;
    private final String blindaje;

    public Coche(String patente, int plazas, Categoria categoria, String blindaje) {
        super(patente);
        this.plazas = plazas;
        this.categoria = categoria;
        this.blindaje = blindaje;
    }

    public Double alquilarPorDias(int dias) {
        double precio = (500 + categoria.precioPlazas(plazas)) * dias;

        if (blindaje == "blindado"){
            return precio * 1.15;
        }else if(blindaje == "no blindado"){
            return precio;
        }

        throw new RuntimeException("Blindaje no conocido");
    }
}
