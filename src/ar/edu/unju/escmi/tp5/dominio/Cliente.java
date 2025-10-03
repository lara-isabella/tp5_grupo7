package ar.edu.unju.escmi.tp5.dominio;

public abstract class Cliente {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected int dni;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public abstract void mostrarDatos();
    // Devuelve el tipo de cliente (por ej. "Mayor" o "Menor")
    public abstract String getTipoCliente();

    // Permite aplicar un descuento final sobre el total (si corresponde)
    public abstract double aplicarDescuento(double total);
}