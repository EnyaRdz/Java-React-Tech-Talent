package Unidad09Herencia.Ej4;

public class MainRaices {
	public static void main(String[] args) {
		Raices ecuacion1 = new Raices(1, -5, 6); // Dos raíces
		Raices ecuacion2 = new Raices(1, -4, 4); // Una raíz
		Raices ecuacion3 = new Raices(1, 2, 5); // Sin raíces reales

		System.out.println("Ecuación 1:");
		ecuacion1.calcular();

		System.out.println("\nEcuación 2:");
		ecuacion2.calcular();

		System.out.println("\nEcuación 3:");
		ecuacion3.calcular();
	}
}
