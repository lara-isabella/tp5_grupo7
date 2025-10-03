package ar.edu.unju.escmi.tp5.dominio;

public class EncargadoVentas extends Empleados {

    public EncargadoVentas(String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Encargado de Ventas ===");
        System.out.println("1. Mostrar todas las ventas");
        System.out.println("2. Mostrar total de ventas");
        System.out.println("3. Verificar stock de producto");
    }
}
