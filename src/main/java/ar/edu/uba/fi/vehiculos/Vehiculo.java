package ar.edu.uba.fi.vehiculos;

import ar.edu.uba.fi.ProductosAgencia;

public abstract class Vehiculo implements ProductosAgencia, Manejable {
    protected String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public abstract Double alquilarPorDias(int dias);

    public boolean esIgualA(ProductosAgencia unProductosAgencia){
        return unProductosAgencia.tieneMismoIdentificador(this.patente);
    }

    public boolean tieneMismoIdentificador(String patente){
        return (this.patente == patente);
    }

    @Override
    public Double manejar(){
        return 10*10*1.1;
    }

}
