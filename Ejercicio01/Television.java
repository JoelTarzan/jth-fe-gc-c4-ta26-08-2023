public class Television extends Electrodomestico {

	// Atributos
	float resolucion;
	boolean tdt;

	// Constructores
	public Television() {
		super();
		this.resolucion = 20;
		this.tdt = false;
	}

	public Television(float precioBase, float peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.tdt = false;
	}

	public Television(float precioBase, String color, char consumoEnergetico, float peso, float resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	// Métodos
	public float getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}
	
	public float precioFinal() {
		float aumentoPorResolucion = 0;
		float aumentoPorTdt = 0;
		
		if (resolucion > 40) {
			aumentoPorResolucion = (float) (precioBase * 0.30);
		}
		
		if (tdt) {
			aumentoPorTdt = 50;
		}
		
		return super.precioFinal() + aumentoPorResolucion + aumentoPorTdt;
	}
}