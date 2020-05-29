package ar.edu.uba.fi.coninterfaces;

public class ModeloNuevo implements Modelo, Presentador {
    private int modelo;
    private int plazas;

    public ModeloNuevo(int modelo, int plazas) {

        this.modelo = modelo;
        this.plazas = plazas;
    }

    public Double alquilerPorPlazas() {

        return 150.0 * plazas;
    }

    public String mostrarComoString(String s) {

        return s.concat(Integer.valueOf(modelo).toString());

    }
}
