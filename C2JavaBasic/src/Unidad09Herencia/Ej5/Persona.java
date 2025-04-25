package Unidad09Herencia.Ej5;

public class Persona {
	  private String nombre;
	    private int edad;
	    private String sexo;

	    public Persona(String nombre, int edad, String sexo) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public boolean estaDisponible() {
	        return true; // Por defecto, la persona está disponible
	    }
	}
