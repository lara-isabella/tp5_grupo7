package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    
    private int codigoProducto;
    private String descripcion;
    private double precio;
    private int descuento;
    private int stock;

    public Producto() {}

    public Producto(int codigoProducto, String descripcion, double precio, int descuento, int stock) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.stock = stock;
    }

    public void actualizarStock(int cantidadVendida) {
        if (cantidadVendida <= stock) {
            stock -= cantidadVendida;
        } else {
            System.out.println("No hay suficiente stock para el producto: " + descripcion);
        }
    }
    
    public int getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(int codigoProducto) { this.codigoProducto = codigoProducto; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getDescuento() { return descuento; }
    public void setDescuento(int descuento) { this.descuento = descuento; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}