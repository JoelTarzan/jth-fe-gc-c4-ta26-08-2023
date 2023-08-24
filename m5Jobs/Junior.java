public class Junior extends Employee{

	// Constructores
	public Junior(String name, double baseSalary) throws InvalidSalaryException {
		super(name, baseSalary);
	}

	// Métodos
	public double calculateMonthlyGrossSalary() {
		return baseSalary - (baseSalary * 0.15);
	}

	public double calculateMonthlyNetSalary() {
		return monthlyGrossSalary - (monthlyGrossSalary * 0.02);
	}

	public void validateSalary() throws InvalidSalaryException {	
		if (calculateMonthlyGrossSalary() < 900) {
			throw new InvalidSalaryException("Salario demasiado bajo.");

		} else if (calculateMonthlyGrossSalary() > 1600) {
			throw new InvalidSalaryException("Salario demasiado alto.");
		}
	}
}