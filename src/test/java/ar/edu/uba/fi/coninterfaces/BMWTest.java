package ar.edu.uba.fi.coninterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMWTest {
    @Test
    public void unBMWComoString() {

        BMW auto2018 = new BMW(2018, 5);
        BMW auto2016 = new BMW(2016, 5);

        assertEquals("BMW - 2018", auto2018.representateComoString());
        assertEquals("BMW - 2016", auto2016.representateComoString());
    }


}
