package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {

    // Atributo estático: lista de facturas
    private static List<Factura> facturas = new ArrayList<>();

    // Guarda una factura y la devuelve
    public static Factura guardarFactura(Factura factura) {
        facturas.add(factura);
        System.out.println("Factura guardada correctamente. Número: " + factura.getNumero());
        return factura;
    }

    // Busca una factura por número
    public static Factura buscarFactura(int numeroFactura) {
        for (Factura f : facturas) {
            if (f.getNumero() == numeroFactura) {
                return f;
            }
        }
        return null;
    }

    // Muestra todas las facturas registradas
    public static void mostrarFacturas() {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
            return;
        }

        System.out.println("------ LISTA DE FACTURAS ------");
        for (Factura f : facturas) {
            f.mostrarFactura(); // método que debe existir en Factura
            System.out.println("-------------------------------");
        }
    }

    // Calcula el total de todas las ventas (sumatoria de los totales de cada factura)
    public static double calcularTotalVentas() {
        double totalVentas = 0;
        for (Factura f : facturas) {
            totalVentas += f.getTotal(); // el atributo total debe estar en Factura
        }
        return totalVentas;
    }
}
