package ar.edu.uba.fi.interfaces;

public class Auto implements Vehiculo {
    private String unPatenteStr;
    private String unModeloStr;

    public Auto(String unPatenteStr, String unModeloStr) {
        this.unPatenteStr = unPatenteStr;

        this.unModeloStr = unModeloStr;
    }

    @Override
    public boolean sos(String unaPatenteStr) {

        return unaPatenteStr.equals(unaPatenteStr);
    }

    @Override
    public double alquilar(int unosDias) {

        return precioBase(unosDias) + (4 * 100);
    }

    private double precioBase(int unosDias) {

        return unosDias * 500;
    }


}
