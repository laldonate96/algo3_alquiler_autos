package ar.edu.uba.fi.conherencia;

public class BMW implements Vehiculo {
    private Modelo modelo;

    public BMW(int modelo, int plazas) {

        if (modelo > 2016) {
            ModeloNuevo unModeloTemporal = new ModeloNuevo(plazas);
            this.modelo = unModeloTemporal;
        } else {

            ModeloViejo unModeloTemporal = new ModeloViejo(plazas);
            this.modelo = unModeloTemporal;
        }
    }

    public Double alquilarPor(int cantidadDias) {

        return alquilerBase(cantidadDias) + this.modelo.alquilerPorPlazas();
    }

    private Double alquilerBase(int cantidadDias) {

        return 500.0 * cantidadDias;

    }

}
