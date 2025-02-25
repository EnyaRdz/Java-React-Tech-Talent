package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es divisible entre 2");
        } else {
            System.out.println("El número no es divisible entre 2");
        }
        sc.close();
    }
}
