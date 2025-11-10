package ar.edu.unju.escmi.tp5.dominio;

public abstract class Empleado {
    private String nombres;
    private String apellido;
    private String direccion;
    private int codEmpleado;

    public Empleado(String nombres, String apellido, String direccion) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Empleado(String nombres, String apellido, String direccion, int codEmpleado) {
        this(nombres, apellido, direccion);
        this.codEmpleado = codEmpleado;
    }

    public abstract void mostrarMenu();

    public String getNombres() { return nombres; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public int getCodEmpleado() { return codEmpleado; }

    public String getTipoEmpleado() { 
        return this.getClass().getSimpleName();
     }
}