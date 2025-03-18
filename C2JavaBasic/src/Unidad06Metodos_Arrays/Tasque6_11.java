package Unidad06Metodos_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Tasque6_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la dimensión de los arrays: ");
		int dimension = sc.nextInt();

		int[] array1 = rellenarArray(dimension); // array1 se rellena de randoms con el método
//		array1 = rellenarArray1(dimension);

		int[] array2 = rellenarArray(dimension);
//		array2 = rellenarNumeros(dimension);

		int[] multiplicado = multiplicarArrays(array1, array2);
//		multiplicado = multiplicarArrays(array1, array2);

		
//		Imprimir los arrays
		System.out.println("Array1 ");
		for (int num : array1) {
			System.out.println(num);
		}
		System.out.println("Array2 ");
		for (int num : array2) {
			System.out.println(num);
		}
		System.out.println("Array Multiplicado ");
		for (int num : multiplicado) {
			System.out.println(num);
		}

		sc.close();
	}

	public static int[] rellenarArray(int tamany) {

		Random aleatorio = new Random();
		int[] arrayPrimero = new int[tamany];

		for (int i = 0; i < tamany; i++) {

			arrayPrimero[i] = aleatorio.nextInt(11);
		}
		// arrayPrimero = {8,5,3}

		return arrayPrimero;
	}

	public static int[] multiplicarArrays(int[] array1, int[] array2) {

		int[] resultado = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			resultado[i] = array1[i] * array2[i];
		}
		return resultado;
	}
}


