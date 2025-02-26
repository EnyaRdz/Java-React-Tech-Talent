package Unidad05FlujoDatos;

import java.util.Scanner;

public class Tasque5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "clave123";
        boolean accesoPermitido = false;
        for (int intentos = 3; intentos > 0; intentos--) {
            System.out.print("Introduce la contraseña: ");
            String intento = sc.next();
            if (intento.equals(password)) {
                System.out.println("Enhorabuena, acceso concedido");
                accesoPermitido = true;
                break;
            }
            System.out.println("Contraseña incorrecta, intentos restantes: " + (intentos - 1));
        }
        if (!accesoPermitido) {
            System.out.println("Acceso denegado");
        }
        sc.close();
    }
}
