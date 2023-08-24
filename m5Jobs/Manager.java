public class Manager extends Employee {

	// Constructores
	public Manager(String name, double baseSalary) throws InvalidSalaryException {
		super(name, baseSalary);
	}

	// Métodos
	public double calculateMonthlyGrossSalary() {
		return baseSalary * 1.10;
	}

	public double calculateMonthlyNetSalary() {
		return monthlyGrossSalary - (monthlyGrossSalary * 0.26);
	}

	public void validateSalary() throws InvalidSalaryException {	
		if (calculateMonthlyGrossSalary() < 3000) {
			throw new InvalidSalaryException("Salario demasiado bajo.");

		} else if (calculateMonthlyGrossSalary() > 5000) {
			throw new InvalidSalaryException("Salario demasiado alto.");
		}
	}
}