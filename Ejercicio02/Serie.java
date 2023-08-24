public class Serie implements Entregable {

	// Atributos
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constructores
	public Serie() {
		this.titulo = "";
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	// Métodos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
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

	public String toString() {
		return "Título: " + titulo + " - Núm. Temporadas: " + numTemporadas + " - Entregado: " + entregado + " - Género: " + genero + " - Creador: " + creador;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public Object compareTo(Object a) {

		Serie serie = (Serie) a;

		if (this.numTemporadas >= serie.numTemporadas) {
			return this;
		} else {
			return serie;
		}
	}
}