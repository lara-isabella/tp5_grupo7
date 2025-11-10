package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    // Atributos
    private static int contador = 0; // contador global para numerar facturas automáticamente
    private int numero;
    private LocalDate fecha;
    private double total;

    // Relaciones
    private Cliente cliente; // se asocia con un cliente (según el diagrama)
    private List<LineaFactura> lineas; // composición con LineaFactura

    // ============================
    // CONSTRUCTORES
    // ============================
    public Factura(Cliente cliente) {
        this.numero = ++contador; // genera número único automáticamente
        this.fecha = LocalDate.now();
        this.total = 0;
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
    }

    // Constructor alternativo si necesitás crearla con número específico
    public Factura(int numero, Cliente cliente) {
        this.numero = numero;
        this.fecha = LocalDate.now();
        this.total = 0;
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
    }

    // ============================
    // MÉTODOS
    // ============================
    public void agregarLinea(LineaFactura linea) {
        lineas.add(linea);
        calcularTotal(); // recalcula cada vez que se agrega una línea
    }

    public double calcularTotal() {
        total = 0;
        for (LineaFactura l : lineas) {
            total += l.calcularSubtotal();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("=========================================");
        System.out.println("Factura N°: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Detalles:");
        for (LineaFactura l : lineas) {
            l.mostrarLinea();
        }
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL: $" + String.format("%.2f", total));
        System.out.println("=========================================");
    }

    // ============================
    // GETTERS Y SETTERS
    // ============================
    public int getNumero() { return numero; }

    public LocalDate getFecha() { return fecha; }

    public double getTotal() { return total; }

    public Cliente getCliente() { return cliente; }

    public List<LineaFactura> getLineas() { return lineas; }
}
