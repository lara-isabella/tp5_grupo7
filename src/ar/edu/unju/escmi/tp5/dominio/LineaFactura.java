package ar.edu.unju.escmi.tp5.dominio;

public class LineaFactura {
    // Atributos según el diagrama
    private int cantidad;
    private Producto producto;

    // Constructor
    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Método para calcular el subtotal
    public double calcularSubtotal() {
        double precioConDescuento = producto.getPrecioUnitario() * (1 - producto.getDescuento() / 100.0);
        return precioConDescuento * cantidad;
    }

    // Getters y Setters
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    // Método auxiliar para mostrar info (no está en el UML pero puede servir)
    public void mostrarLinea() {
        System.out.println("Producto: " + producto.getDescripcion() +
                           " | Cantidad: " + cantidad +
                           " | Subtotal: $" + String.format("%.2f", calcularSubtotal()));
    }
}
