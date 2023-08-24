public class Car extends Vehicle {

	// Atributos
	private Wheel leftFrontWheel;
	private Wheel rightFrontWheel;
	private Wheel leftRearWheel;
    private Wheel rightRearWheel;
	
    // Constructor
    public Car(String registration, String brand, String color) throws InvalidRegistrationException {
    	super(registration, brand, color);
    }

    // Métodos
	public Wheel getLeftFrontWheel() {
		return leftFrontWheel;
	}

	public void setLeftFrontWheel(Wheel leftFrontWheel) {
		this.leftFrontWheel = leftFrontWheel;
	}

	public Wheel getRightFrontWheel() {
		return rightFrontWheel;
	}

	public void setRightFrontWheel(Wheel rightFrontWheel) {
		this.rightFrontWheel = rightFrontWheel;
	}

	public Wheel getLeftRearWheel() {
		return leftRearWheel;
	}

	public void setLeftRearWheel(Wheel leftRearWheel) {
		this.leftRearWheel = leftRearWheel;
	}

	public Wheel getRightRearWheel() {
		return rightRearWheel;
	}

	public void setRightRearWheel(Wheel rightRearWheel) {
		this.rightRearWheel = rightRearWheel;
	}
    
    public void setFrontWheels(Wheel leftFrontWheel, Wheel rightFrontWheel) {
    	this.leftFrontWheel = leftFrontWheel;
    	this.rightFrontWheel = rightFrontWheel;
    }
    
    public void setRearWheels(Wheel leftRearWheel, Wheel rightRearWheel) {
    	this.leftRearWheel = leftRearWheel;
    	this.rightRearWheel = rightRearWheel;
    }
}