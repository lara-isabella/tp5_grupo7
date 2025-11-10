package ar.edu.unju.escmi.tp5.dominio;

public class AgenteAdmin extends Empleado {

    public AgenteAdmin(String nombres, String apellido, String direccion) {
        super(nombres, apellido, direccion);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Agente Administrativo ===");
        System.out.println("1. Alta de Producto");
        System.out.println("2. Realizar Venta");
    }
    
    public void realimentarStockFactura() {}
    
    public void verificarCliente() {}
    
    public void verificarStock() {}
    
    public void altaDeProducto() {}
}