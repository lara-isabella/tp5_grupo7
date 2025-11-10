package ar.edu.unju.escmi.tp5.dominio;


public class ClienteMayorista extends Cliente {

    private int codigoCliente;

    public ClienteMayorista() {
        super();
    }

    public ClienteMayorista(String nombre, String apellido, String direccion, int dni, int codigoCliente) {
        super(nombre, apellido, direccion, dni);
        this.codigoCliente = codigoCliente;
    }

    @Override
    public double aplicarDescuento(double precio) {  
        return precio; 
    }

    public int getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(int codigoCliente) { this.codigoCliente = codigoCliente; }
}