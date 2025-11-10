package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMenor extends Cliente {

    private String obraSocial;

    public ClienteMenor() {
    }

    public ClienteMenor(String nombres, String apellidos, String direccion, int cuit, String obraSocial) {
        super(nombres, apellidos, direccion, cuit);
        this.obraSocial = obraSocial;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    
    @Override
    public String getTipoCliente() {
        return "Minorista";
    }

    @Override
    public String mostrarDatos() {
        return "Cliente " + getTipoCliente() + " CUIT: " + getCuit() +
                " | Nombre: " + getNombres() + " " + getApellidos() +
                " | Dirección: " + getDireccion() +
                " | Obra Social: " + obraSocial;
    }

    public double aplicaDescXobraSocial(double precio) {
        if (this.getCuit() != 0) {
            if (this.obraSocial != null && this.obraSocial.equalsIgnoreCase("PAMI")) {
                System.out.println("El cliente tiene un descuento del 10% en la compra.");
                return precio * 0.9;
            } else {
                System.out.println("El cliente no tiene descuento.");
                return precio;
            }
        } else {
            System.out.println("El cliente no está identificado.");
            return precio;
        }
    }

    @Override
    public String toString() {
        return mostrarDatos();
    }
}