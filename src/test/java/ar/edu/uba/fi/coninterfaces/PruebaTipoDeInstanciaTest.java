package ar.edu.uba.fi.coninterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaTipoDeInstanciaTest {

    @Test
    public void acercaDelModelo() {
        ModeloViejo modelo = new ModeloViejo(2015, 5);

        Presentador a = modelo;
        Modelo b = modelo;

        // Solo a los efectos de mostrar el tipo de la instancia
        assertEquals(a.getClass(), ModeloViejo.class);
        assertEquals(b.getClass(), ModeloViejo.class);

        assertEquals("BMW - 2015", a.mostrarComoString("BMW - "));
    }


}
