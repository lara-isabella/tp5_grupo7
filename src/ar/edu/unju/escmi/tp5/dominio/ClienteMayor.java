package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayor extends Cliente {

    private int codigo;

    // Constructor vacío
    public ClienteMayor() {
    }

    //Constructor adaptado al padre
    public ClienteMayor(String nombre, String apellido, String direccion, int dni, int codigo) {
        super(nombre, apellido, direccion, dni);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    @Override
    public String getTipoCliente() {
        return "Mayorista";
    }

    @Override
    public String mostrarDatos() {
        return "Cliente " + getTipoCliente() + " DNI: " + dni +
                " | Nombre: " + nombre + " " + apellido +
                " | Dirección: " + direccion +
                " | Código: " + codigo;
    }

    @Override
    public String toString() {
        return mostrarDatos();
    }
}
