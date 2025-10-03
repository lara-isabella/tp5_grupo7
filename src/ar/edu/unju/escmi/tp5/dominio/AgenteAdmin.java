package ar.edu.unju.escmi.tp5.dominio;

public class AgenteAdmin extends Empleados {

    public AgenteAdmin(String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Agente Administrativo ===");
        System.out.println("1. Alta de Producto");
        System.out.println("2. Realizar Venta");
    }
}
