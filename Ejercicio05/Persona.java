public abstract class Persona {

	// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;

	// Constructores
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = ' ';
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	// Métodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public abstract boolean disponible();
}