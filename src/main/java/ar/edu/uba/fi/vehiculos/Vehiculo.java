package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.tiempo.Tiempo;

public abstract class Vehiculo {
    protected String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public abstract Double alquilar(Tiempo tiempo);

    public boolean esIgualA(Vehiculo unVehiculo){
        return unVehiculo.tieneMismaPatente(this.patente);
    }

    private boolean tieneMismaPatente(String patente){
        return (this.patente == patente);
    }

}
