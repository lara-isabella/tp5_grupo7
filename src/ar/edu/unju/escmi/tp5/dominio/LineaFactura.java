package ar.edu.unju.escmi.tp5.dominio;

public class LineaFactura {
    private Producto producto;
    private int cantidad;

    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularImporte() {
        // Calcula el importe de la línea usando el precio unitario
        // ya reducido por cualquier descuento del producto.
        return cantidad * producto.getPrecioConDescuento();
    }

    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
}
