package ar.edu.uba.fi.herencia;

public abstract class Vehiculo {

    private String unaPatenteStr;

    public Vehiculo(String unaPatenteStr) {

        this.unaPatenteStr = unaPatenteStr;
    }

    boolean sos(String unaPatenteStr) {

        return unaPatenteStr.equals(unaPatenteStr);
    };

    abstract double alquilar(int unosDias);

    public boolean sos(Vehiculo vehiculo) {
        return this.unaPatenteStr.equals(vehiculo.unaPatenteStr);
    }
}
