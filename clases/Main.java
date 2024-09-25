package clases;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ingreso del nombre y cedula del cliente 
        System.out.println("Ingrese la cedula del cliente:");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        Cliente cliente = new Cliente(cedula, nombre);

        // Imprime los detalles del cliente
        System.out.println("Detalles del cliente:");
        System.out.println("Cedula: " + cliente.getCedula());
        System.out.println("Nombre: " + cliente.getNombre());

        // Ingreso de datos  de los productos en el arreglo
        System.out.println("Ingrese el número de productos:");
        int numProductos = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        Producto[] productos = new Producto[numProductos];

        for (int i = 0; i < numProductos; i++) {
            System.out.println("Ingrese el tipo de producto (Camara o Impresion):");
            String tipoProducto = scanner.nextLine();

            if (tipoProducto.equalsIgnoreCase("Camara")) {
                System.out.println("Ingrese la marca de la camara:");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el modelo de la camara:");
                String modelo = scanner.nextLine();
                System.out.println("Ingrese el número de la camara:");
                int numero = scanner.nextInt();
                scanner.nextLine(); // Salto de linea
                Camara camara = new Camara(marca, modelo, numero);
                productos[i] = camara;

                // Se imprime los detalles de la camara
                System.out.println("Detalles de la camara:");
                System.out.println("Marca: " + camara.getMarca());
                System.out.println("Modelo: " + camara.getModelo());
                System.out.println("Numero: " + camara.getNumero());
            } else if (tipoProducto.equalsIgnoreCase("Impresion")) {
                System.out.println("Ingrese el color de la impresion:");
                String color = scanner.nextLine();
                System.out.println("Ingrese el número de fotos:");
                int numFotos = scanner.nextInt();
                scanner.nextLine(); // Salto de linea
                Foto[] fotos = new Foto[numFotos];
                for (int j = 0; j < numFotos; j++) {
                    System.out.println("Ingrese el fichero de la foto " + (j + 1) + ":");
                    String fichero = scanner.nextLine();
                    fotos[j] = new Foto(fichero);
                }
                System.out.println("Ingrese el número de la impresion:");
                int numero = scanner.nextInt();
                scanner.nextLine(); // Salto de linea
                Impresion impresion = new Impresion(color, fotos, numero);
                productos[i] = impresion;

                //Se imprime los detalles de la impresion
                System.out.println("Detalles de la impresion:");
                System.out.println("Color: " + impresion.getColor());
                for (int j = 0; j < numFotos; j++) {
                    System.out.println("Foto " + (j + 1) + ": " + impresion.getFotos()[j].fichero);
                }
                System.out.println("Numero: " + impresion.getNumero());
            }
        }

        // Se ingresa la fecha 
        System.out.println("Ingrese la fecha del pedido (dd/mm/yyyy):");
        String fechaStr = scanner.nextLine();
        Date fecha = new Date(fechaStr);
        System.out.println("Ingrese el número de tarjeta de crédito:");
        int numeroTarjetaCredito = scanner.nextInt();
        scanner.nextLine(); // Salto de linea
        Pedido pedido = new Pedido(cliente, productos, fecha, numeroTarjetaCredito);

        // Se imprimen todos los detalles del pedido
        System.out.println("Detalles del pedido:");
        System.out.println("Cliente: " + pedido.getCliente().getNombre() + "Cedula: " + pedido.getCliente().getCedula());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Numero de tarjeta de crédito: " + pedido.getNumeroTarjetaCredito());
        pedido.mostrarDetallesPedido();
    }
}
/*
La clase Main es la clase principal del programa, que se encarga de crear instancias de las clases Cliente, Camara, Impresion y Pedido, y mostrar los detalles del pedido.
*/
