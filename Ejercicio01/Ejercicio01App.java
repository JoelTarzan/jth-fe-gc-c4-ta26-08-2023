public class Ejercicio01App {

	public static void main(String[] args) {
		
		// Creamos un array de Electrodomésticos de 10 posiciones
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];

		// Asignamos a cada posicion un objeto de las subclases
		electrodomesticos[0] = new Lavadora(100, 35);
		electrodomesticos[1] = new Electrodomestico(75, "verde", 'A', 19);
		electrodomesticos[2] = new Lavadora(80, "negro", 'B', 14, 10);
		electrodomesticos[3] = new Television();
		electrodomesticos[4] = new Electrodomestico(90, 13);
		electrodomesticos[5] = new Lavadora(120, "rojo", 'E', 20, 15);
		electrodomesticos[6] = new Television(80, 12);
		electrodomesticos[7] = new Television(140, "azul", 'D', 18, 35, true);
		electrodomesticos[8] = new Electrodomestico();
		electrodomesticos[9] = new Lavadora();
		
		// Mostramos los precios de cada electrodomético y los finales de cada grupo
		float precioFinalElectrodomesticos = 0;
		float precioFinalLavadoras = 0;
		float precioFinalTelevisiones = 0;
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			float precioFinal = electrodomesticos[i].precioFinal();
			System.out.println("Precio final del electrodoméstico " + (i + 1) + ": " + precioFinal);
			
			if(electrodomesticos[i] instanceof Lavadora) {
				precioFinalLavadoras += precioFinal;
				
			} else if (electrodomesticos[i] instanceof Television) {
				precioFinalTelevisiones += precioFinal;
			}
			
			precioFinalElectrodomesticos += precioFinal;
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Precio final de Lavadoras: " + precioFinalLavadoras);
		System.out.println("Precio final de Televisiones: " + precioFinalTelevisiones);
		System.out.println("Precio final de Electrodométicos: " + precioFinalElectrodomesticos);
	}
}