package ar.edu.unju.escmi.tp5.dominio;

import ar.edu.unju.escmi.tp5.collections.CollectionFactura;

public abstract class Cliente {
    
    private String nombres;
    private String apellidos;
    private String direccion;
    private int cuit;

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, String direccion, int cuit) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.cuit = cuit;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract String getTipoCliente();
    public abstract String mostrarDatos();

    public String getFactCliente() {
        // Método requerido por UML
        return "Datos de factura del cliente";
    }

    public static void buscarFactura(int numeroFactura) {
        Factura factura = CollectionFactura.buscarFactura(numeroFactura);
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