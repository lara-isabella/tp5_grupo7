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
            clientes.put(123, new ClienteMayorista("Carlos", "Suarez", "Av. Siempre Viva 123", 123, 1001));
            clientes.put(456, new ClienteMinorista("Ana", "Ramirez", "Calle Belgrano 456", 456, "PAMI"));
        }
    }
    
    public static void mostrarClientes() {
        for (Cliente cliente : clientes.values()) {
            System.out.println(cliente.mostrarDatos());
        }
    }
}