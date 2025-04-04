package Unidad09Herencia.Ej2;

//Clase Serie
public class Serie {
 private String titulo;
 private int numeroTemporadas;
 private boolean entregado;
 private String genero;
 private String creador;
 
 private static final int TEMPORADAS_POR_DEFECTO = 3;
 private static final boolean ENTREGADO_POR_DEFECTO = false;
 
 // Constructor por defecto
 public Serie() {
     this("", "");
 }
 
 // Constructor con título y creador
 public Serie(String titulo, String creador) {
     this(titulo, creador, TEMPORADAS_POR_DEFECTO, "");
 }
 
 // Constructor con todos los atributos menos entregado
 public Serie(String titulo, String creador, int numeroTemporadas, String genero) {
     this.titulo = titulo;
     this.creador = creador;
     this.setNumeroTemporadas(numeroTemporadas);
     this.setGenero(genero);
     this.setEntregado(ENTREGADO_POR_DEFECTO);
 }
 
 public static void main(String[] args) {
     Serie s = new Serie("Breaking Bad", "Vince Gilligan", 5, "Drama");
     System.out.println("Serie creada: " + s.titulo + " de " + s.creador);
 }

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}