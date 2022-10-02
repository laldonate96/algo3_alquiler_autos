package ar.edu.uba.fi.herencia;

public class Auto extends Vehiculo {
    private Integer numeroPlazas;
    private TipoPlaza tipoPlazas;

    public Auto(String unPatenteStr, Integer numeroPlazas, TipoPlaza tipoPlazas) {

        super(unPatenteStr);
        this.numeroPlazas = numeroPlazas;
        this.tipoPlazas = tipoPlazas;
    }

    public double alquilar(int unosDias) {

        return precioBase(unosDias) + tipoPlazas.alquilar(numeroPlazas);
    }

    private double precioBase(int unosDias) {

        return unosDias * 500;
    }


}
