package ar.edu.uba.fi;

import ar.edu.uba.fi.excepciones.*;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<ProductosAgencia> productosAgencias = new ArrayList<ProductosAgencia>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void registrar(ProductosAgencia unProductosAgencia) {
        for(ProductosAgencia productosAgencia : productosAgencias){
            if(productosAgencia.esIgualA(unProductosAgencia)){
                throw new AlquilableYaRegistradoException();
            }
        }
        productosAgencias.add(unProductosAgencia);
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

    public void registrarAlquiler(Cliente unCliente, ProductosAgencia unProductosAgencia, int dias) {
        Cliente cliente = buscarCliente(unCliente);
        ProductosAgencia productosAgencia = buscarAlquilable(unProductosAgencia);

        cliente.registrarAlquiler(productosAgencia, dias);
    }

    private ProductosAgencia buscarAlquilable(ProductosAgencia unProductosAgencia) {
        for(ProductosAgencia productosAgencia : productosAgencias){
            if(productosAgencia.esIgualA(unProductosAgencia)){
                return productosAgencia;
            }
        }
        throw new AlquilableNoRegistradoException();
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
}
