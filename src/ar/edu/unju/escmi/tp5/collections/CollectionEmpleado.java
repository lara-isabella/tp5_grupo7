package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Empleado;

public class CollectionEmpleado {
    public static List<Empleado> empleados = new ArrayList<>();

    public static void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public static Empleado buscarEmpleadoPorNombre(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public static void mostrarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e.getTipoEmpleado() + ": " + e.getNombre() + " " + e.getApellido());
        }
    }
}
