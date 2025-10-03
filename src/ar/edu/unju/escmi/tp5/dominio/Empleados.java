package ar.edu.unju.escmi.tp5.dominio;

public abstract class Empleados {
    private String nombre;
    private String apellido;
    private String direccion;

    public Empleados(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public abstract void mostrarMenu();

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
}
