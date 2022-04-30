package ar.edu.uba.fi.herencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AlquilerVehiculosTest
{
    @Test
    public void testRegistroCherryQQElCostoDeAlquilerPor1DiaEs900() {
        Agencia a = new Agencia();

        a.registrar( new Auto("abc-123", "Cherry QQ"));
        double valor = a.alquilarDias("abc-123", 1);

        assertEquals(valor, 900);
    }

    @Test
    public void testRegistroCargaElCostoDeAlquilerPor1DiaEs900() {
        Agencia a = new Agencia();

        a.registrar( new Camion("abc-123", 5));
        double valor = a.alquilarDias("abc-123", 1);

        assertEquals(valor, 2000);

    }

    @Test
    public void testRegistroBus() {
        Agencia a = new Agencia();

        a.registrar( new Bus("abc-123"));
        double valor = a.alquilarDias("abc-123", 1);

        assertEquals(valor, 2000);

    }
}
