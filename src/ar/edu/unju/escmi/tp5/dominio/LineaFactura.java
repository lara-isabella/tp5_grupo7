package ar.edu.unju.escmi.tp5.dominio;

public class LineaFactura {
    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = producto.getPrecioConDescuento();
        this.subtotal = this.precioUnitario * cantidad;
    }

    // Calcula y devuelve el subtotal de la línea (unitario * cantidad)
    public double calcularSubtotal() {
        return this.subtotal;
    }

    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }
    public double getSubtotal() { return subtotal; }
}
