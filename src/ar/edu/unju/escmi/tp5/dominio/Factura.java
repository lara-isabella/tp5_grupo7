package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    private static int contador = 0;
    private int nroFactura;
    private LocalDate fecha;
    private double total;

    private Cliente cliente;
    private Empleado empleado; 
    private List<LineaFactura> lineas;

    public Factura(Cliente cliente, Empleado empleado) {
        this.nroFactura = ++contador;
        this.fecha = LocalDate.now();
        this.total = 0;
        this.cliente = cliente;
        this.empleado = empleado;
        this.lineas = new ArrayList<>();
    }

    public Factura(int nroFactura, Cliente cliente, Empleado empleado) {
        this.nroFactura = nroFactura;
        this.fecha = LocalDate.now();
        this.total = 0;
        this.cliente = cliente;
        this.empleado = empleado;
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(LineaFactura linea) {
        lineas.add(linea);
        calcularTotal();
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
        System.out.println("Factura N°: " + nroFactura);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombres() + " " + cliente.getApellidos());
        System.out.println("Atendido por: " + empleado.getNombres());
        System.out.println("Detalles:");
        for (LineaFactura l : lineas) {
            l.mostrarLinea();
        }
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL: $" + String.format("%.2f", total));
        System.out.println("=========================================");
    }

    public int getNroFactura() { return nroFactura; }

    public LocalDate getFecha() { return fecha; }

    public double getTotal() { return total; }

    public Cliente getCliente() { return cliente; }
    
    public Empleado getEmpleado() { return empleado; }

    public List<LineaFactura> getLineas() { return lineas; }
}