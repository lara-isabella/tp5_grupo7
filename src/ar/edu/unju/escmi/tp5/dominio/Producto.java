package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    
    private int codigoProducts;
    private String descripcion;
    private double precioUnit;
    private int descuento;
    private int stock;

    public Producto() {}

    public Producto(int codigoProducts, String descripcion, double precioUnit, int descuento, int stock) {
        this.codigoProducts = codigoProducts;
        this.descripcion = descripcion;
        this.precioUnit = precioUnit;
        this.descuento = descuento;
        this.stock = stock;
    }

    public void mostrarProducts() {
        System.out.println("Código: " + codigoProducts +
                           " | Descripción: " + descripcion +
                           " | Precio: $" + precioUnit +
                           " | Descuento: " + descuento + "%" +
                           " | Stock: " + stock);
    }

    public void reducirStock(int cantidadVendida) {
        if (cantidadVendida <= stock) {
            stock -= cantidadVendida;
        } else {
            System.out.println("No hay suficiente stock para el producto: " + descripcion);
        }
    }

    public int getCodigoProducts() { return codigoProducts; }
    public void setCodigoProducts(int codigoProducts) { this.codigoProducts = codigoProducts; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getPrecioUnit() { return precioUnit; }
    public void setPrecioUnit(double precioUnit) { this.precioUnit = precioUnit; }
    public int getDescuento() { return descuento; }
    public void setDescuento(int descuento) { this.descuento = descuento; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}