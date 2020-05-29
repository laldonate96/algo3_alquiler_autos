package ar.edu.uba.fi.coninterfaces;

public class ModeloViejo implements Modelo, Presentador {
    private int modelo;
    private int plazas;

    public ModeloViejo(int modelo, int plazas) {

        this.modelo = modelo;
        this.plazas = plazas;
    }

    public Double alquilerPorPlazas() {

        return 100.0 * plazas;
    }

    public String mostrarComoString(String s) {

        return s.concat(Integer.valueOf(modelo).toString());
    }
}
