package ar.edu.unju.escmi.tp5.dominio;

public abstract class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String domicilio;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String apellido, int dni, String domicilio) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDni(int dni) { this.dni = dni; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }
    public int getIdEmpleado() { return idEmpleado; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getDni() { return dni; }
    public String getDomicilio() { return domicilio; }
    public abstract String getTipoEmpleado();
    public abstract void mostrarMenu();

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}