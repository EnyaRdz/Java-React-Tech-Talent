package Unidad04JavaBasics;
public class Tasque4_3 {
	public static void main(String[] args) {
		//Definición de variables
		int X = 20;
		int Y = 10;
		double N = 6.5;
		double M = 2.4;
		
		//Se programan las operaciones y explicación.
		
	
		//Operaciones con X,Y
		System.out.println("Valor de cada variable => "+"X="+X+"; Y="+Y+"; N="+N+"; M="+M+";");
		System.out.println("Suma X + Y = "+X+" + "+Y+" = "+(X+Y));
		System.out.println("Resta X - Y = "+X+" - "+Y+" = "+(X-Y));
		System.out.println("Multiplicaión X x Y = "+X+" x "+Y+" = "+(X*Y));
		System.out.println("División X / Y = "+X+" / "+Y+" = "+(X/Y));
		System.out.println("Residuo X / Y = "+(X%Y));
		
		//Operaciones con N,M
		System.out.println("Suma N + M = "+N+" + "+M+" = "+(N+M));
		System.out.println("Resta N - M = "+N+" - "+M+" = "+(N-M));
		System.out.println("Multiplicación N x M = "+N+" x "+M+" = "+(N*M));
		System.out.println("División N / M = "+N+" / "+M+" = "+(N/M));
		System.out.println("Residuo N / M = "+(N%M));
		
		//Operaciones con X,Y,N,M
		System.out.println("Suma X + N = "+X+" + "+N+" = "+(X+N));
		System.out.println("División Y / M = "+Y+" / "+M+" = "+(Y/M));
		System.out.println("Residuo Y / M = "+(Y%M));
		System.out.println("Doble de cada variable => "+"X="+(2*X)+"; Y="+(2*Y)+"; N="+(2*N)+"; M="+(2*M)+";");
		System.out.println("Suma de todas las variables => "+"X + Y + N + M = "+(X+Y+N+M));
		System.out.println("Multiplicación de todas las variables => "+"X x Y x N x M = "+(X*Y*N*M));
		
	}

}