package Unidad08POO;
// Clase Password
import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;
    private static final int LONGITUD_POR_DEFECTO = 8;
    
    // Constructor por defecto
    public Password() {
        this(LONGITUD_POR_DEFECTO);
    }
    
    // Constructor con longitud personalizada
    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }
    
    private String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return password.toString();
    }
    
    public static void main(String[] args) {
        Password pass = new Password(12);
        System.out.println("Contraseña generada: " + pass.contrasena);
    }
}