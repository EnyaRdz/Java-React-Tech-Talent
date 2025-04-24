package Unidad09Herencia.Ej2;

//Clase Serie
public class Serie implements Entregable {
	private String titulo;
	private int numeroDeTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constantes
	private static final int NUMERO_DE_TEMPORADAS_DEFECTO = 3;
	private static final boolean ENTREGADO_DEFECTO = false;

	// Constructores
	public Serie() {
		this.titulo = "";
		this.numeroDeTemporadas = NUMERO_DE_TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this(titulo, creador);
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
	}

	// Métodos get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie{" + "titulo='" + titulo + '\'' + ", numeroDeTemporadas=" + numeroDeTemporadas + ", entregado="
				+ entregado + ", genero='" + genero + '\'' + ", creador='" + creador + '\'' + '}';
	}

	// Métodos de la interfaz Entregable
	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		if (a instanceof Serie) {
			Serie otraSerie = (Serie) a;
			return Integer.compare(this.numeroDeTemporadas, otraSerie.numeroDeTemporadas);
		}
		return 0;
	}
}
