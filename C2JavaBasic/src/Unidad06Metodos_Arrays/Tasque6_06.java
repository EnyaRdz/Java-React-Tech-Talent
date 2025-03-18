package Unidad06Metodos_Arrays;

import java.util.Scanner;

public class Tasque6_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();
        System.out.println("El número tiene " + contarCifras(num) + " cifras.");
        sc.close();
    }

    public static int contarCifras(int num) {
        return String.valueOf(num).length();
    }
}
