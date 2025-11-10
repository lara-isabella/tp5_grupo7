package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMinorista extends Cliente {
    private String obraSocial;

    public ClienteMinorista() {
        super();
    }

    public ClienteMinorista(String nombre, String apellido, String direccion, int dni, String obraSocial) {
        super(nombre, apellido, direccion, dni);
        this.obraSocial = obraSocial;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.85; 
    }

    public String getObraSocial() { return obraSocial; }
    public void setObraSocial(String obraSocial) { this.obraSocial = obraSocial; }
}