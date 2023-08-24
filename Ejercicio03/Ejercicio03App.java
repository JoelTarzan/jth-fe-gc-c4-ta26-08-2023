public class Ejercicio03App {

	public static void main(String[] args) {
		
		// Creamos dos libros y los mostramos por pantalla
		Libro libro1 = new Libro("9788071972907", "Elantris", "Brandon Sanderson", 834);
		Libro libro2 = new Libro("9783641071530", "El camino de los reyes", "Brandon Sanderson", 1517);

		System.out.println(libro1);
		System.out.println(libro2);
		
		System.out.println("------------------------------------------------------------------------------");
		
		// Comparamos las páginas y mostramos el que tiene más paginas
		if (libro1.getNumPaginas() >= libro2.getNumPaginas()) {
			System.out.println("El libro con mas páginas es: " + libro1);
			
		} else {
			System.out.println("El libro con mas páginas es: " + libro2);
		}
	}
}