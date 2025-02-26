package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String dia = sc.next().toLowerCase();
        switch (dia) {
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                System.out.println("Es un día laboral");
                break;
           
   
            case "sábado", "domingo":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("Día no válido");
        }
        sc.close();
    }
}

