package ar.edu.uba.fi.categorias;

public class CategoriaPremium implements Categoria {
    @Override
    public int precioPlazas(int plazas) {
        return plazas * 150;
    }
}