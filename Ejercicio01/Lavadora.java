public class Lavadora extends Electrodomestico {

	// Atributos
	private float carga;

	protected final float CARGA_DEF = 5;

	// Constructores
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}

	public Lavadora(float precioBase, float peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEF;
	}

	public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = CARGA_DEF;
	}

	// Métodos
	public float getCarga() {
		return carga;
	}

	public float precioFinal() {
		float aumentoPorCarga = 0;

		if (carga > 30) {
			aumentoPorCarga = 50;
		}

		return super.precioFinal() + aumentoPorCarga;
	}
}