package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Empleado;

public class CollectionEmpleado {
    public static List<Empleado> empleados = new ArrayList<>();

    public static void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public static Empleado comprobarIngreso(String nombres) {
        for (Empleado e : empleados) {
            if (e.getNombres().equalsIgnoreCase(nombres)) {
                return e;
            }
        }
        return null;
    }

    public static void mostrarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e.getTipoEmpleado() + ": " + e.getNombres() + " " + e.getApellido());
        }
    }
}