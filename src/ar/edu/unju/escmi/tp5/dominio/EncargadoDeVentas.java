package ar.edu.unju.escmi.tp5.dominio;

public class EncargadoDeVentas extends Empleado {

    public EncargadoDeVentas() {
        super();
    }
    
    public EncargadoDeVentas(int idEmpleado, String nombre, String apellido, int dni, String domicilio) {
        super(idEmpleado, nombre, apellido, dni, domicilio);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Encargado de Ventas ===");
        System.out.println("1. Mostrar todas las ventas");
        System.out.println("2. Mostrar total de ventas");
        System.out.println("3. Verificar stock de producto");
    }
    
    public void mostrarVentas() {
        System.out.println("Accion: mostrarVentas()");
    }
    
    public void mostrarTotalVentas() {
         System.out.println("Accion: mostrarTotalVentas()");
    }
    
    public void verificarStock(int codigoProducto) {
        System.out.println("Accion: verificarStock() para el código: " + codigoProducto);
    }

    @Override
    public String getTipoEmpleado() {
        return "EncargadoDeVentas";
    }
    
    @Override
    public String toString() {
        return super.toString(); 
    }
}