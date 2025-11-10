package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayor extends Cliente {

    private int codigoCliente;

    public ClienteMayor() {
    }

    public ClienteMayor(String nombres, String apellidos, String direccion, int cuit, int codigoCliente) {
        super(nombres, apellidos, direccion, cuit);
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double aplicDescXcantidad(double total) {
        // Método requerido por UML
        return total; 
    }

    @Override
    public String getTipoCliente() {
        return "Mayorista";
    }

    @Override
    public String mostrarDatos() {
        return "Cliente " + getTipoCliente() + " CUIT: " + getCuit() +
                " | Nombre: " + getNombres() + " " + getApellidos() +
                " | Dirección: " + getDireccion() +
                " | Código: " + codigoCliente;
    }

    @Override
    public String toString() {
        return mostrarDatos();
    }
}