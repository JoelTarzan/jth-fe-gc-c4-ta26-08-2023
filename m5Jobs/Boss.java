public class Boss extends Employee {

	// Constructores
	public Boss(String name, double baseSalary) throws InvalidSalaryException {
		super(name, baseSalary);
	}

	// Métodos
	public double calculateMonthlyGrossSalary() {
		return baseSalary * 1.50;
	}
	
	public double calculateMonthlyNetSalary() {
		return monthlyGrossSalary - (monthlyGrossSalary * 0.32);
	}

	public void validateSalary() throws InvalidSalaryException {	
		if (calculateMonthlyGrossSalary() < 8000) {
			throw new InvalidSalaryException("Salario demasiado bajo.");
		}
	}
}