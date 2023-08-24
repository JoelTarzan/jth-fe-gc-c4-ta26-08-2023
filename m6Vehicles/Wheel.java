public class Wheel {

	// Atributos
	private String brand;
	private double diameter;

	// Constructores
	public Wheel(String brand, double diameter) throws InvalidDiameterException {
		this.brand = brand;
		this.diameter = diameter;
		validateRegistration();
	}

	// Métodos
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public void validateRegistration() throws InvalidDiameterException {
		if (diameter <= 0.4 || diameter >= 4) {
			throw new InvalidDiameterException("Di�metro de rueda inv�lido. Debe ser superior a 0,4 e inferior a 4.");
		}
	}
}