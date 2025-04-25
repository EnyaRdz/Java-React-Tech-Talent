package Unidad09Herencia.Ej5;
import java.util.Random;

public class MainAula {

    public static void main(String[] args) {
        // Crear un aula
        Aula aula1 = new Aula(101, 30, "matemáticas");

        // Crear un profesor
        Profesor profesor1 = new Profesor("Juan Pérez", 35, "hombre", "matemáticas");
        aula1.setProfesor(profesor1);

        // Crear estudiantes
        Random random = new Random();
        String[] nombresHombres = {"Carlos", "Luis", "Pedro", "Javier", "Miguel"};
        String[] nombresMujeres = {"Ana", "María", "Laura", "Sofía", "Isabel"};

        for (int i = 0; i < 20; i++) {
            String nombre;
            String sexo;
            if (random.nextBoolean()) {
                nombre = nombresHombres[random.nextInt(nombresHombres.length)];
                sexo = "hombre";
            } else {
                nombre = nombresMujeres[random.nextInt(nombresMujeres.length)];
                sexo = "mujer";
            }
            int edad = random.nextInt(10) + 18; // Edad entre 18 y 27
            double calificacion = random.nextDouble() * 10; // Calificación entre 0 y 10

            Estudiante estudiante = new Estudiante(nombre, edad, sexo, calificacion);
            aula1.agregarEstudiante(estudiante);
        }

        // Determinar si se puede dar clase y mostrar resultados
        if (aula1.sePuedeDarClase()) {
            System.out.println("Se puede dar clase en el aula " + aula1.getId
            		());
            aula1.mostrarResultados();
        } else {
            System.out.println("No se puede dar clase en el aula " + aula1.getId());
        }
    }
}
