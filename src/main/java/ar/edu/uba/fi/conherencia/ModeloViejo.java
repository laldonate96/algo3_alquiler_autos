package ar.edu.uba.fi.conherencia;

public class ModeloViejo extends Modelo {

    public ModeloViejo(int plazas) {

        super(plazas);
    }

    public Double alquilerPorPlazas() {

        return 100.0 * plazas;
    }

}
