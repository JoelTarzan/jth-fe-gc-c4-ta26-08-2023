public class Aula {

	// Atributos
	private int id;
	private int numMaxEstudiantes;
	private String materia;
	private Profesor profesor;
	private Estudiante[] estudiantes;

	// Constructores
	public Aula() {
		this.id = 0;
		this.numMaxEstudiantes = 0;
		this.materia = "";
		this.profesor = new Profesor();
		this.estudiantes = new Estudiante[10];
	}

	public Aula(int id, int numMaxEstudiantes, String materia, Profesor profesor, Estudiante[] estudiantes) {
		this.id = id;
		this.numMaxEstudiantes = numMaxEstudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}

	// Métodos
	public boolean puedeDarseClase() {
		if (!profesor.disponible()) {
			return false;
		}

		if (!profesor.getMateria().equalsIgnoreCase(materia)) {
			return false;
		}

		int numEstudiantes = this.estudiantes.length;
		int numEstudiantesPresentes = 0;
		
		for (Estudiante estudiante : this.estudiantes) {
			if (estudiante.disponible()) {
				numEstudiantesPresentes++;
			}
		}

		if ((double) numEstudiantesPresentes / numEstudiantes < 0.5) {
            return false;
        }
		
		return true;
	}
}