package ar.edu.uba.fi.inmuebles;

import ar.edu.uba.fi.ProductosAgencia;

public abstract class Inmueble implements ProductosAgencia, Comprable {
    protected String direccion;

    public Inmueble(String direccion) {
        this.direccion = direccion;
    };

    @Override
    public boolean esIgualA(ProductosAgencia unProductosAgencia){
        return unProductosAgencia.tieneMismoIdentificador(this.direccion);
    }
    @Override
    public boolean tieneMismoIdentificador(String direccion){
        return (this.direccion == direccion);
    }

    @Override
    public Double comprar(){
        return 100*100*1.2;
    }
}