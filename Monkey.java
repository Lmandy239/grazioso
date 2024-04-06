
public class Monkey extends RescueAnimal {
	// Instance variable
	private double tailLength;
	private double height;
	private double bodyLength;
	private String species;
	
    // Constructor
	public Monkey() {}

    // Constructor
	public Monkey(double tailLength, double height, double bodyLength, String species, String name, String animalType, String gender, 
			String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved,
			String inServiceCountry) {
		super();	
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
		setName(name);
		setAnimalType(animalType);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		
	}
	  // Accessor Method
	public double getTailLength() {
		return tailLength;
	}

      // Mutator Method
	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}

	  // Accessor Method
	public double getHeight() {
		return height;
	}

      // Mutator Method
	public void setHeight(double height) {
		this.height = height;
	}

	  // Accessor Method
	public double getBodyLength() {
		return bodyLength;
	}

      // Mutator Method
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}

	  // Accessor Method
	public String getSpecies() {
		return species;
	}

      // Mutator Method
	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
	public String toString() {
	    return  "Name: " + getName() + ", " +
	            "Species: " + getSpecies() + ", " +
	            "Animal Type: " + getAnimalType() + ", " +
	            "Gender: " + getGender() + ", " +
	            "Age: " + getAge() + ", " +
	            "Weight: " + getWeight() + ", " +
	            "Acquisition Date: " + getAcquisitionDate() + ", " +
	            "Acquisition Location: " + getAcquisitionLocation() + ", " +
	            "Reserved: " + getReserved() + ", " +
	            "In-Service Location: " + getInServiceLocation() + ", " +
	            "Training Status: " + getTrainingStatus();
	}

	
}
