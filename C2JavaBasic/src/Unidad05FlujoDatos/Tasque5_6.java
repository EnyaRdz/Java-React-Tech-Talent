package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        final double IVA = 0.21;
        double precioFinal = precio + (precio * IVA);
        System.out.println("El precio final con IVA es: " + precioFinal);
        sc.close();
    } 
}
