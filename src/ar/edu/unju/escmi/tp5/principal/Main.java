package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectionProducto.precargarProductos();

        byte opcion;
        do {
            System.out.println("\n**** Menu Principal ****");
            System.out.println("1 - Menu de Productos");
            System.out.println("2 - Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextByte();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    MenuProductos.menuProductos(sc); // Aquí llama a MenuProductos
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
            }
        } while (opcion != 2);

        sc.close();
    }
}

