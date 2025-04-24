package Unidad09Herencia.Ej2;

//Clase Ejecutable
public class MainEntregable {

	public static void main(String[] args) {
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		// Crear objetos en cada posición del array
		series[0] = new Serie("The Crown", 4, "Drama", "Peter Morgan");
		series[1] = new Serie("Stranger Things", 3, "Ciencia ficción", "Hermanos Duffer");
		series[2] = new Serie("Game of Thrones", 8, "Fantasía", "David Benioff y D. B. Weiss");
		series[3] = new Serie("Breaking Bad", 5, "Crimen", "Vince Gilligan");
		series[4] = new Serie("Friends", 10, "Comedia", "David Crane y Marta Kauffman");

		videojuegos[0] = new Videojuego("The Witcher 3", 50, "RPG", "CD Projekt Red");
		videojuegos[1] = new Videojuego("Red Dead Redemption 2", 60, "Acción-Aventura", "Rockstar Games");
		videojuegos[2] = new Videojuego("The Legend of Zelda: Breath of the Wild", 45, "Acción-Aventura", "Nintendo");
		videojuegos[3] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang");
		videojuegos[4] = new Videojuego("The Last of Us", 30, "Acción", "Naughty Dog");

		// Entregar algunos Videojuegos y Series
		series[0].entregar();
		series[2].entregar();
		videojuegos[1].entregar();
		videojuegos[3].entregar();

		// Contar cuantos Series y Videojuegos hay entregados
		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;

		for (Serie serie : series) {
			if (serie.isEntregado()) {
				seriesEntregadas++;
				serie.devolver(); // Devolver después de contar
			}
		}

		for (Videojuego videojuego : videojuegos) {
			if (videojuego.isEntregado()) {
				videojuegosEntregados++;
				videojuego.devolver(); // Devolver después de contar
			}
		}

		System.out.println("Series entregadas: " + seriesEntregadas);
		System.out.println("Videojuegos entregados: " + videojuegosEntregados);

		// Encontrar el Videojuego con más horas estimadas y la Serie con más temporadas
		Videojuego videojuegoMasLargo = videojuegos[0];
		Serie serieMasLarga = series[0];

		for (int i = 1; i < series.length; i++) {
			if (series[i].compareTo(serieMasLarga) > 0) {
				serieMasLarga = series[i];
			}
		}

		for (int i = 1; i < videojuegos.length; i++) {
			if (videojuegos[i].compareTo(videojuegoMasLargo) > 0) {
				videojuegoMasLargo = videojuegos[i];
			}
		}

		// Mostrar la información del Videojuego y Serie
		System.out.println("Videojuego con más horas estimadas: " + videojuegoMasLargo);
		System.out.println("Serie con más temporadas: " + serieMasLarga);
	}
}