package Unidad06Metodos_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Tasque6_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros a generar: ");
		int cantidad = sc.nextInt();
		System.out.println("Introduce el valor minimo: ");
		int minimo = sc.nextInt();
		System.out.println("Introduce el valor maximo: ");
		int maximo = sc.nextInt();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println(generarAleatorio(minimo, maximo));
		}
		sc.close();
	}

	public static int generarAleatorio(int minimo, int maximo) {
		Random r = new Random();
		return r.nextInt(maximo - minimo + 1) + minimo;
	}
}
