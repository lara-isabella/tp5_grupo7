package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {

    public static Map<Integer, Factura> facturas = new HashMap<>();

    public static void guardarFactura(Factura factura) {
        facturas.put(factura.getNroFactura(), factura);
    }

    public static Factura buscarFactura(int nroFactura) {
        return facturas.get(nroFactura);
    }

    public static double calcularTotalVentas() {
        double total = 0.0;
        for (Factura f : facturas.values()) {
            total += f.getTotal();
        }
        return total;
    }

    public static void mostrarFacturas() {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
            return;
        }
        for (Factura f : facturas.values()) {
            f.mostrarFactura();
        }
    }
}