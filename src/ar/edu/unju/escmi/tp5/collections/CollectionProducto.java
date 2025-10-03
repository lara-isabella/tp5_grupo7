package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionProducto {

    //Colección estática de productos (Map: código -> producto)
    public static Map<Integer, Producto> productos = new HashMap<>();

    //Guardar un producto en la colección
    public static void guardarProducto(Producto producto) {
        productos.put(producto.getCodigoProducto(), producto);
    }

    //Buscar un producto por código
    public static Producto buscarProducto(int codigoProducto) {
        return productos.get(codigoProducto);
    }

    //Mostrar todos los productos
    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados.");
            return;
        }
        for (Producto p : productos.values()) {
            p.mostrarProducto();
            System.out.println("---------------------");
        }
    }

    //Actualizar stock de un producto
    public static void actualizarStock(int codigoProducto, int cantidadVendida) {
        Producto p = buscarProducto(codigoProducto);
        if (p != null) {
            p.actualizarStock(cantidadVendida);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    //Precargar productos distintos de ejemplo
    public static void precargarProductos() {
        productos.put(2001, new Producto(2001, "Leche La Serenísima 1L", 500.0, 0, 2500));
        productos.put(2002, new Producto(2002, "Pan Integral Bimbo 500gr", 450.0, 10, 1800));
        productos.put(2003, new Producto(2003, "Queso Cremoso Sancor 1kg", 3200.0, 15, 1200));
        productos.put(2004, new Producto(2004, "Jugo Cepita Naranja 1L", 600.0, 0, 2000));
        productos.put(2005, new Producto(2005, "Mermelada Arcor Frutilla 500gr", 750.0, 20, 1500));
        productos.put(2006, new Producto(2006, "Galletitas Oreo 300gr", 850.0, 0, 3000));
        productos.put(2007, new Producto(2007, "Aceite Cocinero 1L", 2100.0, 25, 1000));
        productos.put(2008, new Producto(2008, "Yerba Rosamonte 1kg", 1800.0, 0, 2200));
    }
}
