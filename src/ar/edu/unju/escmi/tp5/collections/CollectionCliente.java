package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unju.escmi.tp5.dominio.Cliente;
import ar.edu.unju.escmi.tp5.dominio.ClienteMayorista;
import ar.edu.unju.escmi.tp5.dominio.ClienteMinorista;

public class CollectionCliente {

    public static Map<Integer, Cliente> clientes = new HashMap<>();

    public static void guardarCliente(Cliente cliente) {
        clientes.put(cliente.getDni(), cliente);
    }

    public static Cliente buscarCliente(int dni) {
        return clientes.get(dni);
    }

    public static void precargarCliente() {
        if (clientes.isEmpty()) {
            clientes.put(40123456, new ClienteMinorista("Juan", "Perez", "Av. Siempre Viva 123", 40123456, "Osplad"));
            clientes.put(30987654, new ClienteMayorista("Maria", "Lopez", "Calle Falsa 456", 30987654, 500));
        }
    }
}