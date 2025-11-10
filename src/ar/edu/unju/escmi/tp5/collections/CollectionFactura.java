package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {

    public static List<Factura> facturas = new ArrayList<>();

    public static Factura guardarFactura(Factura factura) {
        facturas.add(factura);
        System.out.println("Factura guardada correctamente. Número: " + factura.getNroFactura());
        return factura;
    }

    public static Factura buscarFactura(int numeroFactura) {
        for (Factura f : facturas) {
            if (f.getNroFactura() == numeroFactura) {
                return f;
            }
        }
        return null;
    }

    public static void mostrarFacturas() {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
            return;
        }

        System.out.println("------ LISTA DE FACTURAS ------");
        for (Factura f : facturas) {
            f.mostrarFactura();
            System.out.println("-------------------------------");
        }
    }

    public static double calcularTotalVentas() {
        double totalVentas = 0;
        for (Factura f : facturas) {
            totalVentas += f.getTotal();
        }
        return totalVentas;
    }
}