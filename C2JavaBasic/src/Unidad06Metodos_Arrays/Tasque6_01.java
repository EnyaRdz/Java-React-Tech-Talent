package Unidad06Metodos_Arrays;

import java.util.Scanner;

public class Tasque6_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la figura (circulo, cuadrado, triangulo): ");
		String figura = sc.nextLine();

		switch (figura) {
		case "circulo":
			System.out.println("Introduce el radio: ");
			double radio = sc.nextDouble();
			System.out.println("El area del circulo es: " + calcularAreaCirculo(radio));
			break;

		case "cuadrado":
			System.out.println("Introduce el lado: ");
			double lado = sc.nextDouble();
			System.out.println("El area del cuadrado es: " + calcularAreaCuadrado(lado));
			break;

		case "triangulo":
			System.out.println("Introduce la base: ");
			double base = sc.nextDouble();
			System.out.println("Introduce la altura: ");
			double altura = sc.nextDouble();
			System.out.println("El area del triangulo es: " + calcularAreaTriangulo(base, altura));
			break;
		
		default:
            System.out.println("Figura no valida");
            break;
        }
		sc.close();
    }
		public static double calcularAreaCirculo(double radio) {
			return Math.PI * Math.pow(radio, 2);
		}
		
		public static double calcularAreaCuadrado(double lado) {
			return Math.pow(lado, 2);
		}
		
		public static double calcularAreaTriangulo(double base, double altura) {
			return (base * altura) / 2;
		}
}
