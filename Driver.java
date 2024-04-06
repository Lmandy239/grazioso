import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

	public static void main(String[] args) {

		initializeDogList();
		initializeMonkeyList();

		Scanner input = new Scanner(System.in);
		char option;

		do // loop until user exits application
		{
			displayMenu();
			option = input.next().charAt(0);
			if (option == '1') {
				intakeNewDog(input);
			}

			else if (option == '2') {
				intakeNewMonkey(input);
			}

			else if (option == '3') {
				reserveAnimal(input);
			}

			else if (option == '4') {
				printAnimals();
			}

			else if (option == '5') {
				printAnimals();
			}

			else if (option == '6') {
				printAnimals();
			}

			else if (option == 'q') {
				System.out.print("You have exited the application.");
				break;
			}

			else {
				System.out.print("You have entered an invalid input. Please enter a valid input.");
			}
		} while (option != 'q');
	}

	// This method prints the menu options
	public static void displayMenu() {
		System.out.println("\n\n");
		System.out.println("\t\t\t\tRescue Animal System Menu");
		System.out.println("[1] Intake a new dog");
		System.out.println("[2] Intake a new monkey");
		System.out.println("[3] Reserve an animal");
		System.out.println("[4] Print a list of all dogs");
		System.out.println("[5] Print a list of all monkeys");
		System.out.println("[6] Print a list of all animals that are not reserved");
		System.out.println("[q] Quit application");
		System.out.println();
		System.out.println("Enter a menu selection");

	}

	// Adds dogs to a list for testing
	public static void initializeDogList() {
		Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
				false, "United States");
		Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
				"United States");
		Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
				"Canada");

		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
	}

	// Adds monkeys to a list for testing
	// Optional for testing
	public static void initializeMonkeyList() {
		Monkey monkey1 = new Monkey(2, 3, 45, "Ape", "Bob", "Monkey", "Male", "15 years old", "30lbs", "11/12/22",
				"China", "intake", true, "China");
		Monkey monkey2 = new Monkey(1, 1, 245, "Ape", "Jeff", "Gorilla", "Male", "10 years old", "500lbs", "11/12/23",
				"Indonesia", "intake", true, "Vietnam");

		monkeyList.add(monkey1);
		monkeyList.add(monkey2);
	}

	// Complete the intakeNewDog method
	// The input validation to check that the dog is not already in the list
	// is done for you
	public static void intakeNewDog(Scanner scanner) {

		// Start by prompting dog name
		System.out.println("What is the dog's name?");
		// input
		String name = scanner.nextLine();
		scanner.nextLine();
		// boolean to check if the dog exists
		boolean dogExists = false;

		// for every dog in the list, if the dog exists output error message
		for (Dog dog : dogList) {
			if (dog.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis dog is already in our system\n\n");
				dogExists = true;
				break;
			}
		}
		// if the dog isn't in the list yet
		if (!dogExists) {
			// set data for all attributes
			System.out.println("What is the dog's breed?");
			String breed = scanner.nextLine();
			System.out.println("What is the dog's gender?");
			String gender = scanner.nextLine();
			System.out.println("What is the dog's age?");
			String age = scanner.nextLine();
			System.out.println("What is the dog's weight?");
			String weight = scanner.nextLine();
			System.out.println("What is the dog's date of birth?");
			String dob = scanner.nextLine();
			System.out.println("What is the dog's origin country?");
			String originCountry = scanner.nextLine();
			System.out.println("What is the dog's training status?");
			String trainingStatus = scanner.nextLine();
			System.out.println("Is the dog reserved? (true/false)");
			boolean reserved = scanner.nextBoolean();

			scanner.nextLine();
			// creates dog object with new data
			Dog newDog = new Dog(name, breed, gender, age, weight, dob, originCountry, trainingStatus, reserved,
					originCountry);

			// adds dog to the list
			dogList.add(newDog);

			// Confirmation message
			System.out.println("New dog added successfully!");

		}
	}

	// Complete intakeNewMonkey
	// Instantiate and add the new monkey to the appropriate list
	// For the project submission you must also validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
	public static void intakeNewMonkey(Scanner scanner) {

		// Start by prompting monkey name
		System.out.println("What is the monkey's name?");
		// input
		String name = scanner.nextLine();
		scanner.nextLine();
		// boolean to check if the monkey exists
		boolean monkeyExists = false;

		// for every dog in the list, if the monkey exists output error message
		for (Monkey monkey : monkeyList) {
			if (monkey.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis monkey is already in our system\n\n");
				monkeyExists = true;
				break;
			}
		}
		// if the dog isn't in the list yet
		if (!monkeyExists) {
		    // set data for all attributes except name
		    System.out.println("What is the monkey's tail length?");
		    double tailLength = scanner.nextDouble();
		    System.out.println("What is the monkey's height?");
		    double height = scanner.nextDouble();
		    System.out.println("What is the monkey's body length?");
		    double bodyLength = scanner.nextDouble();            
		    scanner.nextLine(); // consume newline

		    System.out.println("What is the monkey's species?");
		    String species = scanner.nextLine();
		    System.out.println("What is the monkey's animal type?");
		    String animalType = scanner.nextLine();
		    System.out.println("What is the monkey's gender?");
		    String gender = scanner.nextLine();
		    System.out.println("What is the monkey's age?");
		    String age = scanner.nextLine();
		    System.out.println("What is the monkey's weight?");
		    String weight = scanner.nextLine();
		    System.out.println("What is the monkey's acquisition date? (YYYY-MM-DD)");
		    String acquisitionDate = scanner.next();
		    System.out.println("What is the monkey's acquisition country?");
		    String acquisitionCountry = scanner.next();
		    System.out.println("What is the monkey's training status?");
		    String trainingStatus = scanner.next();
		    System.out.println("Is the monkey reserved? (true/false)");
		    boolean reserved = scanner.nextBoolean();
		    System.out.println("What is the monkey's in-service country?");
		    String inServiceCountry = scanner.next();

		    // creates monkey object with new data
		    Monkey newMonkey = new Monkey(tailLength, height, bodyLength, species, name, animalType, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

		    // adds monkey to the list
		    monkeyList.add(newMonkey);

		    // Confirmation message
		    System.out.println("New monkey added successfully!");
		}


	}

	// Complete reserveAnimal
	// You will need to find the animal by animal type and in service country
	public static void reserveAnimal(Scanner scanner) {
		scanner.nextLine();
		String answer;
		System.out.println("Would you like to reserve an animal? (yes/no)");
		answer = scanner.nextLine();
		// answer check
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Awesome, would it be a monkey or a dog? (monkey/dog)");
			answer = scanner.nextLine();

			// type check
			if (answer.equalsIgnoreCase("dog")) {
				// Display the list of dogs
				int counter = 0;
				for (Dog dog : dogList) {
					counter++;
					System.out.println(counter + ": " + dog);
				}
				if (counter == 0) {
					System.out.println("No dogs available for reservation.");
					return;
				}

				// Ask the user to choose a dog
				System.out.println("Which one would you like to reserve? \n (Please enter a number) ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				if (choice >= 1 && choice <= counter) {
					// Reserve the selected dog

					Dog selectedDog = dogList.get(choice - 1);
					if (selectedDog.getReserved() == false) {
						selectedDog.setReserved(true);
						System.out.println(selectedDog.getName() + " has been reserved successfully.");
					} else {
						System.out.println("Animal is already reserved try another animal");
						reserveAnimal(scanner);
					}
				} else {
					System.out.println("Invalid choice. Please enter a valid number.");
				} 
				//type check
			} else if (answer.equalsIgnoreCase("monkey")) {
				//Display list of monkeys
				int counter = 0;
				for (Monkey monkey : monkeyList) {
					counter++;
					System.out.println(counter + ": " + monkey);
				}
				if(counter == 0) {
					System.out.println("No monkeys available for reservation");
					return;
				}
				// Ask the user to choose a monkey
				System.out.println("Which one would you like to reserve? \n (Please enter a number) ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				if (choice >= 1 && choice <= counter) {
					// Reserve the selected monkey

					Dog selectedDog = dogList.get(choice - 1);
					if (selectedDog.getReserved() == false) {
						selectedDog.setReserved(true);
						System.out.println(selectedDog.getName() + " has been reserved successfully.");
					} else {
						System.out.println("Animal is already reserved try another animal");
						reserveAnimal(scanner);
					}
				} else {
					System.out.println("Invalid choice. Please enter a valid number.");
				}
				
				
				//if its neither a monkey or dog 
		
			} else {
				System.out.println("Invalid choice. Please enter 'monkey' or 'dog'.");
			}
		} // answer check
		else if (answer.equalsIgnoreCase(answer)) {

		}
	}

	// Complete printAnimals
	// Include the animal name, status, acquisition country and if the animal is
	// reserved.
	// Remember that this method connects to three different menu items.
	// The printAnimals() method has three different outputs
	// based on the listType parameter
	// dog - prints the list of dogs
	// monkey - prints the list of monkeys
	// available - prints a combined list of all animals that are
	// fully trained ("in service") but not reserved
	// Remember that you only have to fully implement ONE of these lists.
	// The other lists can have a print statement saying "This option needs to be
	// implemented".
	// To score "exemplary" you must correctly implement the "available" list.
	public static void printAnimals() {
		System.out.println("The method printAnimals needs to be implemented");
	}

}
