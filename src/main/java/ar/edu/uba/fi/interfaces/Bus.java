package ar.edu.uba.fi.interfaces;

public class Bus implements Vehiculo {
    private String unaPatenteStr;

    public Bus(String unaPatenteStr) {

        this.unaPatenteStr = unaPatenteStr;
    }

    @Override
    public boolean sos(String unaPatenteStr) {

        return this.unaPatenteStr.equals(unaPatenteStr);
    }

    @Override
    public double alquilar(int unosDias) {

        return 1500 * unosDias + 500;
    }
}
