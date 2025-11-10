package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayorista extends Cliente {

    private int codigo;

    public ClienteMayorista() {
    }

    public ClienteMayorista(String nombre, String apellido, String direccion, int dni, int codigo) {
        super(nombre, apellido, direccion, dni); 
        this.codigo = codigo;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    @Override
    public String getTipoCliente() {
        return "Mayorista";
    }

    @Override
    public String mostrarDatos() {
        return "Cliente " + getTipoCliente() + " DNI: " + getDni() +
                " | Nombre: " + getNombre() + " " + getApellido() +
                " | Dirección: " + getDireccion() +
                " | Código: " + codigo;
    }

    @Override
    public String toString() {
        return mostrarDatos();
    }
}