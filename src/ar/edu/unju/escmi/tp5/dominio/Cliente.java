package ar.edu.unju.escmi.tp5.dominio;

public abstract class Cliente {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected int dni;

    public Cliente(String nombre, String apellido, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public abstract String getTipoCliente();

    public abstract double aplicarDescuento(double total);

    public void hacerPedido() {
        System.out.println("Pedido realizado por " + nombre + " " + apellido);
    }

    public abstract void mostrarDatos();
}