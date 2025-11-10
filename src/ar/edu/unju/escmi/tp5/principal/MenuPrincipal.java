package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;
import ar.edu.unju.escmi.tp5.collections.*;
import ar.edu.unju.escmi.tp5.dominio.*;

public class MenuPrincipal {

    static Scanner sc = new Scanner(System.in);

    // --- Menú Clientes ---
    static void menuCliente() {
        byte op;
        do {
            System.out.println("\n=== Menú de Clientes ===");
            System.out.println("1 - Buscar Factura");
            System.out.println("2 - Salir");
            System.out.print("Ingrese una opción: ");
            op = sc.nextByte();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Ingrese número de factura: ");
                    int nroFactura = sc.nextInt();
                    Factura factura = CollectionFactura.buscarFactura(nroFactura);
                    if (factura != null) {
                        factura.mostrarFactura();
                    } else {
                        System.out.println("Factura no encontrada.");
                    }
                }
                case 2 -> System.out.println("Saliendo del Menú de Clientes...");
                default -> System.out.println("Opción incorrecta.");
            }
        } while (op != 2);
    }

    // --- Menú Empleados ---
    static void menuEmpleado() {
        byte op, op2, op3;
        do {
            System.out.println("\n=== Menú de Empleados ===");
            System.out.println("1 - Menú Encargado de Ventas");
            System.out.println("2 - Menú Agente Administrativo");
            System.out.println("3 - Salir");
            System.out.print("Ingrese una opción: ");
            op = sc.nextByte();
            sc.nextLine();

            switch (op) {
                case 1 -> { // Encargado de Ventas
                    do {
                        System.out.println("\n--- Menú Encargado de Ventas ---");
                        System.out.println("1 - Mostrar Ventas");
                        System.out.println("2 - Verificar Stock");
                        System.out.println("3 - Mostrar Total de Ventas");
                        System.out.println("4 - Salir");
                        op2 = sc.nextByte();
                        sc.nextLine();

                        switch (op2) {
                            case 1 -> CollectionFactura.mostrarFacturas();
                            case 2 -> {
                                System.out.print("Ingrese código del producto: ");
                                int codigo = sc.nextInt();
                                Producto prod = CollectionProducto.buscarProducto(codigo);
                                if (prod != null) {
                                    System.out.println("Stock disponible: " + CollectionStock.verificarStock(prod));
                                } else {
                                    System.out.println("Producto no encontrado.");
                                }
                            }
                            case 3 -> System.out.println("Total de ventas: $" + CollectionFactura.calcularTotalVentas());
                            case 4 -> System.out.println("Saliendo del Menú Encargado de Ventas...");
                            default -> System.out.println("Opción incorrecta.");
                        }
                    } while (op2 != 4);
                }

                case 2 -> { // Agente Administrativo
                    do {
                        System.out.println("\n--- Menú Agente Administrativo ---");
                        System.out.println("1 - Dar Alta de Producto");
                        System.out.println("2 - Identificar Clientes");
                        System.out.println("3 - Realizar Venta");
                        System.out.println("4 - Salir");
                        op3 = sc.nextByte();
                        sc.nextLine();

                        switch (op3) {
                            case 1 -> { // Alta de producto
                                System.out.print("Código: ");
                                int cod = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Descripción: ");
                                String desc = sc.nextLine();
                                System.out.print("Precio unitario: ");
                                double precio = sc.nextDouble();
                                System.out.print("Descuento (%): ");
                                int descPorc = sc.nextInt();
                                System.out.print("Stock inicial: ");
                                int stock = sc.nextInt();

                                if (!(descPorc == 0 || descPorc == 25 || descPorc == 30)) {
                                    System.out.println("Descuento inválido. Debe ser 0, 25 o 30.");
                                    break;
                                }

                                Producto nuevo = new Producto(cod, desc, precio, descPorc, stock);
                                CollectionProducto.guardarProducto(nuevo);
                                CollectionStock.agregarProducto(nuevo, stock);

                                System.out.println("Producto agregado con éxito.");
                            }

                            case 2 -> { //IDENTIFICAR CLIENTES
                                System.out.print("\nIngrese DNI del cliente: ");
                                int dni = sc.nextInt();
                                sc.nextLine();

                                Cliente cliente = CollectionCliente.buscarCliente(dni);

                                if (cliente != null) {
                                    System.out.println("\nCliente encontrado:");
                                    System.out.println(cliente.mostrarDatos());
                                } else {
                                    System.out.println("\nCliente no registrado. Seleccione tipo de cliente a registrar:");
                                    System.out.println("1 - Cliente Mayor");
                                    System.out.println("2 - Cliente Menor");
                                    System.out.print("Ingrese una opción: ");
                                    int tipo = sc.nextInt();
                                    sc.nextLine();

                                    System.out.print("Nombre: ");
                                    String nombre = sc.nextLine();
                                    System.out.print("Apellido: ");
                                    String apellido = sc.nextLine();
                                    System.out.print("Dirección: ");
                                    String direccion = sc.nextLine();

                                    if (tipo == 1) {
                                        System.out.print("Código de cliente mayorista: ");
                                        int codigo = sc.nextInt();
                                        sc.nextLine();

                                        ClienteMayor nuevo = new ClienteMayor(nombre, apellido, direccion, dni, codigo);
                                        CollectionCliente.agregarCliente(nuevo);
                                        System.out.println("\n Cliente MAYORISTA registrado:");
                                        System.out.println(nuevo.mostrarDatos());

                                    } else if (tipo == 2) {
                                        System.out.print("Obra Social: ");
                                        String obraSocial = sc.nextLine();

                                        ClienteMenor nuevo = new ClienteMenor(nombre, apellido, direccion, dni, obraSocial);
                                        CollectionCliente.agregarCliente(nuevo);
                                        System.out.println("\n Cliente MINORISTA registrado:");
                                        System.out.println(nuevo.mostrarDatos());

                                    } else {
                                        System.out.println(" Opción inválida. No se registró el cliente.");
                                    }
                                }
                            }

                            case 3 -> { //REALIZAR VENTA
                                System.out.print("Ingrese DNI del cliente: ");
                                int dniCli = sc.nextInt();
                                sc.nextLine();
                                Cliente cli = CollectionCliente.buscarCliente(dniCli);

                                if (cli == null) {
                                    System.out.println("Cliente no encontrado. Debe registrarlo primero.");
                                    break;
                                }

                                Factura facturaNueva = new Factura(cli);

                                System.out.print("Código producto: ");
                                int codProd = sc.nextInt();
                                sc.nextLine();
                                Producto producto = CollectionProducto.buscarProducto(codProd);

                                if (producto == null) {
                                    System.out.println("Producto no encontrado.");
                                    break;
                                }

                                int cant;
                                if (cli instanceof ClienteMayor) {
                                    System.out.print("Cliente mayor: ingrese cantidad de bultos (1 bulto = 10 unidades): ");
                                    int bultos = sc.nextInt();
                                    sc.nextLine();
                                    cant = bultos * 10;
                                } else {
                                    System.out.print("Cantidad (unidades): ");
                                    cant = sc.nextInt();
                                    sc.nextLine();
                                }

                                if (CollectionStock.verificarStock(producto) < cant) {
                                    System.out.println("Stock insuficiente.");
                                    break;
                                }

                                LineaFactura linea = new LineaFactura(producto, cant);
                                facturaNueva.agregarLinea(linea);
                                CollectionFactura.guardarFactura(facturaNueva);
                                CollectionStock.actualizarStock(producto, cant);

                                System.out.println("Venta realizada:");
                                facturaNueva.mostrarFactura();
                            }

                            case 4 -> System.out.println("Saliendo del Menú Agente Administrativo...");
                            default -> System.out.println("Opción incorrecta.");
                        }
                    } while (op3 != 4);
                }

                case 3 -> System.out.println("Saliendo del Menú de Empleados...");
                default -> System.out.println("Opción incorrecta.");
            }
        } while (op != 3);
    }

    // --- Main ---
    public static void main(String[] args) {

        //Se cargan los clientes precargados al iniciar el programa
        CollectionCliente.precargarClientes();

        byte op;
        do {
            System.out.println("\n **** Menú de Opciones ****");
            System.out.println("1 - Menú de Clientes");
            System.out.println("2 - Menú de Empleados");
            System.out.println("3 - Salir");
            op = sc.nextByte();
            sc.nextLine();

            switch (op) {
                case 1 -> menuCliente();
                case 2 -> menuEmpleado();
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción incorrecta.");
            }
        } while (op != 3);
    }
}
