package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionStock {
    public static Map<Producto, Integer> stock = new HashMap<>();

    // Agrega un producto al control de stock y sincroniza el campo stock
    // del objeto Producto para mantener una referencia rápida en el objeto.
    public static void agregarProducto(Producto producto, int cantidad) {
        stock.put(producto, cantidad);
        // Mantener sincronizado el stock en el objeto Producto
        producto.setStock(cantidad);
    }

    public static void actualizarStock(Producto producto, int cantidadVendida) {
    if (stock.containsKey(producto)) {
        int actual = stock.get(producto);
        if (cantidadVendida > 0 && cantidadVendida <= actual) {
            int nuevo = actual - cantidadVendida;
            stock.put(producto, nuevo);
            producto.setStock(nuevo);
        } else {
            System.out.println("Stock insuficiente o cantidad inválida.");
        }
    } else {
        System.out.println("Producto no encontrado en el stock.");
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
