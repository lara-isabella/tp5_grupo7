package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Cliente;

public class CollectionCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    public static void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Buscar cliente por código (nuevo comportamiento solicitado)
    public static Cliente buscarCliente(int codigoCliente) {
        for (Cliente c : clientes) {
            if (c.getCodigoCliente() == codigoCliente) {
                return c;
            }
        }
        return null;
    }

    // Mantener búsqueda por nombre si se necesita en otros lugares
    public static Cliente buscarCliente(String nombre) {
        for (Cliente c : clientes) {
            if (c.getNombre() != null && c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public static void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println("- " + c.getNombre() + " (Código: " + c.getCodigoCliente() + ")");
        }
    }
}
