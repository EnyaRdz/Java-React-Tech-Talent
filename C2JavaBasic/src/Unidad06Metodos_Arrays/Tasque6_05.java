package Unidad06Metodos_Arrays;

import java.util.Scanner;

public class Tasque6_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        int num = sc.nextInt();
        System.out.println("El número en binario es: " + convertirABinario(num));
        sc.close();
    }

    public static String convertirABinario(int num) {
        return Integer.toBinaryString(num);
    }
}
