package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class MenuProductos {
    public static void menuProductos(Scanner sc) {
        byte opcion;
        do {
            System.out.println("\n--- Menu de Productos ---");
            System.out.println("1 - Dar Alta de Producto");
            System.out.println("2 - Mostrar Productos");
            System.out.println("3 - Realizar Venta");
            System.out.println("4 - Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextByte();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = sc.nextInt(); sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Precio unitario: ");
                    double precio = sc.nextDouble();
                    System.out.print("Descuento (%): ");
                    int descuento = sc.nextInt();
                    System.out.print("Stock inicial: ");
                    int stock = sc.nextInt(); sc.nextLine();

                    Producto nuevo = new Producto(codigo, descripcion, precio, descuento, stock);
                    CollectionProducto.guardarProducto(nuevo);
                    System.out.println("Producto agregado correctamente.");
                    break;
                case 2:
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");
                    CollectionProducto.mostrarProductos();
                    break;
                case 3:
                    System.out.print("Código del producto: ");
                    int codVenta = sc.nextInt();
                    System.out.print("Cantidad vendida: ");
                    int cantidad = sc.nextInt(); sc.nextLine();
                    CollectionProducto.actualizarStock(codVenta, cantidad);
                    break;
                case 4:
                    System.out.println("Saliendo del menú de productos...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 4);
    }
}
