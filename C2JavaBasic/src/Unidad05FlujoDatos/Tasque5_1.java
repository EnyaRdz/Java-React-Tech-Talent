package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int a = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " es mayor que " + b);
		} else if (a < b) {
			System.out.println(b + " es mayor que " + a);
		} else {
			System.out.println("Ambos números son iguales.");
		}
		sc.close();
	}
}
