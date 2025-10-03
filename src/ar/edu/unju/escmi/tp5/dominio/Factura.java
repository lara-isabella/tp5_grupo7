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
        double subtotal = 0;
        // Recorremos las líneas y calculamos el subtotal aplicando:
        // - Primero: descuento propio del producto (Producto.getPrecioConDescuento())
        // - Segundo: si el cliente es mayor, el precio por unidad se reduce a la mitad
        for (LineaFactura l : lineas) {
            double unitPrice = l.getProducto().getPrecioConDescuento();
            if (cliente instanceof ClienteMayor) {
                // Para compras por mayor, el precio por unidad es la mitad
                unitPrice = unitPrice / 2.0;
            }
            subtotal += l.getCantidad() * unitPrice;
        }

        // Finalmente: si el cliente es menor y tiene obra social PAMI (y DNI válido),
        // se aplica un 10% de descuento sobre el subtotal.
        if (cliente instanceof ClienteMenor) {
            ClienteMenor cm = (ClienteMenor) cliente;
            if (cm.getObraSocial() != null && cm.getObraSocial().equalsIgnoreCase("PAMI") && cliente.getDni() > 0) {
                return subtotal * 0.90; // 10% de descuento
            }
        }
        return subtotal;
    }

    public void mostrarFactura() {
        System.out.println("Factura Nº " + numero + " - Fecha: " + fecha);
        // Mostrar datos del cliente (apellido, nombre, dirección si disponibles)
        System.out.println("Cliente: " + cliente.getNombre() + " " + (cliente.getApellido() != null ? cliente.getApellido() : ""));
        System.out.println("Dirección: " + (cliente.getDireccion() != null ? cliente.getDireccion() : ""));
        System.out.println("Detalle:");
        for (LineaFactura l : lineas) {
            double unitPrice = l.getProducto().getPrecioConDescuento();
            if (cliente instanceof ClienteMayor) {
                unitPrice = unitPrice / 2.0;
            }
            System.out.println("- " + l.getProducto().getDescripcion() + " | Cant: " + l.getCantidad() + " | Unit: $" + unitPrice + " | Importe: $" + (l.getCantidad() * unitPrice));
        }
        System.out.println("TOTAL: $" + calcularTotal());
    }

    public int getNumero() { return numero; }
    public Cliente getCliente() { return cliente; }
}
