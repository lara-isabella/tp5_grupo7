package ar.edu.unju.escmi.tp5.dominio;
public class AgenteAdministrativo extends Empleado {

    public AgenteAdministrativo() {
        super();
    }

    public AgenteAdministrativo(int idEmpleado, String nombre, String apellido, int dni, String domicilio) {
        super(idEmpleado, nombre, apellido, dni, domicilio);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Agente Administrativo ===");
        System.out.println("1. Alta de Producto");
        System.out.println("2. Identificar Cliente");
        System.out.println("3. Realizar Venta");
    }
    public void altaProducto(Producto producto) {
        System.out.println("Accion: altaProducto()");
    }
    
    public void identificarCliente(Cliente cliente) {
        System.out.println("Accion: identificarCliente()");
    }
    
    public void realizarVenta(Factura factura) {
        System.out.println("Accion: realizarVenta()");
    }

    @Override
    public String getTipoEmpleado() {
        return "AgenteAdministrativo";
    }
    
    @Override
    public String toString() {
        return super.toString(); 
    }
}