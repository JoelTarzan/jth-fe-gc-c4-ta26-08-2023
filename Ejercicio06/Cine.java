public class Cine {

	// Propiedades
	private Pelicula pelicula;
	private double precioEntrada;
	private Asiento[][] asientos;
	
	// Constructores
	public Cine() {
		this.pelicula = new Pelicula();
		this.precioEntrada = 0;
		this.asientos = crearAsientos();
	}
	
	public Cine(Pelicula pelicula, double precioEntrada) {
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
		this.asientos = crearAsientos();
	}

	// Métodos
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}
	
	public Asiento[][] crearAsientos() {
		char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        int numeros[] = {8, 7, 6, 5, 4, 3, 2, 1};
        Asiento asientos[][] = new Asiento[8][9];
        
        for (int fil = 0; fil < numeros.length; fil++) {

//            asientos[fil] = [];
            
            for (int col = 0; col < letras.length; col++) {

                String nombre = String.valueOf(numeros[fil]) + letras[col];
                asientos[fil][col] = new Asiento(nombre, false);
            }
        }
        
        return asientos;
	}
}