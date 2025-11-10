package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unju.escmi.tp5.dominio.Cliente;
import ar.edu.unju.escmi.tp5.dominio.ClienteMayor;
import ar.edu.unju.escmi.tp5.dominio.ClienteMenor;

public class CollectionCliente {

    private static Map<Integer, Cliente> clientes = new HashMap<>();

    public static Cliente buscarCliente(int codigoCliente) {
        return clientes.get(codigoCliente);
    }

    public static void agregarCliente(Cliente cliente) {
        clientes.put(cliente.getDni(), cliente);
    }

    public static void mostrarClientes() {
        for (Cliente cliente : clientes.values()) {
            // mostrarDatos debe devolver un String
            System.out.println(cliente.mostrarDatos());
        }
    }

    public static void precargarClientes() {
        clientes.put(3105,
                new ClienteMayor("Luciana", "Mamani", "Barrio Alto Comedero 123", 3105, 800));
        clientes.put(7821,
                new ClienteMenor("Thiago", "Quispe", "Calle San Martín 456", 7821, "OSDE"));
    }
}
