package ar.edu.unju.escmi.tp5.dominio;

import ar.edu.unju.escmi.tp5.collections.CollectionFactura;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public abstract class Cliente {
    
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    //Métodos del UML (abstract porque cada clase hija los define)
    public abstract String getTipoCliente();
    public abstract String mostrarDatos();

    //Buscar factura (del UML)
    public static void buscarFactura(int numeroFactura) {
        Factura factura = CollectionFactura.buscarFactura(int numeroFactura);
        if (factura != null) {
            System.out.println("Factura encontrada: ");
            factura.mostrarFactura();
        } else {
            System.out.println("No se encontró la factura con número: " + numeroFactura);
        }
    }

    @Override
    public String toString() {
        return mostrarDatos();
    }
}
