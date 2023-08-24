public class Ejercicio02App {

	public static void main(String[] args) {

		// Creamos los arrays de Series y de Videojuegos
		Serie series[] = new Serie[5];
		Videojuego videojuegos[] = new Videojuego[5];

		// Rellenamos los arrays
		series[0] = new Serie("American Horror Story", 10, "Terror", "Ryan Murphy");
		series[1] = new Serie("Gambito de dama", "Scott Frank");
		series[2] = new Serie();
		series[3] = new Serie("The Witcher", "Mike Ostrowski");
		series[4] = new Serie("Narcos", 3, "Drama", "Chris Brancato");

		videojuegos[0] = new Videojuego("Minecraft", 100, "Sandbox", "Markus Persson");
		videojuegos[1] = new Videojuego();
		videojuegos[2] = new Videojuego("Half-Life 2", 14);
		videojuegos[3] = new Videojuego("The Legend of Zelda: Breath of the Wild", 50, "Aventura", "Eiji Aonuma");
		videojuegos[4] = new Videojuego("Baldur's Gate III", 90);

		// Entregamos algunas Series y Videojuegos
		series[2].entregar();
		series[4].entregar();
		videojuegos[1].entregar();
		videojuegos[3].entregar();

		// Contamos las series y los videojuegos entregados y los devolvemos
		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;

		for (Serie serie : series) {
			if (serie.isEntregado()) {
				seriesEntregadas++;
				serie.devolver();
			}
		}

		for (Videojuego videojuego : videojuegos) {
			if (videojuego.isEntregado()) {
				videojuegosEntregados++;
				videojuego.devolver();
			}
		}

		System.out.println("Series entregadas: " + seriesEntregadas);
		System.out.println("Videojuegos entregados: " + videojuegosEntregados);

		System.out.println("-----------------------");
		
		// Mostramos la serie y el videojuego con mas horas y temporadas
		Serie serieMasTemps = series[0];
		Videojuego videojuegoMasHoras = videojuegos[0];

		for (Serie serie : series) {
			serieMasTemps = (Serie) serie.compareTo(serieMasTemps);
		}

		for (Videojuego videojuego : videojuegos) {
			videojuegoMasHoras = (Videojuego) videojuego.compareTo(videojuegoMasHoras);
		}

		System.out.println("Serie con mas temporadas: " + serieMasTemps);
		System.out.println("Videojuego con mas horas: " + videojuegoMasHoras);
	}
}