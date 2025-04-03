package Unidad08POO;
public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	private static final char SEXO_POR_DEFECTO = 'H';

	// Constructor por defecto
	public Persona() {
		this("", 0,SEXO_POR_DEFECTO, "", 0.0, 0.0);
	}

	// Constructor con nombre, edad y sexo
	public Persona(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, "", 0.0, 0.0);
	}

	// Constructor con todos los atributos
	public Persona(String nombre, int edad, char sexo, String dni, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.setSexo(sexo);
		this.setDni(dni);
		this.setPeso(peso);
		this.setAltura(altura);
	}

	public static void main(String[] args) {
		Persona p = new Persona("Felipe", 30, 'H', "12345678A", 70.5, 1.75);
		System.out.println("Persona creada: " + p.nombre + ", " + p.edad + " años");
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}