package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unju.escmi.tp5.dominio.AgenteAdministrativo;
import ar.edu.unju.escmi.tp5.dominio.Empleado;
import ar.edu.unju.escmi.tp5.dominio.EncargadoDeVentas;

public class CollectionEmpleado {

    public static Map<Integer, Empleado> empleados = new HashMap<>();

    public static void guardarEmpleado(Empleado empleado) {
        empleados.put(empleado.getDni(), empleado);
    }

    public static Empleado buscarEmpleado(int dni) {
        return empleados.get(dni);
    }

    public static void precargarEmpleado() {
        if (empleados.isEmpty()) {
            empleados.put(20111222, new AgenteAdministrativo("Ana", "Gomez", "Rivadavia 10", 20111222, 101));
            empleados.put(35333444, new EncargadoDeVentas("Carlos", "Ruiz", "Belgrano 20", 35333444, 201));
        }
    }
}