package Unidad06Metodos_Arrays;

import java.util.Scanner;

public class Tasque6_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();
        System.out.print("Introduce la moneda a convertir (dolar, libra, yen): ");
        String moneda = sc.next().toLowerCase();
        convertirMoneda(euros, moneda);
        sc.close();
    }

    public static void convertirMoneda(double euros, String moneda) {
        double resultado;
        switch (moneda) {
            case "dolar" -> resultado = euros * 1.28611;
            case "libra" -> resultado = euros * 0.86;
            case "yen" -> resultado = euros * 129.852;
            default -> {
                System.out.println("Moneda no válida.");
                return;
            }
        }
        System.out.println(euros + " euros equivale a " + resultado + " " + moneda);
    }
}
