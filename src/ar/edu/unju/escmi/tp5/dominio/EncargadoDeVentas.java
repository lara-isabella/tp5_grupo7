package ar.edu.unju.escmi.tp5.dominio;

import ar.edu.unju.escmi.tp5.collections.CollectionFactura;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;

public class EncargadoDeVentas extends Empleado {
    public EncargadoDeVentas() {
    }

    public EncargadoDeVentas(int idEmpleado, String nombre, String apellido, int dni, String domicilio) {
        super(idEmpleado, nombre, apellido, dni, domicilio);

    }

    @Override
    public String toString() {
        return "EncargadoDeVentas{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

    public static void mostrarVentas() { 

        System.out.println("Listado de ventas:");

        for (Factura factura : CollectionFactura.getFacturas().values()) { 
            System.out.println("**************  Factura N° " + factura.getNumeroFactura() + " ******************");
            System.out.println("Cliente: " + factura.getCliente().getDni());
            System.out.println("Fecha: " + factura.getFecha());

            factura.mostrarFactura();

            System.out.println("**************************************");
        }
    }

    public static void mostrarTotalVentas() {
        double totalV = 0;

        for (Factura factura : CollectionFactura.getFacturas().values()) {
            totalV += factura.calcularTotal();
        }

        System.out.println("***********************");
        System.out.println("La suma total de todas las ventas es: $" + totalV);
        System.out.println("***********************");
    }

    public static void verificarStock(int codigo) {

        Producto producto = CollectionProducto.buscarProducto(codigo); 

        if (producto != null) { 

            System.out.println("Producto encontrado: " + producto.getDescripcion());

            if (producto.getStock() > 0) { 
                System.out.println("El producto está en stock (" + producto.getStock() + " unidades).");
            } else { 
                System.out.println("El producto no tiene stock.");
            }

        } else { 
            System.out.println("No existe un producto con ese código.");
        }
    }

}