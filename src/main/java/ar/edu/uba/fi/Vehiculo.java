package ar.edu.uba.fi;

public abstract class Vehiculo {
    protected String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public abstract Double alquilarPorDias(int dias);

    public boolean esIgualA(Vehiculo unVehiculo){
        return unVehiculo.tieneMismaPatente(this.patente);
    }

    private boolean tieneMismaPatente(String patente){
        return (this.patente == patente);
    }
}
