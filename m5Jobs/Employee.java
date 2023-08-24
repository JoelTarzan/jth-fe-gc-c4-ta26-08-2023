public abstract class Employee {

	// Propiedades
	protected String name;
	protected double baseSalary;
	protected double monthlyGrossSalary;
	protected double monthlyNetSalary;
	protected double annualGrossSalary;
	protected double annualNetSalary;
	protected double bonus;

	// Constructores
	public Employee(String name, double baseSalary) throws InvalidSalaryException {
		this.name = name;
		this.baseSalary = baseSalary;
		this.monthlyGrossSalary = calculateMonthlyGrossSalary();
		this.monthlyNetSalary = calculateMonthlyNetSalary();
		this.annualGrossSalary = calculateAnnualGrossSalary();
		this.annualNetSalary = calculateAnnualNetSalary();
		this.bonus = 0;
		validateSalary();
	}

	// Métodos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getMonthlyGrossSalary() {
		return monthlyGrossSalary;
	}

	public void setMonthlyGrossSalary(double monthlyGrossSalary) {
		this.monthlyGrossSalary = monthlyGrossSalary;
	}

	public double getMonthlyNetSalary() {
		return monthlyNetSalary;
	}

	public void setMonthlyNetSalary(double monthlyNetSalary) {
		this.monthlyNetSalary = monthlyNetSalary;
	}

	public double getAnnualGrossSalary() {
		return annualGrossSalary;
	}

	public void setAnnualGrossSalary(double annualGrossSalary) {
		this.annualGrossSalary = annualGrossSalary;
	}

	public double getAnnualNetSalary() {
		return annualNetSalary;
	}

	public void setAnnualNetSalary(double annualNetSalary) {
		this.annualNetSalary = annualNetSalary;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public abstract double calculateMonthlyGrossSalary();

	public abstract double calculateMonthlyNetSalary();

	public double calculateAnnualGrossSalary() {
		return monthlyGrossSalary * 12;
	};

	public double calculateAnnualNetSalary() {
		return monthlyNetSalary * 12;
	};

	public abstract void validateSalary() throws InvalidSalaryException;
}