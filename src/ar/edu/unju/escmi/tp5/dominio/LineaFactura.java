package ar.edu.unju.escmi.tp5.dominio;

public class LineaFactura {
    private Producto producto;
    private int cantidad;

    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularImporte() {
        return cantidad * producto.getPrecioUnitario();
    }

    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
}
