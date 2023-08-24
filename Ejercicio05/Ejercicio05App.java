public class Ejercicio05App {

	public static void main(String[] args) {

		// Creamos un grupo de estudiantes
		Estudiante estudiantes[] = new Estudiante[5];

		estudiantes[0] = new Estudiante("Joel", 23, 'H', 9);
		estudiantes[1] = new Estudiante("Laura", 22, 'M', 10);
		estudiantes[2] = new Estudiante("Antonio", 23, 'H', 2);
		estudiantes[3] = new Estudiante("Oscar", 23, 'H', 3);
		estudiantes[4] = new Estudiante("Alba", 22, 'M', 5);

		// Creamos un profesor
		Profesor profesor = new Profesor("Juanjo", 30, 'H', "matematicas");

		// Creamos un aula
		Aula aula = new Aula(9, 10, "matematicas", profesor, estudiantes);

		// Miramos si se puede dar clase, y si es así, mostramos cuantos alumnos y alumnas estan aprobados
		if (aula.puedeDarseClase()) {

			System.out.println("Se puede dar clase.");

			int alumnasAprobadas = 0;
			int alumnosAprobados = 0;

			for (int i = 0; i < estudiantes.length; i++) {
				
				if (estudiantes[i].getCalificacion() >= 5) {
					if (estudiantes[i].getSexo() == 'M') {
						alumnasAprobadas++;
					}else{

						alumnosAprobados++;
					}
				}
			}
			
			System.out.println("Las alumnas aprobadas son: " + alumnasAprobadas);
			System.out.println("Los alumnos aprobados son: " + alumnosAprobados);

		} else {
			System.out.println("No se puede dar clase.");
		}
	}
}