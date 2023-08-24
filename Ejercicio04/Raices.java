public class Raices {

	// Atributos
	private double a;
	private double b;
	private double c;

	// Constructores
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Métodos
	public double getDiscriminante() {
		return (Math.pow(b, 2)) - (4 * this.a * this.c); 
	}

	public boolean tieneRaices() {
		return this.getDiscriminante() >= 0;
	}

	public boolean tieneRaiz() {
		return this.getDiscriminante() == 0;
	}

	public void calcular() {
		double discriminante = getDiscriminante();

		if (tieneRaiz()) {
			double solucion = -this.b / (2 * this.a);
			obtenerRaiz(solucion);

		} else if (tieneRaices()) {
			double solucionUno = (-this.b + Math.sqrt(discriminante)) / (2 * this.a);
			double solucionDos = (-this.b - Math.sqrt(discriminante)) / (2 * this.a);
			obtenerRaices(solucionUno, solucionDos);

		} else {
			System.out.println("No tiene solución.");
		}
	}

	public void obtenerRaices(double solucionUno, double solucionDos) {
		System.out.println("x1 = " + solucionUno);
		System.out.println("x2 = " + solucionDos);
	}

	public void obtenerRaiz(double solucion) {
		System.out.println("x = " + solucion);
	}
}