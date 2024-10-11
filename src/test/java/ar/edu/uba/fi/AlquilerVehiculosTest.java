package ar.edu.uba.fi;

import ar.edu.uba.fi.blindados.Blindado;
import ar.edu.uba.fi.blindados.SinBlindaje;
import ar.edu.uba.fi.categorias.CategoriaNormal;
import ar.edu.uba.fi.categorias.CategoriaPremium;
import ar.edu.uba.fi.excepciones.VehiculoYaRegistradoException;
import ar.edu.uba.fi.tiempo.Tiempo;
import ar.edu.uba.fi.vehiculos.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AlquilerVehiculosTest
{
    private Tiempo tiempo1 = new Tiempo(3, 0);
    private Tiempo tiempo2 = new Tiempo(0, 3);


    @Test
    public void test01AlAlquilarUnAutoPor3DiasElPrecioEsElCorrecto() {
        Coche coche = new Coche("abc123", 4, new CategoriaNormal(), new SinBlindaje());

        Double valor = coche.alquilar(tiempo1);

        assertEquals(( 500 + (4*100) ) * 3 , valor);
    }

    @Test
    public void test02AlAlquilarUnAutoPremiumPor3DiasElPrecioEsElCorrecto() {
        Coche coche = new Coche("abc123", 4, new CategoriaPremium(), new SinBlindaje());

        Double valor = coche.alquilar(tiempo1);

        assertEquals(( 500 + (4*150) ) * 3 , valor);
    }

    @Test
    public void test03AlAlquilarUnAutoBlindadoPor3DiasElPrecioEsElCorrecto() {
        Coche coche = new Coche("abc123", 4, new CategoriaNormal(), new Blindado());

        Double valor = coche.alquilar(tiempo1);

        assertEquals((( 500 + (4*100) ) * 3)*1.15 , valor);
    }

    @Test
    public void test04AlAlquilarUnCamionPor3DiasElPrecioEsElCorrecto() {
        Camion camion = new Camion("abc123");

        Double valor = camion.alquilar(tiempo1);

        assertEquals(30000.0 , valor);
    }

    @Test
    public void test05AlAlquilarUnaFurgonetaPor3DiasElPrecioEsElCorrecto() {
        Furgoneta furgoneta = new Furgoneta("abc123", 3.2);

        Double valor = furgoneta.alquilar(tiempo1);

        assertEquals(((300* 3.2 ) + 500 )*3 , valor);
    }

    @Test
    public void test06AlAlquilarUnMicrobusPor3DiasElPrecioEsElCorrecto() {
        Microbus microbus = new Microbus("abc123");


        Double valor = microbus.alquilar(tiempo1);

        assertEquals((1500 * 3) + 500 , valor);
    }

    @Test
    public void test07AlRegistrarUnVehiculoConUnaPatenteYaRegistradaSeLanzaExcepcion() {
        Agencia agencia = new Agencia();
        Microbus microbus = new Microbus("abc123");
        Camion camion = new Camion("abc123");
        agencia.registrarVehiculo(microbus);

        assertThrows(VehiculoYaRegistradoException.class, () -> {agencia.registrarVehiculo(camion);});
    }

    @Test
    public void test08AlPedirLosAlquileresDeUnClienteDaElPrecioCorrecto() {
        Agencia agencia = new Agencia();
        Microbus microbus = new Microbus("abc123");
        Camion camion = new Camion("abc1234");
        Cliente cliente = new Cliente("Diego");

        agencia.registrarVehiculo(microbus);
        agencia.registrarVehiculo(camion);
        agencia.registrarCliente(cliente);
        agencia.registrarAlquiler(cliente, microbus, tiempo1);
        agencia.registrarAlquiler(cliente, camion, tiempo1);

        Double precioEsperado = Double.valueOf((1500*3) + 500 + 30000);

        Double precioObtenido = agencia.calcularAlquilerParaCliente(cliente);

        assertEquals(precioObtenido , precioEsperado);
    }

    @Test
    public void test09AlPedirLosAlquileresTotalesDaElPrecioCorrecto() {
        Agencia agencia = new Agencia();
        Microbus microbus = new Microbus("abc123");
        Camion camion = new Camion("abc1234");
        Cliente cliente = new Cliente("Diego");
        Cliente cliente2 = new Cliente("Santi");

        agencia.registrarVehiculo(microbus);
        agencia.registrarVehiculo(camion);
        agencia.registrarCliente(cliente);
        agencia.registrarCliente(cliente2);
        agencia.registrarAlquiler(cliente, microbus, tiempo1);
        agencia.registrarAlquiler(cliente, camion, tiempo1);
        agencia.registrarAlquiler(cliente2, microbus, tiempo1);
        agencia.registrarAlquiler(cliente2, camion, tiempo1);
        agencia.registrarAlquiler(cliente2, camion, tiempo1);

        Double precioEsperado = Double.valueOf((((1500*3) + 500 + 30000) * 2) + 30000);

        Double precioObtenido = agencia.calcularAlquilerTotal();

        assertEquals(precioObtenido , precioEsperado);
    }

    @Test
    public void test10AlAlquilarunaBicicletaPor3HorasElPrecioEsElCorrecto() {
        Bicicleta microbus = new Bicicleta("abc123");


        Double valor = microbus.alquilar(tiempo2);

        assertEquals((1200 * 3) , valor);
    }

    // Que pasa con este test???
    @Disabled
    @Test
    public void test11AlAlquilarunaBicicletaPor3HorasElPrecioEsElCorrecto() {
        Bicicleta microbus = new Bicicleta("abc123");

        Double valor = microbus.alquilar(tiempo2);

        assertEquals((1200 * 3) , valor);
    }
}
