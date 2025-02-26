package Unidad05FlujoDatos;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        
        int op1=0, op2=0;
        String signo = "";
        
     
        String input1 = JOptionPane.showInputDialog(null, "Introduce el primer número: ");
        op1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog(null, "Introduce el segundo número: ");
        op2 = Integer.parseInt(input2);
        
        signo = JOptionPane.showInputDialog(null, "Introduce la operación (+, -, *, /, ^, %): ");
        
		switch (signo) {
			case "+" -> JOptionPane.showMessageDialog(null, "Resultado: " + (op1 + op2));
			case "-" -> JOptionPane.showMessageDialog(null, "Resultado: " + (op1 - op2));
			case "*" -> JOptionPane.showMessageDialog(null, "Resultado: " + (op1 * op2));
			case "/" -> JOptionPane.showMessageDialog(null, "Resultado: " + ((double) op1 / op2));
			case "^" -> JOptionPane.showMessageDialog(null, "Resultado: " + Math.pow(op1, op2));
			case "%" -> JOptionPane.showMessageDialog(null, "Resultado: " + (op1 % op2));
			default -> JOptionPane.showMessageDialog(null, "Operador no válido");
		}
		
        
        //System.out.println() es equivalente a JOptionPane.showMessageDialog(null, "")
        //Scanner sc = new Scanner(System.in); es equivalente a String input = JOptionPane.showInputDialog(null, "");
    }
}
