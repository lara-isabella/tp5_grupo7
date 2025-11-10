package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    
    private int nroFactura;
    private LocalDate fecha;
    private Cliente cliente;
    private List<Detalle> detalles;
    private double total;
    private static int CONTADOR_FACTURAS = 1000;

    public Factura(Cliente cliente) {
        this.nroFactura = ++CONTADOR_FACTURAS;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarDetalle(Detalle detalle) {
        this.detalles.add(detalle);
        this.total = calcularTotal();
    }

    public double calcularTotal() {
        double sum = 0.0;
        for (Detalle detalle : detalles) {
            sum += detalle.calcularSubtotal();
        }
        this.total = sum;
        return this.total;
    }

    public void mostrarFactura() {
        System.out.println("\n--- FACTURA NRO: " + nroFactura + " ---");
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + " (DNI: " + cliente.getDni() + ")");
        System.out.println("------------------------------------");
        System.out.println("Detalles de la Venta:");
        for (Detalle d : detalles) {
            System.out.printf("  %d x %s @ $%.2f = $%.2f%n", 
                d.getCantidad(), 
                d.getProducto().getDescripcion(), 
                d.getPrecioUnitario(), 
                d.getSubtotal());
        }
        System.out.println("------------------------------------");
        System.out.printf("TOTAL: $%.2f%n", this.total);
        System.out.println("------------------------------------");
    }

    public int getNroFactura() { return nroFactura; }
    public LocalDate getFecha() { return fecha; }
    public Cliente getCliente() { return cliente; }
    public List<Detalle> getDetalles() { return detalles; }
    public double getTotal() { return total; }
}