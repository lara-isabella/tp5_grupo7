package ar.edu.unju.escmi.tp5.dominio;

public class LineaFactura {
    
    private int cantidad;
    private Producto producto;

    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        double precioConDescuento = producto.getPrecioUnit() * (1 - producto.getDescuento() / 100.0);
        return precioConDescuento * cantidad;
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public void mostrarLinea() {
        System.out.println("Producto: " + producto.getDescripcion() +
                           " | Cantidad: " + cantidad +
                           " | Subtotal: $" + String.format("%.2f", calcularSubtotal()));
    }
}