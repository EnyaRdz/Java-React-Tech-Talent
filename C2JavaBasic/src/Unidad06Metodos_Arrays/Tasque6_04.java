package Unidad06Metodos_Arrays;

import java.util.Scanner;

public class Tasque6_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("El factorial de " + num + " es " + calcularFactorial(num));
        sc.close();
    }

    public static long calcularFactorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
