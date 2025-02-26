package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de ventas: ");
        int ventas = sc.nextInt();
        double sumaVentas = 0;
        for (int i = 0; i < ventas; i++) {
            System.out.print("Introduce la venta " + (i + 1) + ": ");
            sumaVentas += sc.nextDouble();
        }
        System.out.println("El total de las ventas es: " + sumaVentas);
        sc.close();
    }
}
