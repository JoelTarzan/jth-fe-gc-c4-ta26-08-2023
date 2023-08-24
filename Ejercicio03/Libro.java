public class Libro {

	// Atributos
	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;

	// Constructores
	public Libro() {
		this.isbn = "";
		this.titulo = "";
		this.autor = "";
		this.numPaginas = 0;
	}

	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	// Métodos
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String toString() {
		return "El libro " + this.titulo + " con ISBN " + this.isbn + " creado por el autor " + this.autor + " tiene " + this.numPaginas + " páginas";
	}
}