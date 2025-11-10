package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.CollectionCliente;
import ar.edu.unju.escmi.tp5.collections.CollectionEmpleado;
import ar.edu.unju.escmi.tp5.collections.CollectionFactura;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;
import ar.edu.unju.escmi.tp5.dominio.Factura;
import ar.edu.unju.escmi.tp5.dominio.Producto;
import ar.edu.unju.escmi.tp5.dominio.Cliente;
import ar.edu.unju.escmi.tp5.dominio.ClienteMayorista;
import ar.edu.unju.escmi.tp5.dominio.ClienteMinorista;
import ar.edu.unju.escmi.tp5.dominio.Detalle;

public class MenuPrincipal {

    static void menuCliente(Scanner sc) {
        byte op;
        do {
            System.out.println("\n **** Menu de Cliente ****");
            System.out.println("1 - Buscar Factura");
            System.out.println("2 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("Buscar Factura");
                    System.out.print("Ingrese el numero de factura a buscar: ");
                    int numeroFactura = sc.nextInt();
                    sc.nextLine(); 
                    
                    Factura factura = CollectionFactura.buscarFactura(numeroFactura);
                    if (factura != null) {
                        factura.mostrarFactura();
                    } else {
                        System.out.println("Factura no encontrada.");
                    }
                    delay(3000);
                    break;
                case 2:
                    System.out.println("Saliendo del Menu de Clientes...");
                    delay(1000);
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
            }
        } while (op != 2);
    }

    static void menuEmpleado(Scanner sc) {
        byte op;
        byte op2;
        byte op3;
        do {
            System.out.println("\n **** Menu de Empleados ****");
            System.out.println("1 - Menu Encargado de Ventas");
            System.out.println("2 - Menu Agente Administrativo");
            System.out.println("3 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            sc.nextLine(); 

            switch (op) {
                case 1: // Encargado de Ventas
                    do {
                        System.out.println("\n--- Menú Encargado de Ventas ---");
                        System.out.println("1 - Mostrar Ventas");
                        System.out.println("2 - Verificar Stock");
                        System.out.println("3 - Mostrar Total de ventas");
                        System.out.println("4 - Salir");
                        op2 = sc.nextByte();
                        sc.nextLine();

                        switch (op2) {
                            case 1:
                                System.out.println("Mostrar ventas");
                                CollectionFactura.mostrarFacturas();
                                delay(3000); 
                                break;
                            case 2:
                                System.out.println("Verificar Stock");
                                System.out.print("Ingrese el código del producto: ");
                                int codigoProducto = sc.nextInt();
                                sc.nextLine();
                                
                                // ✅ Llama al método 100% fiel al UML
                                Producto prod = CollectionProducto.buscarProducto(codigoProducto); 
                                if (prod != null) {
                                    System.out.println("Stock disponible: " + prod.getStock());
                                } else {
                                    System.out.println("Producto no encontrado.");
                                }
                                delay(2000);
                                break;
                            case 3:
                                System.out.println("Mostrar Total de ventas");
                                System.out.println("Total de ventas: $" + CollectionFactura.calcularTotalVentas());
                                delay(2000);
                                break;
                            case 4:
                                System.out.println("Saliendo del Menu Encargado de Ventas...");
                                delay(1000);
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                        }
                    } while (op2 != 4);
                    break;

                case 2: // Agente Administrativo
                    do {
                        System.out.println("\n--- Menú Agente Administrativo ---");
                        System.out.println("1 - Dar Alta de Producto");
                        System.out.println("2 - Realizar Venta");
                        System.out.println("3 - Registrar Nuevo Cliente");
                        System.out.println("4 - Salir");
                        op3 = sc.nextByte();
                        sc.nextLine(); 

                        switch (op3) {
                            case 1: // Alta de producto
                                System.out.println("Dar Alta de Producto");
                                System.out.print("Ingrese código de producto: ");
                                int codigoProducto = sc.nextInt(); sc.nextLine();
                                System.out.print("Ingrese descripción: ");
                                String descripcion = sc.nextLine();
                                System.out.print("Ingrese precio unitario: ");
                                double precio = sc.nextDouble();
                                int descuento;
                                do {
                                    System.out.print("Ingrese descuento (0, 25 o 30): ");
                                    descuento = sc.nextInt();
                                } while (descuento != 0 && descuento != 25 && descuento != 30);
                                
                                System.out.print("Ingrese stock inicial: ");
                                int stock = sc.nextInt(); sc.nextLine();

                                Producto productoNuevo = new Producto(codigoProducto, descripcion, precio, descuento, stock);
                                CollectionProducto.guardarProducto(productoNuevo);

                                System.out.println("Producto dado de alta correctamente.");
                                delay(2000); 
                                break;
                                
                            case 2: // Realizar Venta
                                System.out.println("Realizar Venta");
                                System.out.print("Ingrese DNI del cliente: ");
                                int dniCli = sc.nextInt(); sc.nextLine();
                                Cliente cliente = CollectionCliente.buscarCliente(dniCli);

                                if (cliente == null) {
                                    System.out.println("Cliente no encontrado. Debe registrarlo primero (Opción 3).");
                                    delay(1000);
                                    break;
                                }

                                Factura factura = new Factura(cliente); 
                                boolean seguirComprando = true;
                                
                                while (seguirComprando) {
                                    System.out.print("Ingrese el código del producto: ");
                                    int codigoProductoVenta = sc.nextInt();
                                    
                                    // ✅ Llama al método 100% fiel al UML
                                    Producto producto = CollectionProducto.buscarProducto(codigoProductoVenta);
                                    
                                    if (producto == null) {
                                        System.out.println("Producto no encontrado.");
                                        continue;
                                    }

                                    int cant;
                                    if (cliente instanceof ClienteMayorista) {
                                        System.out.print("Cliente mayorista: Ingrese cantidad de bultos (10u c/u): ");
                                        int bultos = sc.nextInt(); sc.nextLine();
                                        cant = bultos * 10;
                                    } else {
                                        System.out.print("Cantidad (unidades): ");
                                        cant = sc.nextInt(); sc.nextLine();
                                    }

                                    if (producto.getStock() < cant) {
                                        System.out.println("Stock insuficiente. Stock disponible: " + producto.getStock());
                                    } else {
                                        // 1. Calcular precio con descuento de producto (si aplica)
                                        double precioUnitario = producto.getPrecio();
                                        if (producto.getDescuento() > 0) {
                                            precioUnitario = precioUnitario * (1 - (producto.getDescuento() / 100.0));
                                        }

                                        // 2. Aplicar descuentos de cliente
                                        if (cliente instanceof ClienteMayorista) {
                                            // La lógica del 9.6: 50% de descuento adicional
                                            precioUnitario = precioUnitario / 2; 
                                        } else if (cliente instanceof ClienteMinorista) {
                                            // Aplica el 15% adicional del cliente minorista
                                            precioUnitario = cliente.aplicarDescuento(precioUnitario);
                                        }
                                        
                                        Detalle detalle = new Detalle(producto, cant, precioUnitario);
                                        factura.agregarDetalle(detalle);
                                        
                                        // ✅ Llama al método helper esencial
                                        producto.actualizarStock(cant); 
                                        System.out.println("Producto agregado.");
                                    }

                                    System.out.print("¿Desea agregar otro producto? (s/n): ");
                                    String opcion = sc.next();
                                    seguirComprando = opcion.equalsIgnoreCase("s");
                                }
                                
                                CollectionFactura.guardarFactura(factura);
                                System.out.println("Venta realizada:");
                                factura.mostrarFactura();
                                delay(3000); 
                                break;
                                
                            case 3: // Registrar Cliente
                                System.out.println("\nRegistrar Nuevo Cliente");
                                System.out.print("Ingrese DNI: ");
                                int dni = sc.nextInt(); sc.nextLine();
                                
                                if(CollectionCliente.buscarCliente(dni) != null) {
                                    System.out.println("Error: Ya existe un cliente con ese DNI.");
                                    delay(1000);
                                    break;
                                }

                                System.out.print("Nombre: ");
                                String nombre = sc.nextLine();
                                System.out.print("Apellido: ");
                                String apellido = sc.nextLine();
                                System.out.print("Dirección: ");
                                String direccion = sc.nextLine();
                                
                                System.out.println("Tipo de cliente: 1- Mayorista, 2- Minorista");
                                int tipo = sc.nextInt(); sc.nextLine();
                                
                                if (tipo == 1) {
                                    System.out.print("Código de cliente mayorista: ");
                                    int codigo = sc.nextInt(); sc.nextLine();
                                    ClienteMayorista nuevo = new ClienteMayorista(nombre, apellido, direccion, dni, codigo);
                                    CollectionCliente.guardarCliente(nuevo);
                                    System.out.println("Cliente MAYORISTA registrado.");
                                } else if (tipo == 2) {
                                    System.out.print("Obra Social: ");
                                    String obraSocial = sc.nextLine();
                                    ClienteMinorista nuevo = new ClienteMinorista(nombre, apellido, direccion, dni, obraSocial);
                                    CollectionCliente.guardarCliente(nuevo);
                                    System.out.println("Cliente MINORISTA registrado.");
                                } else {
                                    System.out.println("Opción inválida.");
                                }
                                delay(1000);
                                break;
                                
                            case 4:
                                System.out.println("Saliendo del Menu Agente Administrativo...");
                                delay(1000); 
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                        }
                    } while (op3 != 4);
                    break;
                case 3:
                    System.out.println("Saliendo del Menu de Empleados...");
                    delay(1000);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (op != 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte op;
        
        CollectionCliente.precargarCliente();
        CollectionEmpleado.precargarEmpleado();
        CollectionProducto.precargarProducto();

        do {
            System.out.println("\n **** Menu de Opciones ****");
            System.out.println("1 - Menu de Clientes");
            System.out.println("2 - Menu de Empleados");
            System.out.println("3 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    menuCliente(sc); 
                    break;
                case 2:
                    menuEmpleado(sc); 
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (op != 3);

        sc.close();
    }

    public static void delay(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}