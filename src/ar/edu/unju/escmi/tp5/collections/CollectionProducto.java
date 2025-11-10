package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionProducto {
    public static Map<Integer, Producto> productos = new HashMap<>();

    public static void guardarProducto(Producto producto) {
        productos.put(producto.getCodigoProducto(), producto);
    }

    public static Producto buscarProductoPorCodigo(int codigoProducto) {
        return productos.get(codigoProducto);
    }

    public static void precargarProducto() {
        if (productos.isEmpty()) {
            productos.put(1001, new Producto(1001, "Fideo Knorr Spaghetti x 500 gr.", 1200.00, 0, 5000));
            productos.put(1002, new Producto(1002, "Arroz Gallo x 1kg", 900.00, 25, 3000));
            productos.put(1003, new Producto(1003, "Aceite 1L", 3500.00, 30, 1500));
            productos.put(1004, new Producto(1004, "Pan de molde 500g", 650.00, 0, 800));
        }
    }

    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados.");
            return;
        }
        System.out.println("----- LISTA DE PRODUCTOS -----");
        for (Producto p : productos.values()) {
            p.mostrarProducto();
        }
    }
}