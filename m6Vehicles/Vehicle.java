import java.util.ArrayList;

public abstract class Vehicle {

	// Atributos
	protected String registration;
	protected String brand;
	protected String color;
	protected Owner owner;
	protected ArrayList<Person> drivers;

	// Constructores
	public Vehicle(String registration, String brand, String color) throws InvalidRegistrationException {
		this.registration = registration;
		this.brand = brand;
		this.color = color;
		validateRegistration();
	}

	// Métodos
	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public ArrayList<Person> getDrivers() {
		return drivers;
	}

	public void setDrivers(ArrayList<Person> drivers) {
		this.drivers = drivers;
	}
	
	public void addDriver(Person driver) {
		this.drivers.add(driver);
	}

	public void validateRegistration() throws InvalidRegistrationException {
		boolean validRegistration = false;

		int counterNumbers = 0;
		int counterLetters = 0;
		int counterOther = 0;

		for (int i = 0; i < registration .length(); i++) {

			if (Character.isDigit(registration.charAt(i))) {
				counterNumbers++;

			} else if (Character.isAlphabetic(registration.charAt(i))) {
				counterLetters++;

			} else {
				counterOther++;
			}
		}

		if (((counterNumbers == 4 && counterLetters == 2) || (counterNumbers == 4 && counterLetters == 3)) && counterOther == 0) {
			validRegistration = true;
		}

		if (!validRegistration) {
			throw new InvalidRegistrationException("Matr�cula incorrecta. Debe llevar 4 n�meros y 2 o 3 letras.");
		}
	}
}