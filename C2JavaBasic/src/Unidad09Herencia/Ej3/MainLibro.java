package Unidad09Herencia.Ej3;

public class MainLibro {
	public static void main(String[] args) {
		// Crear dos objetos Libro
		Libro libro1 = new Libro("978-0321765723", "The Lord of the Rings", "J. R. R. Tolkien", 1178);
		Libro libro2 = new Libro("978-0743273565", "The Great Gatsby", "F. Scott Fitzgerald", 180);

		// Mostrar la información de los libros
		System.out.println(libro1);
		System.out.println(libro2);

		// Indicar cuál tiene más páginas
		if (libro1.getNumeroDePaginas() > libro2.getNumeroDePaginas()) {
			System.out.println(libro1.getTitulo() + " tiene más páginas que " + libro2.getTitulo());
		} else if (libro2.getNumeroDePaginas() > libro1.getNumeroDePaginas()) {
			System.out.println(libro2.getTitulo() + " tiene más páginas que " + libro1.getTitulo());
		} else {
			System.out.println("Ambos libros tienen el mismo número de páginas");
		}
	}
}