package ar.edu.uba.fi;

import ar.edu.uba.fi.blindados.Blindado;
import ar.edu.uba.fi.blindados.SinBlindaje;
import ar.edu.uba.fi.categorias.CategoriaNormal;
import ar.edu.uba.fi.categorias.CategoriaPremium;
import ar.edu.uba.fi.excepciones.VehiculoYaRegistradoException;
import ar.edu.uba.fi.pagos.MetodoDePago;
import ar.edu.uba.fi.pagos.TarjetaCredito;
import ar.edu.uba.fi.vehiculos.Camion;
import ar.edu.uba.fi.vehiculos.Coche;
import ar.edu.uba.fi.vehiculos.Furgoneta;
import ar.edu.uba.fi.vehiculos.Microbus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AlquilerVehiculosTest
{
    @Test
    public void test01AlAlquilarUnAutoPor3DiasElPrecioEsElCorrecto() {
        Coche coche = new Coche("abc123", 4, new CategoriaNormal(), new SinBlindaje());

        Double valor = coche.alquilarPorDias(3);

        assertEquals(( 500 + (4*100) ) * 3 , valor);
    }

    @Test
    public void test02AlAlquilarUnAutoPremiumPor3DiasElPrecioEsElCorrecto() {
        Coche coche = new Coche("abc123", 4, new CategoriaPremium(), new SinBlindaje());

        Double valor = coche.alquilarPorDias(3);

        assertEquals(( 500 + (4*150) ) * 3 , valor);
    }

    @Test
    public void test03AlAlquilarUnAutoBlindadoPor3DiasElPrecioEsElCorrecto() {
        Coche coche = new Coche("abc123", 4, new CategoriaNormal(), new Blindado());

        Double valor = coche.alquilarPorDias(3);

        assertEquals((( 500 + (4*100) ) * 3)*1.15 , valor);
    }

    @Test
    public void test04AlAlquilarUnCamionPor3DiasElPrecioEsElCorrecto() {
        Camion camion = new Camion("abc123");

        Double valor = camion.alquilarPorDias(3);

        assertEquals(30000.0 , valor);
    }

    @Test
    public void test05AlAlquilarUnaFurgonetaPor3DiasElPrecioEsElCorrecto() {
        Furgoneta furgoneta = new Furgoneta("abc123", 3.2);

        Double valor = furgoneta.alquilarPorDias(3);

        assertEquals(((300* 3.2 ) + 500 )*3 , valor);
    }

    @Test
    public void test06AlAlquilarUnMicrobusPor3DiasElPrecioEsElCorrecto() {
        Microbus microbus = new Microbus("abc123");

        Double valor = microbus.alquilarPorDias(3);

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
        agencia.registrarAlquiler(cliente, microbus, 3);
        agencia.registrarAlquiler(cliente, camion, 3);

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
        agencia.registrarAlquiler(cliente, microbus, 3);
        agencia.registrarAlquiler(cliente, camion, 3);
        agencia.registrarAlquiler(cliente2, microbus, 3);
        agencia.registrarAlquiler(cliente2, camion, 3);
        agencia.registrarAlquiler(cliente2, camion, 3);

        Double precioEsperado = Double.valueOf((((1500*3) + 500 + 30000) * 2) + 30000);

        Double precioObtenido = agencia.calcularAlquilerTotal();

        assertEquals(precioObtenido , precioEsperado);
    }

    @Test
    public void test10AlPagarElSegundoAlquilerElPrecioDeLosAlquilerestotalesBajan() {
        Agencia agencia = new Agencia();
        Microbus microbus = new Microbus("abc123");
        MetodoDePago metodoDePago = new TarjetaCredito("1234567", 15000);
        Cliente cliente = new Cliente("Diego", metodoDePago);


        agencia.registrarVehiculo(microbus);
        agencia.registrarCliente(cliente);
        agencia.registrarAlquiler(cliente, microbus, 3);
        agencia.registrarAlquiler(cliente, microbus, 2);


        Double precioEsperadoPre = Double.valueOf(8500);
        Double precioObtenidoPrePago = cliente.calcularPrecioAlquileres();

        cliente.pagarAlquiler(2);

        Double precioEsperadoPost = Double.valueOf(5000);
        Double precioObtenidoPostPago = cliente.calcularPrecioAlquileres();

        assertEquals(precioEsperadoPre,precioObtenidoPrePago);
        assertEquals(precioObtenidoPostPago , precioEsperadoPost);
    }
}
