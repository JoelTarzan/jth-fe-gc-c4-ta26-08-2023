public class Owner extends Person {

	// Atributos
	private boolean insurance;
	private boolean ownGarage;
	
	// Constructores
	public Owner(String name, String lastname, String birthdate, DriversLicense license, boolean insurance, boolean ownGarage) {
		super(name, lastname, birthdate, license);
		this.insurance = insurance;
		this.ownGarage = ownGarage;
	}
	
	// Métodos
	public boolean isInsurance() {
		return insurance;
	}

	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}

	public boolean isOwnGarage() {
		return ownGarage;
	}

	public void setOwnGarage(boolean ownGarage) {
		this.ownGarage = ownGarage;
	}
}