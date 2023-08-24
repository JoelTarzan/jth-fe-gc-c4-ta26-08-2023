public class Truck extends Vehicle {

	// Atributos
	private int numberOfWheels;
	private Wheel[] wheels;

	// Constructores
	public Truck(String registration, String brand, String color, int numberOfWheels) throws InvalidRegistrationException {
		super(registration, brand, color);
		this.numberOfWheels = numberOfWheels;
	}

	// Métodos
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
}