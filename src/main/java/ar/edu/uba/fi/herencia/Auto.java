package ar.edu.uba.fi.herencia;

public class Auto extends Vehiculo {
    private String unModeloStr;

    public Auto(String unPatenteStr, String unModeloStr) {

        super(unPatenteStr);
        this.unModeloStr = unModeloStr;
    }

    public double alquilar(int unosDias) {

        return precioBase(unosDias) + (4 * 100);
    }

    private double precioBase(int unosDias) {

        return unosDias * 500;
    }


}
