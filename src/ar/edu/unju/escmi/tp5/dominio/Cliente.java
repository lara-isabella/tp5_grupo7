package ar.edu.unju.escmi.tp5.dominio;

public class Cliente {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected int dni;
    protected int codigoCliente;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
    }

    public Cliente(String nombre, String apellido, String direccion, int dni, int codigoCliente) {
        this(nombre, apellido, direccion, dni);
        this.codigoCliente = codigoCliente;
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

    public int getCodigoCliente() {
        return codigoCliente;
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

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    // Implementaciones por defecto (el diagrama muestra estos métodos como no abstractos)
    public void mostrarDatos() {
        System.out.println("Cliente (Código: " + codigoCliente + ")");
        System.out.println("Nombre: " + nombre + " " + (apellido != null ? apellido : ""));
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + (direccion != null ? direccion : ""));
    }

    // Devuelve el tipo de cliente (por defecto "Cliente")
    public String getTipoCliente() {
        return "Cliente";
    }

    // Permite aplicar un descuento final sobre el total (por defecto no aplica descuento)
    public double aplicarDescuento(double total) {
        return total;
    }
}