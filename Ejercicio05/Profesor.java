public class Profesor extends Persona {

	// Atributos
	private String materia;

	// Constructores
	public Profesor() {
		super();
		this.materia = "";
	}

	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = comprobarCalificacion(materia);
	}

	// M�todos
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String comprobarCalificacion(String materia) {
		if(materia.equalsIgnoreCase("matematicas") || materia.equalsIgnoreCase("filosofia") || materia.equalsIgnoreCase("fisica")) {
			return materia;
			
		} else {
			return "matematicas";
		}
	}
	
	public boolean disponible() {
		double resultado = Math.floor((Math.random() * (6)));

		if (resultado == 1) {
			return false;

		} else {
			return true;
		}
	}	
}