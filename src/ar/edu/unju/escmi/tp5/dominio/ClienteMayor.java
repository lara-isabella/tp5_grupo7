package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayor extends Cliente {
    private int codigoCliente;

    public ClienteMayor(String nombre, String apellido, String direccion, int dni, int codigoCliente) {
        super(nombre, apellido, direccion, dni);
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(int codigoCliente) { this.codigoCliente = codigoCliente; }

    public String getTipoCliente() {
        return "Mayor";
    }

    public double aplicarDescuento(double total) {
        return total * 0.90; // 10% de descuento
    }

    public void mostrarDatos() {
        System.out.println("Cliente Mayor:");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Código Cliente: " + codigoCliente);
    }
}