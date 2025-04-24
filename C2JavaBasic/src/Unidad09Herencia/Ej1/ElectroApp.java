package Unidad09Herencia.Ej1;

public class ElectroApp {

	// Clase Ejecutable
	public class MainElectrodomesticos {

	    public static void main(String[] args) {
	        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

	        // Asignar objetos a cada posición del array
	        electrodomesticos[0] = new Electrodomestico(200, "rojo", 'A', 10);
	        electrodomesticos[1] = new Lavadora(300, "blanco", 'B', 60, 40);
	        electrodomesticos[2] = new Television(500, "negro", 'C', 80, 50, true);
	        electrodomesticos[3] = new Electrodomestico(150, "azul", 'F', 5);
	        electrodomesticos[4] = new Lavadora(250, 40);
	        electrodomesticos[5] = new Television(400, 30);
	        electrodomesticos[6] = new Electrodomestico();
	        electrodomesticos[7] = new Lavadora();
	        electrodomesticos[8] = new Television();
	        electrodomesticos[9] = new Lavadora(350, "gris", 'D', 70, 35);

	        double totalElectrodomesticos = 0;
	        double totalLavadoras = 0;
	        double totalTelevisiones = 0;

	        // Recorrer el array y calcular los precios finales
	        for (Electrodomestico electrodomestico : electrodomesticos) {
	            double precioFinal = electrodomestico.precioFinal();

	            if (electrodomestico instanceof Lavadora) {
	                totalLavadoras += precioFinal;
	            } else if (electrodomestico instanceof Television) {
	                totalTelevisiones += precioFinal;
	            }

	            totalElectrodomesticos += precioFinal;
	        }

	        // Mostrar los resultados
	        System.out.println("Precio total de los electrodomésticos: " + totalElectrodomesticos + " €");
	        System.out.println("Precio total de las lavadoras: " + totalLavadoras + " €");
	        System.out.println("Precio total de las televisiones: " + totalTelevisiones + " €");
	    }
	}
}
