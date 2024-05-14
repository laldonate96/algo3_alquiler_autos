package ar.edu.uba.fi;

import ar.edu.uba.fi.excepciones.ClienteNoRegistradoException;
import ar.edu.uba.fi.excepciones.VehiculoNoRegistradoException;
import ar.edu.uba.fi.excepciones.VehiculoYaRegistradoException;
import ar.edu.uba.fi.vehiculos.Vehiculo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Agencia {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void registrarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                throw new VehiculoYaRegistradoException();
            }
        }
        vehiculos.add(unVehiculo);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Double calcularAlquilerParaCliente(Cliente unCliente) {
        for (Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente.calcularPrecioAlquileres();
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public void registrarAlquiler(Cliente unCliente, Vehiculo unVehiculo, int dias) {
        Cliente cliente = buscarCliente(unCliente);
        Vehiculo vehiculo = buscarVehiculo(unVehiculo);

        cliente.registrarAlquiler(vehiculo, dias);
    }

    private Vehiculo buscarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                return vehiculo;
            }
        }
        throw new VehiculoNoRegistradoException();
    }

    private Cliente buscarCliente(Cliente unCliente) {
        for(Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente;
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public Double calcularAlquilerTotal() {
        double suma = 0;
        for(Cliente cliente: clientes){
            suma += cliente.calcularPrecioAlquileres();
        }
        return suma;
    }

    public void emitirFacturaA(Cliente unCliente){
        try {
            String nombreArchivo = "facturaA.txt";
            Cliente cliente = this.buscarCliente(unCliente);
            Alquiler ultimoAlquiler = cliente.obtenerUltimoAlquiler();
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write("************************************\n");
            writer.write("      FACTURA A DE ALQUILER         \n");
            writer.write("************************************\n");
            writer.write("Cliente: " + cliente.getNombre() + "\n");
            writer.write("************************************\n");
            writer.write("DATOS DEL EMISOR: ALGO3 SRL\n");
            writer.write("CUIL: 20-402130213-7\n");
            writer.write("************************************\n");
            writer.write("Vehículo alquilado: " + ultimoAlquiler.nombreDelVehiculo() + "\n");
            writer.write("Días alquilados: " + ultimoAlquiler.dias() + "\n");
            writer.write("************************************\n");
            writer.write("TOTAL: $" + ultimoAlquiler.calcularPrecio() + "\n");
            writer.write("************************************\n");
            writer.close();
            System.out.println("Factura generada correctamente en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void emitirFacturaB(Cliente unCliente){
        try {
            String nombreArchivo = "facturaB.txt";
            Cliente cliente = this.buscarCliente(unCliente);
            Alquiler ultimoAlquiler = cliente.obtenerUltimoAlquiler();
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write("************************************\n");
            writer.write("      FACTURA B DE ALQUILER         \n");
            writer.write("************************************\n");
            writer.write("Cliente: " + cliente.getNombre() + "\n");
            writer.write("************************************\n");
            writer.write("Vehículo alquilado: " + ultimoAlquiler.nombreDelVehiculo() + "\n");
            writer.write("Días alquilados: " + ultimoAlquiler.dias() + "\n");
            writer.write("************************************\n");
            writer.write("TOTAL: $" + ultimoAlquiler.calcularPrecio() + "\n");
            writer.write("************************************\n");
            writer.close();
            System.out.println("Factura generada correctamente en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void emitirFacturaC(Cliente unCliente){
        try {
            String nombreArchivo = "facturaC.txt";
            Cliente cliente = this.buscarCliente(unCliente);
            Alquiler ultimoAlquiler = cliente.obtenerUltimoAlquiler();
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write("************************************\n");
            writer.write("      FACTURA C DE ALQUILER         \n");
            writer.write("************************************\n");
            writer.write("Vehículo alquilado: " + ultimoAlquiler.nombreDelVehiculo() + "\n");
            writer.write("Días alquilados: " + ultimoAlquiler.dias() + "\n");
            writer.write("************************************\n");
            writer.write("TOTAL: $" + ultimoAlquiler.calcularPrecio() + "\n");
            writer.write("************************************\n");
            writer.close();
            System.out.println("Factura generada correctamente en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
