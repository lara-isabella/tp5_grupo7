package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {
    public static List<Factura> facturas = new ArrayList<>();

    public static void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public static Factura buscarFactura(int numero) {
        for (Factura f : facturas) {
            if (f.getNumero() == numero) {
                return f;
            }
        }
        return null;
    }

    public static void mostrarFacturas() {
        for (Factura f : facturas) {
            f.mostrarFactura();
        }
    }

    public static double calcularTotalVentas() {
        double total = 0;
        for (Factura f : facturas) {
            total += f.calcularTotal();
        }
        return total;
    }
}
