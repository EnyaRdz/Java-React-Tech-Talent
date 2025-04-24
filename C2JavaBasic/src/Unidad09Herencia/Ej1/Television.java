package Unidad09Herencia.Ej1;

public class Television extends Electrodomestico  { 
	// Subclase Television

	    // Constantes
	    private static final int RESOLUCION_DEFECTO = 20;
	    private static final boolean SINTONIZADOR_TDT_DEFECTO = false;
		private static final double PRECIO_BASE_DEFECTO = 0;
		private static final String COLOR_DEFECTO = null;
		private static final char CONSUMO_ENERGETICO_DEFECTO = 0;
		private static final double PESO_DEFECTO = 0;

	    // Atributos
	    private int resolucion;
	    private boolean sintonizadorTDT;

	    // Constructores
	    public Television() {
	        this(PRECIO_BASE_DEFECTO, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO, RESOLUCION_DEFECTO, SINTONIZADOR_TDT_DEFECTO);
	    }

	    public Television(double precioBase, double peso) {
	        this(precioBase, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, peso, RESOLUCION_DEFECTO, SINTONIZADOR_TDT_DEFECTO);
	    }

	    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
	        super(precioBase, color, consumoEnergetico, peso);
	        this.resolucion = resolucion;
	        this.sintonizadorTDT = sintonizadorTDT;
	    }

	    // Métodos get
	    public int getResolucion() {
	        return resolucion;
	    }

	    public boolean isSintonizadorTDT() {
	        return sintonizadorTDT;
	    }

	    // Método precioFinal()
	    public double precioFinal() {
	        double precioFinal = super.precioFinal(); // Llama al método de la superclase

	        if (resolucion > 40) {
	            precioFinal *= 1.30; // Incrementa el precio en un 30%
	        }
	        if (sintonizadorTDT) {
	            precioFinal += 50;
	        }

	        return precioFinal;
	    }
	}
