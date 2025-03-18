package Unidad06Metodos_Arrays;

import java.util.Scanner;

public class Tasque6_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Valores del array:")
        ;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " → Valor: " + numeros[i]);
        }

        sc.close();
    }
}
