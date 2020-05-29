package ar.edu.uba.fi.conherencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AlquilerVehiculosConHerenciaTest {
    @Test
    public void unClienteAlquilaUnBMWConCincoPlazasModelo2018DuranteDosDias() {
        BMW auto = new BMW(2018, 5);

        Double valor = auto.alquilarPor(2);

        assertEquals((500 * 2) + (150 * 5), valor);
    }

    @Test
    public void unClienteAlquilaUnBMWConCincoPlazasModelo2015DuranteDosDias() {
        BMW auto = new BMW(2015, 5);

        Double valor = auto.alquilarPor(2);

        assertEquals((500 * 2) + (100 * 5), valor);
    }

    @Test
    public void unClienteAlquilaUnCamionConPMAMilUnosDiezDias() {
        Camion vehiculo = new Camion(1000);

        Double valor = vehiculo.alquilarPor(10);

        assertEquals((500 + (300 * 1000)) * 10, valor);
    }

}
