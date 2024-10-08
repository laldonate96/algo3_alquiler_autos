package ar.edu.uba.fi.facturador;

import ar.edu.uba.fi.Alquiler;
import ar.edu.uba.fi.Cliente;

public interface Facturador {
    void emitirFactura(Cliente unCliente, Alquiler unAlquiler);
}
