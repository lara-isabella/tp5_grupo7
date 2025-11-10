package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMenor extends Cliente {

    private String obraSocial;

    //Constructor vacío
    public ClienteMenor() {
    }

    //Constructor adaptado al padre
    public ClienteMenor(String nombre, String apellido, String direccion, int dni, String obraSocial) {
        super(nombre, apellido, direccion, dni);
        this.obraSocial = obraSocial;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    //Método del UML
    @Override
    public String getTipoCliente() {
        return "Minorista";
    }

    //Método del UML
    @Override
    public String mostrarDatos() {
        return "Cliente " + getTipoCliente() + " ➤ DNI: " + dni +
                " | Nombre: " + nombre + " " + apellido +
                " | Dirección: " + direccion +
                " | Obra Social: " + obraSocial;
    }

    //Mantiene tu lógica de descuento
    public double aplicarDescuento(double precio) {
        if (this.dni != 0) {
            if (this.obraSocial.equalsIgnoreCase("PAMI")) {
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

    //toString reutiliza mostrarDatos()
    @Override
    public String toString() {
        return mostrarDatos();
    }
}
