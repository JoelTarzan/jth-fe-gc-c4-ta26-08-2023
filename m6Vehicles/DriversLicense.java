public class DriversLicense {

	// Atributos
	private int id;
	private String type;
	private String fullName;
	private String expiryDate;

	// Constructores
	public DriversLicense(int id, String type, String fullName, String expiryDate) {
		this.id = id;
		this.type = type;
		this.fullName = fullName;
		this.expiryDate = expiryDate;
	}

	// Métodos
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}