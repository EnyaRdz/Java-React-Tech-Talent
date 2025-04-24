package Unidad09Herencia.Ej1;

public class Electrodomestico {

	// Constantes
	protected static final String COLOR_DEFECTO = "blanco";
	protected static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
	protected static final double PRECIO_BASE_DEFECTO = 100;
	protected static final double PESO_DEFECTO = 5;

	// Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Constructores
	public Electrodomestico() {
		this(PRECIO_BASE_DEFECTO, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, peso);
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// Métodos get
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// Métodos de comprobación (privados)
	private char comprobarConsumoEnergetico(char letra) {
		if (letra >= 'A' && letra <= 'F') {
			return letra;
		} else {
			return CONSUMO_ENERGETICO_DEFECTO;
		}
	}

	private String comprobarColor(String color) {
		String[] coloresDisponibles = { "blanco", "negro", "rojo", "azul", "gris" };
		for (String c : coloresDisponibles) {
			if (c.equalsIgnoreCase(color)) {
				return c;
			}
		}
		return COLOR_DEFECTO;
	}

	// Método precioFinal()
	public double precioFinal() {
		double precioFinal = precioBase;

		switch (consumoEnergetico) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;
		}

		if (peso >= 0 && peso <= 19) {
			precioFinal += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		} else if (peso > 80) {
			precioFinal += 100;
		}

		return precioFinal;
	}

}
