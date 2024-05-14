package ar.edu.uba.fi;

import ar.edu.uba.fi.excepciones.SaldoInsuficienteError;

public class TarjetaCredito {
    private String cbu;
    private int saldo;

    public TarjetaCredito(String cbu, int saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
    }

    public void descontarSaldo(double monto){
        if (monto > this.saldo){
            throw new SaldoInsuficienteError();
        }
        this.saldo -= monto;
    }
}
