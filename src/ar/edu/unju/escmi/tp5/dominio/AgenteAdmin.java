package ar.edu.unju.escmi.tp5.dominio;

public class AgenteAdmin extends Empleado {

    public AgenteAdmin(String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Agente Administrativo ===");
        System.out.println("1. Alta de Producto");
        System.out.println("2. Realizar Venta");
    }
    
    public void realizarVenta() {
        System.out.println("Accion: realizarVenta() - implementacion simplificada");
        // Implementacion simple: se podría delegar a MenuPrincipal en el flujo real
    }
}
