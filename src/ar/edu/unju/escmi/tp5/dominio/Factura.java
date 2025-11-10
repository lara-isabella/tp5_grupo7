package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    private static int contador = 0;
    private int numeroFactura;
    private LocalDate fecha;
    private double total;

    private Cliente cliente; 
    private List<Detalle> detalles; 

    public Factura(Cliente cliente) {
        this.numeroFactura = ++contador;
        this.fecha = LocalDate.now();
        this.total = 0;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public Factura(int numeroFactura, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.fecha = LocalDate.now();
        this.total = 0;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(Detalle detalle) {
        detalles.add(detalle);
        calcularTotal(); 
    }

    public double calcularTotal() {
        total = 0;
        for (Detalle d : detalles) {
            total += d.calcularImporte();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("=========================================");
        System.out.println("Factura N°: " + numeroFactura);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Detalles:");
        for (Detalle d : detalles) {
            d.mostrarLinea();
        }
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL: $" + String.format("%.2f", total));
        System.out.println("=========================================");
    }

    public int getNumeroFactura() { return numeroFactura; }
    public LocalDate getFecha() { return fecha; }
    public double getTotal() { return total; }
    public Cliente getCliente() { return cliente; }
    public List<Detalle> getDetalles() { return detalles; }
}