package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {
    public static Map<Integer, Factura> facturas = new HashMap<>();

    public static void guardarFactura(Factura factura) {
        facturas.put(factura.getNumeroFactura(), factura);
    }

    public static Factura buscarFactura(int numeroFactura) {
        return facturas.get(numeroFactura);
    }

    public static Map<Integer, Factura> getFacturas() {
        return facturas;
    }
    
    public static void mostrarFacturas() {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
            return;
        }
        System.out.println("------ LISTA DE FACTURAS ------");
        for (Factura f : facturas.values()) {
            f.mostrarFactura();
            System.out.println("-------------------------------");
        }
    }

    public static double calcularTotalVentas() {
        double totalVentas = 0;
        for (Factura f : facturas.values()) {
            totalVentas += f.getTotal();
        }
        return totalVentas;
    }
}