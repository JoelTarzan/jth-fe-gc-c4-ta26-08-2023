public class Electrodomestico {

	// Atributos
	protected float precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected float peso;

	protected final float PRECIO_BASE_DEF = 100;
	protected final String COLOR_DEF = "Blanco";
	protected final char CONSUMO_ENERGETICO_DEF = 'F';
	protected final float PESO_DEF = 5;

	// Constructores
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEF;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = PESO_DEF;
	}

	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = peso;
	}

	public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color) ? color : COLOR_DEF;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico) ? consumoEnergetico : CONSUMO_ENERGETICO_DEF;
		this.peso = peso;
	}

	// Métodos
	public float getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	public float getPRECIO_BASE_DEF() {
		return PRECIO_BASE_DEF;
	}

	public String getCOLOR_DEF() {
		return COLOR_DEF;
	}

	public char getCONSUMO_ENERGETICO_DEF() {
		return CONSUMO_ENERGETICO_DEF;
	}

	public float getPESO_DEF() {
		return PESO_DEF;
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
		boolean esValido = false;

		for (char caracter : letras) {
			if (caracter == Character.toUpperCase(letra)) {
				esValido = true;
			}
		}

		return esValido;
	}

	private boolean comprobarColor(String color) {
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean esValido = false;

		for (String colorEnArray : colores) {
			if (colorEnArray.equalsIgnoreCase(color)) {
				esValido = true;
			}
		}

		return esValido;
	}

	public float precioFinal() {
		float aumentoPorConsumo = 0;
		float aumentoPorPeso = 0;

		switch (consumoEnergetico) {
			case 'A':
				aumentoPorConsumo = 100;
				break;
	
			case 'B':
				aumentoPorConsumo = 80;
				break;

			case 'C':
				aumentoPorConsumo = 60;
				break;

			case 'D':
				aumentoPorConsumo = 50;
				break;

			case 'E':
				aumentoPorConsumo = 30;
				break;

			case 'F':
				aumentoPorConsumo = 10;
				break;
		}
		
		if (peso <= 19) {
			aumentoPorPeso = 10;
			
		} else if (peso <= 49) {
			aumentoPorPeso = 50;
			
		} else if (peso <= 79) {
			aumentoPorPeso = 80;
			
		} else {
			aumentoPorPeso = 100;
		}
		
		return precioBase + aumentoPorConsumo + aumentoPorPeso;
	}
}