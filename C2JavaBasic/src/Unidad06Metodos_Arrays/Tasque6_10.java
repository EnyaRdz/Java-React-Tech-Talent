package Unidad06Metodos_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Tasque6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] numeros = new int[tamaño];
        int maxPrimo = 0;
        for (int i = 0; i < tamaño; i++) {
            int num;
            do {
                num = rand.nextInt(100) + 1;
            } while (!esPrimo(num));

            numeros[i] = num;
            if (num > maxPrimo) maxPrimo = num;
        }

        System.out.println("Números primos generados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nMayor número primo: " + maxPrimo);
        sc.close();
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
