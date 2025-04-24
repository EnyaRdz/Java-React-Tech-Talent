package Unidad09Herencia.Ej3;
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    // Constructores
    public Libro(String ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    // Métodos get y set
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    // Método toString()
    @Override
    public String toString() {
        return "El libro con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numeroDePaginas + " páginas";
    }
}