package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    private int codigoProducto;
    private String descripcion;
    private double precio;
    private int stock;
    private double descuento;

    public Producto() {
    }
    
    public Producto(int codigoProducto, String descripcion, double precio, double descuento) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        stock = 5000;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;

    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public double getDescuento() {
        return descuento;
    }

}