package Unidad05FlujoDatos;

public class Tasque5_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
