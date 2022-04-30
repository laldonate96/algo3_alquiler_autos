package ar.edu.uba.fi.herencia;

public class Camion extends Vehiculo {
    private int pma;

    public Camion(String unaPatenteStr, int pma) {
        super(unaPatenteStr);
        this.pma = pma;
    }

    @Override
    public double alquilar(int unosDias) {


        return precioBase(unosDias) + (300*pma);
    }

    private double precioBase(int unosDias) {


        return unosDias * 500;
    }

}
