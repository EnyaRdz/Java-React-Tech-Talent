package Unidad07Arraylist;

import java.util.*;

public class Tasque7_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Registro alumnos y sus notas
        HashMap<String, List<Double>> notasAlumnos = registrarNotas(scanner);

        // Paso 2: Calcular y almacenar las medias
        HashMap<String, Double> medias = calcularMedias(notasAlumnos);

        // Paso 3: Mostrar las notas y sus respectivas medias
        mostrarResultados(notasAlumnos, medias);

        scanner.close();
    }

    // Método para registrar alumnos y sus notas
    public static HashMap<String, List<Double>> registrarNotas(Scanner scanner) {
        HashMap<String, List<Double>> alumnos = new HashMap<>();

        System.out.print("Ingrese el número de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("¿Cuántas notas tiene " + nombre + "? ");
            int cantidadNotas = scanner.nextInt();

            List<Double> notas = new ArrayList<>();
            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Introduce la nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                notas.add(nota);
            }

            scanner.nextLine(); // Limpiar buffer
            alumnos.put(nombre, notas);
        }

        return alumnos;
    }

    // Método para calcular las medias de los alumnos
    public static HashMap<String, Double> calcularMedias(HashMap<String, List<Double>> alumnos) {
        HashMap<String, Double> medias = new HashMap<>();

        for (Map.Entry<String, List<Double>> entrada : alumnos.entrySet()) {
            String nombre = entrada.getKey();
            List<Double> notas = entrada.getValue();

            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }

            double media = suma / notas.size();
            medias.put(nombre, media);
        }

        return medias;
    }

    // Método para mostrar la lista de notas y sus medias
    public static void mostrarResultados(HashMap<String, List<Double>> alumnos, HashMap<String, Double> medias) {
        System.out.println("\n--- Resultados ---");
        for (String nombre : alumnos.keySet()) {
            System.out.println("Alumno: " + nombre);
            System.out.println("Notas: " + alumnos.get(nombre));
            System.out.printf("Nota media: %.2f\n", medias.get(nombre));
            System.out.println("---------------------");
        }
    }
}
