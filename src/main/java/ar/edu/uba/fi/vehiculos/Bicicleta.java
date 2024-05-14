package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.excepciones.BicicletaNoSeAlquilaPorDiasException;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String patente) {
        super(patente);
    }

    @Override
    public Double alquilarPorDias(int dias) {
        throw new BicicletaNoSeAlquilaPorDiasException();
    }


    public Double alquilerPorHoras(int horas) {
        return (double) (horas * 1200);
    }
}
