package ar.edu.uba.fi.facturador;

import ar.edu.uba.fi.Alquiler;
import ar.edu.uba.fi.Cliente;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FacturadorA implements Facturador {
    @Override
    public void emitirFactura(Cliente unCliente, Alquiler unAlquiler) {
        try {
            String nombreArchivo = "facturaA.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write("************************************\n");
            writer.write("      FACTURA A DE ALQUILER         \n");
            writer.write("************************************\n");
            writer.write("Cliente: " + unCliente.getNombre() + "\n");
            writer.write("************************************\n");
            writer.write("DATOS DEL EMISOR: ALGO3 SRL\n");
            writer.write("CUIL: 20-402130213-7\n");
            writer.write("************************************\n");
            writer.write("Vehículo alquilado: " + unAlquiler.nombreDelVehiculo() + "\n");
            writer.write("Días alquilados: " + unAlquiler.dias() + "\n");
            writer.write("************************************\n");
            writer.write("TOTAL: $" + unAlquiler.calcularPrecio() + "\n");
            writer.write("************************************\n");
            writer.close();
            System.out.println("Factura generada correctamente en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
