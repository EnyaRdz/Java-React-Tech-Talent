package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido/a");
		System.out.println("Introduce tu nombre:");
		
		String name = sc.nextLine();
		sc.close();

		System.out.println("Bienvenido/a " +name.toUpperCase());
	}

}
