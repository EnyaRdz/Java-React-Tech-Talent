package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int operando1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int operando2 = sc.nextInt();
        System.out.print("Introduce la operación (+, -, *, /, ^, %): ");
        String operador = sc.next();

        switch (operador) {
            case "+" -> System.out.println("Resultado: " + (operando1 + operando2));
            case "-" -> System.out.println("Resultado: " + (operando1 - operando2));
            case "*" -> System.out.println("Resultado: " + (operando1 * operando2));
            case "/" -> System.out.println("Resultado: " + ((double) operando1 / operando2));
            case "^" -> System.out.println("Resultado: " + Math.pow(operando1, operando2));
            case "%" -> System.out.println("Resultado: " + (operando1 % operando2));
            default -> System.out.println("Operador no válido");
        }
        sc.close();
    }
}
