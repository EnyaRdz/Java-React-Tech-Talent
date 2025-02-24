package Unidad04JavaBasics;
public class Tasque4_5 {
	public static void main(String[] args) {
	//Definicion variables 
	int A = 9;
	int B = 4;
	int C = 6;
	int D = 10;
	int B1 = B;
	System.out.println("Valor de cada variable = "+"A="+A+"; B="+B+"; C="+C+"; D="+D+";");
	
	//B Toma el valor de C
	B = C;
	System.out.println("B toma el valor de C = "+ B);
	
	//C Toma el valor de A
	C = A;
	System.out.println("C Toma el valor de A = "+ C);
	
	//A Toma el valor de D
	A = D;
	System.out.println("A Toma el valor de D = "+ A);
	
	//D Toma el valor de B
	D = B1;
	System.out.println("D toma el valor de B = "+ D);
	
	//Valores finales 
	System.out.println("Valor de cada variable = " +"A="+A+"; B="+B+"; C="+C+"; D="+D+";");
	}
}
