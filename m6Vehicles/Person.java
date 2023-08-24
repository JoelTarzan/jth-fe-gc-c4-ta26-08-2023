public abstract class Person {

	// Atributos
	private String name;
	private String lastname;
	private String birthdate;
	private DriversLicense license;

	// Constructores
	public Person(String name, String lastname, String birthdate, DriversLicense license) {
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.license = license;
	}

	// Métodos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public DriversLicense getLicense() {
		return license;
	}

	public void setLicense(DriversLicense license) {
		this.license = license;
	}
}