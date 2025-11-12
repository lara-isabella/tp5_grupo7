package ar.edu.unju.escmi.tp5.dominio;

public class AgenteAdministrativo extends Empleado {

    private int idEmpleado;

    public AgenteAdministrativo() {
        super();
    }

    public AgenteAdministrativo(String nombre, String apellido, String direccion, int dni, int idEmpleado) {
        super(nombre, apellido, direccion, dni);
        this.idEmpleado = idEmpleado;
    }

    @Override
    public void realizarVenta() {
    }

    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
}
