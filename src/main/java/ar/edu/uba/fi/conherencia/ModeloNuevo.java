package ar.edu.uba.fi.conherencia;

public class ModeloNuevo extends Modelo {

    public ModeloNuevo(int plazas) {

        super(plazas);
    }

    public Double alquilerPorPlazas() {

        return 150.0 * plazas;
    }

}
