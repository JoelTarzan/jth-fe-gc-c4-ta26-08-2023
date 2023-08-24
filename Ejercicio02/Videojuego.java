public class Videojuego implements Entregable {

	// Atributos
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;

	// Constructores
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compania = compania;
	}

	// Métodos
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

	public String toString() {
		return "Título: " + titulo + " - Horas estimadas: " + horasEstimadas + " - Entregado: " + entregado + " - Género: " + genero + " - Compañía: " + compania;
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
		Videojuego videojuego = (Videojuego) a;

		if (this.horasEstimadas >= videojuego.horasEstimadas) {
			return this;
		} else {
			return videojuego;
		}
	}
}