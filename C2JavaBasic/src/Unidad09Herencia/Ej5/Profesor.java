package Unidad09Herencia.Ej5;

import java.util.Random;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public boolean estaDisponible() {
        Random random = new Random();
        return random.nextDouble() >= 0.2; // 20% de probabilidad de no estar disponible
    }
}