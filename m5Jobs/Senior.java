public class Senior extends Employee{

	// Constructores
	public Senior(String name, double baseSalary) throws InvalidSalaryException {
		super(name, baseSalary);
	}

	// Métodos
	public double calculateMonthlyGrossSalary() {
		return baseSalary - (baseSalary * 0.05);
	}

	public double calculateMonthlyNetSalary() {
		return monthlyGrossSalary - (monthlyGrossSalary * 0.24);
	}

	public void validateSalary() throws InvalidSalaryException {	
		if (calculateMonthlyGrossSalary() < 2700) {
			throw new InvalidSalaryException("Salario demasiado bajo.");

		} else if (calculateMonthlyGrossSalary() > 4000) {
			throw new InvalidSalaryException("Salario demasiado alto.");
		}
	}
}