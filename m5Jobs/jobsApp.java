public class jobsApp {

	public static void main(String[] args) throws InvalidSalaryException {
		
		// Creamos una lista de empleados
		Employee employees[] = {
				new Boss("Laura", 9000),
				new Manager("Joel", 4000),
				new Senior("Antonio", 3200),
				new Mid("Oscar", 2100),
				new Junior("Alex", 1200),
				new Volunteer("Alba", 0, 150),
		};
		
		// Mostramos el sueldo neto mensual de cada empleado
		for (Employee employee : employees) {
			System.out.println(employee.getName() + ": " + employee.getMonthlyNetSalary() + " €/mes neto.");
		}
		System.out.println();
		
		// Llamamos a la función que dara bonus a los empleados menos a los voluntarios y mostramos los bonus obtenidos
		giveBonus(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee.getName() + ": " + employee.getBonus() + " € de bonus.");
		}
	}
	
	public static void giveBonus(Employee[] employees) {
		for (Employee employee : employees) {
			
			double newBonus = employee.getAnnualGrossSalary() * 0.10;
			
			if (!(employee instanceof Volunteer)) {
				employee.setBonus(newBonus);;
			}
		}
	}
}