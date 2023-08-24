public class Bike extends Vehicle {

	// Atributos
	private Wheel frontWheel;
	private Wheel rearWheel;

	// Constructores
	public Bike(String registration, String brand, String color) throws InvalidRegistrationException {
		super(registration, brand, color);
	}

	// Métodos
	public Wheel getFrontWheel() {
		return frontWheel;
	}

	public void setFrontWheel(Wheel frontWheel) {
		this.frontWheel = frontWheel;
	}

	public Wheel getRearWheel() {
		return rearWheel;
	}

	public void setRearWheel(Wheel rearWheel) {
		this.rearWheel = rearWheel;
	}

}