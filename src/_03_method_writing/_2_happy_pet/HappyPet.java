package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String answer = JOptionPane.showInputDialog("Do you want a dog, cat, or bird?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while (happinessLevel < 90) {

			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your animal happy?\nHappiness level is " + happinessLevel, "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Take a walk", "Give bath" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if(task == 0) {
				feed (answer);
			}
			if(task == 1) {
				water(answer);
			}
			if(task == 2) {
				walk(answer);
			}
			if (task == 3) {
				bath(answer);
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		if (happinessLevel >= 90) {
			JOptionPane.showMessageDialog(null, "Your pet is happy.");
			break;
		}
		}
	}
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void feed(String petType) {
		if (petType.equals("cat")){
			JOptionPane.showMessageDialog(null,"The cat purrs");
			happinessLevel += 15;
		} else if (petType.equals("dog")){
			JOptionPane.showMessageDialog(null, "The dog is fed now");
			happinessLevel += 25;
		}
		else if(petType.equals("bird")) {
			JOptionPane.showMessageDialog(null, "The bird said thanks");
			happinessLevel += 10;
		}
	}

	static void water(String petType) {
		if (petType.equals("cat")){
			JOptionPane.showMessageDialog(null,"The cat drinks");
			happinessLevel += 10;
		} else if (petType.equals("dog")){
			JOptionPane.showMessageDialog(null, "The dog lays down.");
			happinessLevel += 20;
		}
		else if(petType.equals("bird")) {
			JOptionPane.showMessageDialog(null, "The bird flies to the water");
			happinessLevel += 15;
		}
	}
	static void walk(String petType) {
		if (petType.equals("cat")){
			JOptionPane.showMessageDialog(null,"The cat enjoys the walk");
			happinessLevel += 20;
		} else if (petType.equals("dog")){
			JOptionPane.showMessageDialog(null, "The dog is tired from the walk");
			happinessLevel += 30;
		}
		else if(petType.equals("bird")) {
			JOptionPane.showMessageDialog(null, "The bird sits on your shoulder");
			happinessLevel += 15;
		}
	}
	static void bath(String petType) {
		if (petType.equals("cat")){
			JOptionPane.showMessageDialog(null,"The cat did not like the bath");
			happinessLevel += 10;
		} else if (petType.equals("dog")){
			JOptionPane.showMessageDialog(null, "The dog loved the bath");
			happinessLevel += 30;
		}
		else if(petType.equals("bird")) {
			JOptionPane.showMessageDialog(null, "The bird liked the bath");
			happinessLevel += 15;
		}
	}
}