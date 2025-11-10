package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionProducto {

    // Atributo público y estático según la consigna/diagrama
    public static List<Producto> productos = new ArrayList<>();

    // Guarda (agrega) un producto a la colección
    public static void guardarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto guardado: " + producto.getDescripcion());
    }

    // Busca un producto por su código y lo devuelve (o null si no existe)
    public static Producto buscarProducto(int codigoProducto) {
        for (Producto p : productos) {
            if (p.getCodigoProducto() == codigoProducto) {
                return p;
            }
        }
        return null;
    }

    // Precarga algunos productos de ejemplo (útil para pruebas)
    public static void precargarProductos() {
        // Evitar duplicados si ya se precargaron
        if (!productos.isEmpty()) return;

        productos.add(new Producto(1001, "Fideo Knorr Spaghetti x 500 gr.", 1200.00, 0, 5000));
        productos.add(new Producto(1002, "Arroz Gallo x 1kg", 900.00, 25, 3000));
        productos.add(new Producto(1003, "Aceite 1L", 3500.00, 30, 1500));
        productos.add(new Producto(1004, "Pan de molde 500g", 650.00, 0, 800));
        System.out.println("Precarga de productos realizada. Total productos: " + productos.size());
    }

    // Muestra todos los productos cargados
    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados.");
            return;
        }
        System.out.println("----- LISTA DE PRODUCTOS -----");
        for (Producto p : productos) {
            p.mostrarProducto();
        }
    }
}
