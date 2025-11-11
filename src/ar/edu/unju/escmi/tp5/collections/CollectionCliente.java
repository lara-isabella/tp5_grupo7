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
            clientes.put(123, new ClienteMinorista("Lautaro", "Cari", "El Cardenal 528", 47545205, "Galeno"));
            clientes.put(321, new ClienteMayorista("Joaquin", "Sarapura", "Los Manantiales 891", 47545211, 100));
        }
    }
}