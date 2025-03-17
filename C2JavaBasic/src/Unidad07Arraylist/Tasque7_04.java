package Unidad07Arraylist;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Tasque7_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Integer> inventario = new Hashtable<>();
        ArrayList<Double> carrito = new ArrayList<>();

        gestionarSistema(sc, inventario, carrito);
        sc.close();
    }

    public static void gestionarSistema(Scanner sc, Hashtable<String, Integer> inventario, ArrayList<Double> carrito) {
        int opcion;
        do {
            System.out.println("\n1. Agregar producto al carrito\n2. Ver carrito y total\n3. Finalizar compra\n4. Mostrar stock\n5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregarAlCarrito(sc, inventario, carrito);
                case 2 -> mostrarTotal(carrito);
                case 3 -> finalizarCompra(sc, carrito);
                case 4 -> {
                    inventario.put("Producto 1", 10);
                    inventario.put("Producto 2", 5);
                    inventario.put("Producto 3", 3);
                    System.out.println(inventario);
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void agregarAlCarrito(Scanner sc, Hashtable<String, Integer> inventario, ArrayList<Double> carrito) {
        System.out.print("Introduce el nombre del producto: ");
        String producto = sc.nextLine();
        if (inventario.containsKey(producto) && inventario.get(producto) > 0) {
            System.out.print("Introduce la cantidad: ");
            int cantidad = sc.nextInt();
            if (cantidad <= inventario.get(producto)) {
                inventario.put(producto, inventario.get(producto) - cantidad);
                carrito.add(2.5 * cantidad);
                System.out.println("Producto agregado.");
            } else {
                System.out.println("Stock insuficiente.");
            }
        } else {
            System.out.println("Producto no disponible.");
        }
    }

    public static void mostrarTotal(ArrayList<Double> carrito) {
        double total = carrito.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total de la compra: " + total);
    }

    public static void finalizarCompra(Scanner sc, ArrayList<Double> carrito) {
        System.out.print("Introduce el dinero entregado: ");
        double pago = sc.nextDouble();
        double total = carrito.stream().mapToDouble(Double::doubleValue).sum();
        if (pago >= total) {
            System.out.println("Compra finalizada. Cambio: " + (pago - total));
            carrito.clear();
        } else {
            System.out.println("Dinero insuficiente.");
        }
    }
}
