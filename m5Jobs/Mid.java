public class Mid extends Employee{

	// Constructores
	public Mid(String name, double baseSalary) throws InvalidSalaryException {
		super(name, baseSalary);
	}

	// Métodos
	public double calculateMonthlyGrossSalary() {
		return baseSalary - (baseSalary * 0.10);
	}

	public double calculateMonthlyNetSalary() {
		return monthlyGrossSalary - (monthlyGrossSalary * 0.15);
	}

	public void validateSalary() throws InvalidSalaryException {	
		if (calculateMonthlyGrossSalary() < 1800) {
			throw new InvalidSalaryException("Salario demasiado bajo.");

		} else if (calculateMonthlyGrossSalary() > 2500) {
			throw new InvalidSalaryException("Salario demasiado alto.");
		}
	}
}