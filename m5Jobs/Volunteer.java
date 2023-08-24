public class Volunteer extends Employee {
	
	private double governmentAid;

	// Constructores
	public Volunteer(String name, double baseSalary, double governmentAid) throws InvalidSalaryException {
		super(name, baseSalary);
		this.governmentAid = governmentAid;
		validateGovermentAid();
	}

	// Métodos
	public double calculateMonthlyGrossSalary() {
		return governmentAid;
	}
	
	public double calculateMonthlyNetSalary() {
		return governmentAid;
	}

	public void validateSalary() throws InvalidSalaryException {	
		if (baseSalary != 0) {
			throw new InvalidSalaryException("El voluntario no puede cobrar.");
		}
	}
	
	public void validateGovermentAid() throws InvalidSalaryException {
		if (governmentAid > 300) {
			throw new InvalidSalaryException("La ayuda gubernamental no puede ser mayor a 300€.");
		} else {
			System.out.println("Ayuda gubernamental de " + name + ": " + governmentAid + " €/mes");
		}
	}
}