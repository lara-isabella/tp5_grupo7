package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionProducto {
    public static Map<Integer, Producto> productos = new HashMap<>();

    public static void guardarProducto(Producto producto) {
        productos.put(producto.getCodigoProducto(), producto);
    }

    public static Producto buscarProducto(int codigoProducto) {
        return productos.get(codigoProducto);
    }

    public static void precargarProducto() {
        productos.put(100, new Producto(100, "Papas Lays 50g", 2000.0, 0));
        productos.put(101, new Producto(101, "Azúcar Ledesma 1kg", 1400.0, 0));
        productos.put(102, new Producto(102, "Aceite Cocinero 1lt", 3000.0, 0));
        productos.put(103, new Producto(103, "Queso Tybo en fetas", 2600.0, 15));
        productos.put(104, new Producto(104, "CocaCola 375ml", 1500.0, 0));
        productos.put(105, new Producto(105, "Fideo Moñito Lucchetti", 1500.0, 30));
    }
}