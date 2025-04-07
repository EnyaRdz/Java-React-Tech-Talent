package Unidad08POO;

// Clase Electrodomestico
public class Electrodomestico {
	
	// Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
	// Constantes
    private static final String COLOR_POR_DEFECTO = "Blanco";
    private static final char CONSUMO_POR_DEFECTO = 'F';
    private static final double PRECIO_POR_DEFECTO = 100;
    private static final double PESO_POR_DEFECTO = 5;
    
    // Constructor por defecto
    public Electrodomestico() {
        this(PRECIO_POR_DEFECTO, PESO_POR_DEFECTO, COLOR_POR_DEFECTO, CONSUMO_POR_DEFECTO);
    }
    
    // Constructor con precio y peso
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, COLOR_POR_DEFECTO, CONSUMO_POR_DEFECTO);
    }
    
    // Constructor con todos los atributos
    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }
    
    public static void main(String[] args) {
        Electrodomestico e = new Electrodomestico(250, 15, "Rojo", 'A');
        System.out.println("Electrodoméstico creado: " + e.color + ", Consumo: " + e.consumoEnergetico);
    }
}
