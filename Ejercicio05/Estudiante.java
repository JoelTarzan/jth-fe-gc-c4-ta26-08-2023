public class Estudiante extends Persona {

	// Atributos
	private int calificacion;

	// Constructores
	public Estudiante() {
		super();
		this.calificacion = 0;
	}
	
	public Estudiante(String nombre, int edad, char sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = comprobarCalificacion(calificacion);
	}

	// M�todos
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public int comprobarCalificacion(int calificacion) {
		if (calificacion < 0 || calificacion > 10) {
			return 4;
			
		} else {
			return calificacion;
		}
	}
	
	public boolean disponible() {
		double resultado = Math.floor((Math.random() * 2));
		
		if (resultado == 0) {
			return false;
			
		} else {
			return true;
		}
	}
}