package ar.edu.uba.fi.coninterfaces;

public class BMW implements Vehiculo {
    private Modelo modelo;
    private Presentador presentador;

    public BMW(int modelo, int plazas) {

        if (modelo > 2016) {
            ModeloNuevo unModeloTemporal = new ModeloNuevo(modelo, plazas);
            this.modelo = unModeloTemporal;
            this.presentador = unModeloTemporal;
        } else {
            ModeloViejo unModeloTemporal = new ModeloViejo(modelo, plazas);
            this.modelo = unModeloTemporal;
            this.presentador = unModeloTemporal;
        }
    }

    public Double alquilarPor(int cantidadDias) {

        return alquilerBase(cantidadDias) + this.modelo.alquilerPorPlazas();
    }

    private Double alquilerBase(int cantidadDias) {


        return 500.0 * cantidadDias;

    }

    public String representateComoString() {
        return this.presentador.mostrarComoString("BMW - ");
    }
}
