package ar.edu.unju.escmi.tp5.dominio;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String direccion;
    private int codigoEmpleado;

    public Empleado(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Empleado(String nombre, String apellido, String direccion, int codigoEmpleado) {
        this(nombre, apellido, direccion);
        this.codigoEmpleado = codigoEmpleado;
    }

    public abstract void mostrarMenu();

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public int getCodigoEmpleado() { return codigoEmpleado; }

    // Devuelve el tipo de empleado (por ejemplo "AgenteAdmin" o "EncargadoVentas")
    public String getTipoEmpleado() { return this.getClass().getSimpleName(); }
}
