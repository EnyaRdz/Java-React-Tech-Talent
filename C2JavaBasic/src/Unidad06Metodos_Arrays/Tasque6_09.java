package Unidad06Metodos_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Tasque6_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] numeros = new int[tamaño];
        int suma = 0;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = rand.nextInt(10);
            suma += numeros[i];
        }

        System.out.println("Valores del array:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nSuma total: " + suma);
        sc.close();
    }
}
