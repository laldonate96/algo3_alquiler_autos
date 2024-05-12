package ar.edu.uba.fi.categorias;

public class CategoriaNormal implements Categoria {
    @Override
    public int precioPlazas(int plazas) {
        return plazas * 100;
    }
}
