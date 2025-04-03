package Unidad09Herencia;

import java.util.Random;

class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMin;
    private String director;

    public Pelicula(String titulo, int duracion, int edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public String getDirector() {
        return director;
    }
}

class Espectador {
    private String nombre;
    private int edad;
    private int dinero;

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public int getDinero() {
        return dinero;
    }
}

class Cine {
    private String pelicula;
    private int precio;
    private String[][] asientos;

    public Cine(String pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.asientos = new String[8][8];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        char fila = 'A';
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = fila + Integer.toString(j + 1);
            }
            fila++;
        }
    }

    public boolean asignarAsiento(Espectador espectador, Pelicula pelicula) {
        if (espectador.getEdad() >= pelicula.getEdadMin() && espectador.getDinero() >= precio) {
            Random rand = new Random();
            int fila = rand.nextInt(asientos.length);
            int columna = rand.nextInt(asientos[0].length);
            
            if (!asientos[fila][columna].equals("XX")) {
                asientos[fila][columna] = "XX";
                return true;
            }
        }
        return false;
    }

    public void mostrarAsientos() {
        for (String[] fila : asientos) {
            for (String asiento : fila) {
                System.out.print(asiento + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Espectador espectador = new Espectador("Jose", 18, 50);
        Pelicula pelicula = new Pelicula("Interstellar", 169, 16, "Christopher Nolan");
        Cine cine = new Cine("Cinepolis", 12);
        
        if (cine.asignarAsiento(espectador, pelicula)) {
            System.out.println("El espectador ha conseguido un asiento.");
        } else {
            System.out.println("No se pudo asignar un asiento.");
        }
        
        cine.mostrarAsientos();
    }
}