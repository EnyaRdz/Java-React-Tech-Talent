package Unidad05FlujoDatos;

import javax.swing.JOptionPane;

public class Tasque5_4 {

	public static void main(String[] args) {

		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo:"));
		double area = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);

	}

}
