package Unidad09Herencia.Ej1;

public class Lavadora extends Electrodomestico {
	// Subclase Lavadora
	
		// Constante
		private static final int CARGA_DEFECTO = 5;

		// Atributo
		private int carga;

		// Constructores
		public Lavadora() {
			this(PRECIO_BASE_DEFECTO, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO, CARGA_DEFECTO);
		}

		public Lavadora(double precioBase, double peso) {
			this(precioBase, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, peso, CARGA_DEFECTO);
		}

		public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
			super(precioBase, color, consumoEnergetico, peso);
			this.carga = carga;
		}

		// Método get
		public int getCarga() {
			return carga;
		}

		// Método precioFinal()
		@Override
	    public double precioFinal() {
	        double precioFinal = super.precioFinal(); // Llama al método de la superclase

	        if (carga > 30) {
	            precioFinal += 50;
	        }

	        return precioFinal;
	    }
}	