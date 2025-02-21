package Unidad05FlujoDatos;

public class Tasque5_4 {
	
	import javax.swing.JOptionPane;
	public static void main(String[] args) {

	double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo:"));
	double area = Math.PI * Math.pow(radio, 2);
	JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);

	}

}
