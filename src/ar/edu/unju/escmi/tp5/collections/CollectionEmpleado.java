package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Empleado;
import ar.edu.unju.escmi.tp5.dominio.EncargadoDeVentas;
import ar.edu.unju.escmi.tp5.dominio.AgenteAdministrativo;

public class CollectionEmpleado {
    
    public static Map<Integer, Empleado> empleados = new HashMap<>();

    public static void guardarEmpleado(Empleado empleado) {
        empleados.put(empleado.getIdEmpleado(), empleado);
    }

    public static void precargarEmpleado() {
        if (empleados.isEmpty()) {
            empleados.put(1, new AgenteAdministrativo(1, "Agente", "Admin", 123456, "Centro 1"));
            empleados.put(2, new EncargadoDeVentas(2, "Encargado", "Ventas", 789012, "Centro 2"));
        }
    }
    
    public static void mostrarEmpleados() {
        for (Empleado e : empleados.values()) {
            System.out.println(e.getTipoEmpleado() + ": " + e.getNombre() + " " + e.getApellido());
        }
    }
    
    public static Empleado buscarEmpleadoPorNombre(String nombre) {
        for (Empleado e : empleados.values()) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}