package ar.edu.uba.fi.interfaces;

public class Camion implements Vehiculo {
    private String unaPatenteStr;
    private int pma;

    public Camion(String unaPatenteStr, int pma) {
        this.unaPatenteStr = unaPatenteStr;
        this.pma = pma;
    }

    @Override
    public boolean sos(String unaPatenteStr) {
        return unaPatenteStr.equals(unaPatenteStr);
    }

    @Override
    public double alquilar(int unosDias) {


        return precioBase(unosDias) + (300*pma);
    }

    private double precioBase(int unosDias) {


        return unosDias * 500;
    }

}
