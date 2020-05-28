package ar.edu.uba.fi;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AlquilerVehiculosTest
{
    @Test
    public void unClienteAlquilaUnBMWConCincoPlazasModelo2018DuranteDosDias() {
        BMW auto = new BMW(new Patente("ABC", 123), 2018, 5);

        Double valor = auto.alquilarPor(2);

        assertEquals((500 * 2) + (150 * 5), valor);
    }

    @Test
    public void unClienteAlquilaUnCamionConPMAMilUnosDiezDias() {
        Camion vehiculo = new Camion(new Patente("ABC", 123), 1000);

        Double valor = vehiculo.alquilarPor(10);

        assertEquals((500 + (300 * 1000)) * 10, valor);
    }
}
