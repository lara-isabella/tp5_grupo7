package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static int contador = 1;
    private int numero;
    private LocalDate fecha;
    private Cliente cliente;
    private List<LineaFactura> lineas;

    public Factura(Cliente cliente) {
        this.numero = contador++;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(LineaFactura linea) {
        this.lineas.add(linea);
    }

    public double calcularTotal() {
        return lineas.stream().mapToDouble(LineaFactura::calcularImporte).sum();
    }

    public void mostrarFactura() {
        System.out.println("Factura Nº " + numero + " - Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Detalle:");
        for (LineaFactura l : lineas) {
            System.out.println("- " + l.getProducto().getDescripcion() + " x" + l.getCantidad() +
                               " = $" + l.calcularImporte());
        }
        System.out.println("TOTAL: $" + calcularTotal());
    }

    public int getNumero() { return numero; }
    public Cliente getCliente() { return cliente; }
}
