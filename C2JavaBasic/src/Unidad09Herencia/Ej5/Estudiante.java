package Unidad09Herencia.Ej5;

import java.util.Random;

public class Estudiante extends Persona {
    private double calificacion;

    public Estudiante(String nombre, int edad, String sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public boolean estaDisponible() {
        Random random = new Random();
        return random.nextDouble() >= 0.5; // 50% de probabilidad de hacer novillos
    }
}