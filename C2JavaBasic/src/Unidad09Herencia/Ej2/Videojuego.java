package Unidad09Herencia.Ej2;

public class Videojuego implements Entregable {

	// Clase Videojuego
	
        // Atributos
	    private String titulo;
	    private int horasEstimadas;
	    private boolean entregado;
	    private String genero;
	    private String compania;

	    // Constantes
	    private static final int HORAS_ESTIMADAS_DEFECTO = 10;
	    private static final boolean ENTREGADO_DEFECTO = false;

	    // Constructores
	    public Videojuego() {
	        this.titulo = "";
	        this.horasEstimadas = HORAS_ESTIMADAS_DEFECTO;
	        this.entregado = ENTREGADO_DEFECTO;
	        this.genero = "";
	        this.compania = "";
	    }

	    public Videojuego(String titulo, int horasEstimadas) {
	        this();
	        this.titulo = titulo;
	        this.horasEstimadas = horasEstimadas;
	    }

	    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
	        this(titulo, horasEstimadas);
	        this.genero = genero;
	        this.compania = compania;
	    }

	    // Métodos get y set
	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public int getHorasEstimadas() {
	        return horasEstimadas;
	    }

	    public void setHorasEstimadas(int horasEstimadas) {
	        this.horasEstimadas = horasEstimadas;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public String getCompania() {
	        return compania;
	    }

	    public void setCompania(String compania) {
	        this.compania = compania;
	    }

	    @Override
	    public String toString() {
	        return "Videojuego{" +
	                "titulo='" + titulo + '\'' +
	                ", horasEstimadas=" + horasEstimadas +
	                ", entregado=" + entregado +
	                ", genero='" + genero + '\'' +
	                ", compania='" + compania + '\'' +
	                '}';
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
	        if (a instanceof Videojuego) {
	            Videojuego otroVideojuego = (Videojuego) a;
	            return Integer.compare(this.horasEstimadas, otroVideojuego.horasEstimadas);
	        }
	        return 0;
	    }
	}