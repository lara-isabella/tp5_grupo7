package ar.edu.unju.escmi.tp5.dominio;

public class EncargadoVentas extends Empleado {

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
    
    //correccion
    public void mostrarVentas() {
        System.out.println("Accion: mostrarVentas() - listado simplificado");
        // Podría delegar a CollectionFactura.mostrarFacturas()
        ar.edu.unju.escmi.tp5.collections.CollectionFactura.mostrarFacturas();
    }
    
    public void mostrarTotalVentas() {
        double total = ar.edu.unju.escmi.tp5.collections.CollectionFactura.calcularTotalVentas();
        System.out.println("Total de ventas: $" + total);
    }
}
