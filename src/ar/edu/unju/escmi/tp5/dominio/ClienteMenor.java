package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMenor extends Cliente {
    private String obraSocial;

    public ClienteMenor() {
        
    }

    public ClienteMenor(String nombre, String apellido, String direccion, int dni, String obraSocial) {
        super(nombre, apellido, direccion, dni);
        this.obraSocial = obraSocial;
    }

    public String getObraSocial() { return obraSocial; }
    public void setObraSocial(String obraSocial) { this.obraSocial = obraSocial; }

    public String getTipoCliente() {
        return "Menor";
    }

    public double aplicarDescuento(double total) {
        // Aplica 10% solo si la obra social es PAMI y hay DNI válido
        if (this.obraSocial != null && this.obraSocial.equalsIgnoreCase("PAMI") && this.dni > 0) {
            return total * 0.90;
        }
        return total;
    }

    public void mostrarDatos() {
        System.out.println("Cliente Menor (Código: " + getCodigoCliente() + "):");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Obra Social: " + obraSocial);
        
    }

}