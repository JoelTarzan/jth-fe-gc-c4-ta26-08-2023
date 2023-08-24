import java.util.ArrayList;
import java.util.Scanner;

public class vehiclesApp {

	public static void main(String[] args) throws InvalidRegistrationException, InvalidDiameterException, InvalidLicense {

		// EL EJERCICIO ESPECIFICA QUE DEBE HACERSE POR CONSOLA

		Scanner sc = new Scanner(System.in);

		// Creamos la lista de personas y de vehículos
		ArrayList<Person> people = new ArrayList<Person>();
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		// Preguntamos el tipo de menu, mientras el programa siga
		boolean runningProgram = true;

		while (runningProgram) {

			// Llamamos al menu general
			int mainMenuResponse = mainMenu(sc);

			// Dependiendo la respuesta, vamos a un menu u otro
			switch (mainMenuResponse) {
				case 1:
					int personMenuResponse = personMenu(sc);
					
					// Dependiendo el tipo de persona, crearemos un titular o un conductor
					switch (personMenuResponse) {
						case 1:
							people.add(createOwner(sc));
							break;
	
						case 2:
							people.add(createDriver(sc));
							break;
					}
					
					break;
	
				case 2:
					int vehicleMenuResponse = vehicleMenu(sc);

					// Dependiendo el tipo de vehículo, crearemos un coche, una moto o un camión
					switch (vehicleMenuResponse) {
						case 1:
			
							Car car = createCar(sc);
							
							// Preguntamos si desea crear un nuevo titular o asignarlo
							try {
								int ownerMenuResponse = ownerMenu(sc);
								
								switch (ownerMenuResponse) {
									case 1:
										Owner owner = createOwner(sc);
										people.add(owner);
										
										// Comprobamos que el titular tenga la licencia correcta
										if (!owner.getLicense().getType().equalsIgnoreCase("coche")) {
											throw new InvalidLicense("Tu licencia no es de tipo coche.");
										}
										
										car.setOwner(owner);
										
										break;
	
									case 2:
										Owner ownerFound = findOwnerByName(people, sc);
										
										// Comprobamos que el titular tenga la licencia correcta
										if (!ownerFound.getLicense().getType().equalsIgnoreCase("coche")) {
											throw new InvalidLicense("Tu licencia no es de tipo coche.");
										}
										
										car.setOwner(ownerFound);
										
										break;
								}
								
								vehicles.add(car);
								
							} catch (InvalidLicense e) {
								System.out.println(e.getMessage());
							}
							
							// Preguntamos si desea añadir conductores o no
							try {
								int driverMenuResponse = driverMenu(sc);
								
								while (driverMenuResponse == 1) {
									Person driver = findPersonByName(people, sc);

									// Comprobamos que el titular tenga la licencia correcta
									if (!driver.getLicense().getType().equalsIgnoreCase("coche")) {
										throw new InvalidLicense("Tu licencia no es de tipo coche.");
									}

									car.addDriver(driver);

									// Preguntamos si quiere añadir mas conductores
									driverMenuResponse = driverMenu(sc);
								}
								
							} catch (InvalidLicense e) {
								System.out.println(e.getMessage());
							}
							
							break;
	
						case 2:
							
							Bike bike = createBike(sc);
							
							// Preguntamos si desea crear un nuevo titular o asignarlo
							try {
								int ownerMenuResponse = ownerMenu(sc);

								switch (ownerMenuResponse) {
									case 1:
										Owner owner = createOwner(sc);
										people.add(owner);
	
										// Comprobamos que el titular tenga la licencia correcta
										if (!owner.getLicense().getType().equalsIgnoreCase("moto")) {
											throw new InvalidLicense("Tu licencia no es de tipo moto.");
										}
	
										bike.setOwner(owner);
	
										break;
	
									case 2:
										Owner ownerFound = findOwnerByName(people, sc);
	
										// Comprobamos que el titular tenga la licencia correcta
										if (!ownerFound.getLicense().getType().equalsIgnoreCase("moto")) {
											throw new InvalidLicense("Tu licencia no es de tipo moto.");
										}
	
										bike.setOwner(ownerFound);
	
										break;
								}
								
								vehicles.add(bike);

							} catch (InvalidLicense e) {
								System.out.println(e.getMessage());
							}

							// Preguntamos si desea añadir conductores o no
							try {	
								int driverMenuResponse = driverMenu(sc);

								while (driverMenuResponse == 1) {
									Person driver = findPersonByName(people, sc);

									// Comprobamos que el titular tenga la licencia correcta
									if (!driver.getLicense().getType().equalsIgnoreCase("moto")) {
										throw new InvalidLicense("Tu licencia no es de tipo moto.");
									}

									bike.addDriver(driver);

									// Preguntamos si quiere añadir mas conductores
									driverMenuResponse = driverMenu(sc);
								}

							} catch (Exception e) {
								System.out.println(e.getMessage());
							}

							break;
							
						case 3:
							
							Truck truck = createTruck(sc);
							
							// Preguntamos si desea crear un nuevo titular o asignarlo
							try {
								int ownerMenuResponse = ownerMenu(sc);
								
								switch (ownerMenuResponse) {
									case 1:
										Owner owner = createOwner(sc);
										people.add(owner);
										
										// Comprobamos que el titular tenga la licencia correcta
										if (!owner.getLicense().getType().equalsIgnoreCase("camion")) {
											throw new InvalidLicense("Tu licencia no es de tipo camión.");
										}
										
										truck.setOwner(owner);
										
										break;
	
									case 2:
										Owner ownerFound = findOwnerByName(people, sc);
										
										// Comprobamos que el titular tenga la licencia correcta
										if (!ownerFound.getLicense().getType().equalsIgnoreCase("camion")) {
											throw new InvalidLicense("Tu licencia no es de tipo camión.");
										}
										
										truck.setOwner(ownerFound);
										
										break;
								}
								
								vehicles.add(truck);
								
							} catch (InvalidLicense e) {
								System.out.println(e.getMessage());
							}
							
							// Preguntamos si desea añadir conductores o no
							try {								
								int driverMenuResponse = driverMenu(sc);

								while (driverMenuResponse == 1) {
									Person driver = findPersonByName(people, sc);

									// Comprobamos que el titular tenga la licencia correcta
									if (!driver.getLicense().getType().equalsIgnoreCase("camion")) {
										throw new InvalidLicense("Tu licencia no es de tipo camión.");
									}

									truck.addDriver(driver);

									// Preguntamos si quiere añadir mas conductores
									driverMenuResponse = driverMenu(sc);
								}
								
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							
							break;
						}
					
					break;
					
				case 0:
					runningProgram = false;
					break;
			}
		}
		sc.close();
	}

	// Menu general
	public static int mainMenu(Scanner sc) {
		int response = 0;

		do {
			System.out.println("¿Registrar persona o vehículo? (1: persona | 2: vehículo | 0: cerrar programa)");
			response = sc.nextInt();

			if (!(response == 0 || response == 1 || response == 2)) {
				System.out.println("Valor no válido, por favor, inténtelo de nuevo.");
			}

		} while (!(response == 0 || response == 1 || response == 2));

		return response;
	}

	// Menu de personas
	public static int personMenu(Scanner sc) {
		int response = 0;

		do {
			System.out.println("¿Registrar titular o conductor? (1: titular | 2: conductor)");
			response = sc.nextInt();

			if (!(response == 1 || response == 2)) {
				System.out.println("Valor no válido, por favor, inténtelo de nuevo.");
			}

		} while (!(response == 1 || response == 2));

		return response;
	}

	// Menu de vehículos
	public static int vehicleMenu(Scanner sc) {
		int response = 0;

		do {
			System.out.println("¿Registrar coche, moto o camión? (1: coche | 2: moto | 3: camión)");
			response = sc.nextInt();

			if (!(response == 1 || response == 2 || response == 3)) {
				System.out.println("Valor no válido, por favor, inténtelo de nuevo.");
			}

		} while (!(response == 1 || response == 2 || response == 3));

		return response;
	}

	// Menu para asignar o crear un titular
	public static int ownerMenu(Scanner sc) {
		int response = 0;

		do {
			System.out.println("¿Registrar nuevo titular o asignar un titular existente? (1: nuevo | 2: asignar existente)");
			response = sc.nextInt();

			if (!(response == 1 || response == 2)) {
				System.out.println("Valor no válido, por favor, inténtelo de nuevo.");
			}

		} while (!(response == 1 || response == 2));

		return response;
	}

	// Menu para añadir conductores
	public static int driverMenu(Scanner sc) {
		int response = 0;

		do {
			System.out.println("¿Deseas asignar un conductor existente? (1: Sí | 0: No)");
			response = sc.nextInt();

			if (!(response == 1 || response == 0)) {
				System.out.println("Valor no válido, por favor, inténtelo de nuevo.");
			}

		} while (!(response == 1 || response == 0));

		return response;
	}
	
	// Busca un titular y lo devuelve si lo encuentra
	public static Owner findOwnerByName(ArrayList<Person> people, Scanner sc) {
		System.out.println("Lista de titulares");
		
		for (Person person : people) {
			if (person instanceof Owner) {
				System.out.println(person.getName() + " " + person.getLastname());
			}
		}
		
		System.out.println("¿Cual desea agregar como titular?");
		String name = sc.next();
		
		for (Person person : people) {
			if (person.getName().equalsIgnoreCase(name) && person instanceof Owner) {
				return (Owner) person;
			} 
		}
		
		return null;
	}

	// Busca una persona y la devuelve si la encuentra
	public static Person findPersonByName(ArrayList<Person> people, Scanner sc) {
		System.out.println("Lista de personas");

		for (Person person : people) {
			System.out.println(person.getName() + " " + person.getLastname());
		}

		System.out.println("¿Cual desea agregar como conductor?");
		String name = sc.next();

		for (Person person : people) {
			if (person.getName().equalsIgnoreCase(name)) {
				return person;
			} 
		}

		return null;
	}

	// Pregunta los datos y crea un coche
	public static Car createCar(Scanner sc) throws InvalidRegistrationException, InvalidDiameterException {
		String registration;
		String brand;
		String color;

		System.out.println("Datos del coche");
		System.out.println();

		System.out.println("Introduce la matrícula del coche.");
		registration = sc.next();

		System.out.println("Introduce la marca del coche.");
		brand = sc.next();

		System.out.println("Introduce el color del coche.");
		color = sc.next();

		// Preguntamos los datos de las ruedas
		Wheel leftFrontWheel = createWheel(sc);
		Wheel rightFrontWheel = createWheel(sc);
		Wheel leftRearWheel = createWheel(sc);
		Wheel rightRearWheel = createWheel(sc);

		// Creamos el coche
		Car car = new Car(registration, brand, color);

		// Añadimos las ruedas al coche
		car.setFrontWheels(leftFrontWheel, rightFrontWheel);
		car.setRearWheels(leftRearWheel, rightRearWheel);

		return car;
	}

	// Pregunta los datos y crea una moto
	public static Bike createBike(Scanner sc) throws InvalidRegistrationException, InvalidDiameterException {
		String registration;
		String brand;
		String color;

		System.out.println("Datos de la moto");
		System.out.println();

		System.out.println("Introduce la matrícula de la moto.");
		registration = sc.next();

		System.out.println("Introduce la marca de la moto.");
		brand = sc.next();

		System.out.println("Introduce el color de la moto.");
		color = sc.next();

		// Preguntamos los datos de las ruedas
		Wheel frontWheel = createWheel(sc);
		Wheel rearWheel = createWheel(sc);

		// Creamos la moto
		Bike bike = new Bike(registration, brand, color);

		// Añadimos las ruedas a la moto
		bike.setFrontWheel(frontWheel);
		bike.setRearWheel(rearWheel);

		return bike;
	}

	// Pregunta los datos y crea un camión
	public static Truck createTruck(Scanner sc) throws InvalidRegistrationException, InvalidDiameterException {
		String registration;
		String brand;
		String color;
		int numberOfWheels;

		System.out.println("Datos del camión");
		System.out.println();

		System.out.println("Introduce la matrícula del camión.");
		registration = sc.next();

		System.out.println("Introduce la marca del camión.");
		brand = sc.next();

		System.out.println("Introduce el color del camión.");
		color = sc.next();

		System.out.println("Introduce el número de ruedas del camión.");
		numberOfWheels = sc.nextInt();

		// Preguntamos los datos de las ruedas
		Wheel wheels[] = new Wheel[numberOfWheels];

		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = createWheel(sc);
		}

		// Creamos la moto
		Truck truck = new Truck(registration, brand, color, numberOfWheels);

		// Añadimos las ruedas al camión
		truck.setWheels(wheels);

		return truck;
	}

	// Pregunta los datos y crea una rueda
	public static Wheel createWheel(Scanner sc) throws InvalidDiameterException {
		String brand;
		double diameter;

		System.out.println("Datos de la rueda");
		System.out.println();

		System.out.println("Introduce la marca de la rueda.");
		brand = sc.next();

		System.out.println("Introduce el diámetro de la rueda.");
		diameter = sc.nextDouble();

		return new Wheel(brand, diameter);
	}

	// Pregunta los datos y crea un titular
	public static Owner createOwner(Scanner sc) {
		String name;
		String lastname;
		String birthdate;
		DriversLicense license;
		boolean insurance;
		boolean ownGarage;

		System.out.println("Datos del titular");
		System.out.println();

		System.out.println("Introduzca su nombre.");
		name = sc.next();

		System.out.println("Introduzca su apellido.");
		lastname = sc.next();

		System.out.println("Introduzca su fecha de nacimiento.");
		birthdate = sc.next();

		System.out.println("Cree su licencia.");
		license = createDriverLicense(sc);
		
		String insuranceMessage = "¿Cuenta con aseguranza?";
		insurance = askYesOrNo(sc, insuranceMessage);

		String ownGarageMessage = "¿Cuenta con garaje propio?";
		ownGarage = askYesOrNo(sc, ownGarageMessage);

		// Creamos el titular
		Owner owner = new Owner(name, lastname, birthdate, license, insurance, ownGarage);

		return owner;
	}

	// Pregunta los datos y crea un conductor
	public static Driver createDriver(Scanner sc) {
		String name;
		String lastname;
		String birthdate;
		DriversLicense license;
		
		System.out.println("Datos del titular");
		System.out.println();

		System.out.println("Introduzca su nombre.");
		name = sc.next();

		System.out.println("Introduzca su apellido.");
		lastname = sc.next();

		System.out.println("Introduzca su fecha de nacimiento.");
		birthdate = sc.next();

		System.out.println("Cree su licencia.");
		license = createDriverLicense(sc);

		// Creamos el conductor
		Driver driver = new Driver(name, lastname, birthdate, license);

		return driver;
	}

	// Pregunta los datos y crea una licencia de conducir
	public static DriversLicense createDriverLicense(Scanner sc) {
		int id;
		String type;
		String fullName;
		String expiryDate;

		System.out.println("Datos de la licencia");
		System.out.println();

		System.out.println("Introduzca el ID de la licencia.");
		id = sc.nextInt();

		System.out.println("Introduzca el tipo de licencia. (coche - moto - camion)");
		type = sc.next();

		System.out.println("Introduzca el nombre completo que aparece en la licencia.");
		fullName = sc.next();

		System.out.println("Introduzca la fecha de expiración de la licencia.");
		expiryDate = sc.next();

		// Creamos la licencia de conducir
		DriversLicense license = new DriversLicense(id, type, fullName, expiryDate);

		return license;
	}

	// Pregunta de si o no
	public static boolean askYesOrNo(Scanner sc, String message) {
		System.out.println(message + " (1: Sí | 0: No)");
		int response = sc.nextInt();

		if (response == 1) {
			return true;

		} else {
			return false;
		}
	}
}