package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    // Atributos
    private int codigoProducto;
    private String descripcion;
    private double precioUnitario;
    private int descuento; // Puede ser 0, 25 o 30
    private int stock;

    // Constructores
    public Producto() {}

    public Producto(int codigoProducto, String descripcion, double precioUnitario, int descuento, int stock) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
        this.stock = stock;
    }

    // Métodos
    public void mostrarProducto() {
        System.out.println("Código: " + codigoProducto +
                           " | Descripción: " + descripcion +
                           " | Precio: $" + precioUnitario +
                           " | Descuento: " + descuento + "%" +
                           " | Stock: " + stock);
    }

public void actualizarStock(int cantidadVendida) {
    if (cantidadVendida <= stock) {
        stock -= cantidadVendida; // restamos lo vendido al stock actual
    } else {
        System.out.println("No hay suficiente stock para el producto: " + descripcion);
    }
}
    // Getters y Setter
    public int getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(int codigoProducto) { this.codigoProducto = codigoProducto; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }
    public int getDescuento() { return descuento; }
    public void setDescuento(int descuento) { this.descuento = descuento; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
