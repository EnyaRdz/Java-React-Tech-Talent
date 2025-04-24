package Unidad09Herencia.Ej4;

public class Raices {
	private double a;
    private double b;
    private double c;

    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Métodos
    public double getDiscriminante() {
        return (b * b) - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene soluciones reales");
        }
    }

    public void obtenerRaices() {
        double raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        double raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        System.out.println("Solución 1: " + raiz1);
        System.out.println("Solución 2: " + raiz2);
    }

    public void obtenerRaiz() {
        double raiz = -b / (2 * a);
        System.out.println("Única solución: " + raiz);
    }
}