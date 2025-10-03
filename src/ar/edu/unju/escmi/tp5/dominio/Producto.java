package ar.edu.unju.escmi.tp5.dominio;

public class Producto {

    //Atributos
    private int codigoProducto;
    private String descripcion;
    private double precioUnitario;
    private int descuento;
    private int stock;

    //Constructor
    public Producto(int codigoProducto, String descripcion, double precioUnitario, int descuento, int stock) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
        this.stock = stock;
    }

    //Métodos Getter y Setter
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Método para calcular el precio con descuento
    public double getPrecioConDescuento() {
        return precioUnitario * (1 - descuento / 100.0);
    }

    //Método para mostrar la información del producto
    public void mostrarProducto() {
        System.out.println("Código: " + codigoProducto);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Stock: " + stock + " unidades");
    }

    //Método para actualizar el stock después de una venta
    public void actualizarStock(int cantidadVendida) {
        if (cantidadVendida > 0) {
            stock -= cantidadVendida;
            System.out.println("Stock actualizado. El nuevo stock es: " + stock);
        } else {
            System.out.println("Cantidad inválida. No es posible actualizar el stock.");
        }
    }
}
