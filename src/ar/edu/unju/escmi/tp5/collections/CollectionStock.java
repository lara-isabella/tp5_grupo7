package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionStock {
    public static Map<Producto, Integer> stock = new HashMap<>();

    public static void agregarProducto(Producto producto, int cantidad) {
        stock.put(producto, cantidad);
    }

    public static void actualizarStock(Producto producto, int cantidadVendida) {
        if (stock.containsKey(producto)) {
            int actual = stock.get(producto);
            stock.put(producto, actual - cantidadVendida);
        }
    }

    public static int verificarStock(Producto producto) {
        return stock.getOrDefault(producto, 0);
    }

    public static void mostrarStock() {
        for (Map.Entry<Producto, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey().getDescripcion() + " -> " + entry.getValue() + " unidades");
        }
    }
}
