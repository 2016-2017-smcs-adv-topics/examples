package smcs.battis.animals;
import java.io.*;
import java.util.*;

public class Animals {

	private static Scanner in;

	private static final boolean YES = true, NO = false;

	public static void main(String[] args) {
		Node finger, newAnimal, oldAnimal, decisionTree = null;
		File file = new File("decision_tree");
		
		// if we have a decision tree file…
		if (file.exists()) {
			// …try to read the decision tree from the file
			try {
				ObjectInput obj = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
				decisionTree = (Node) obj.readObject();
				
			// this could go wrong in _so_ many ways…
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
			} catch (ClassNotFoundException e) {
			}
		}
		
		// if the decision tree has not been initialized, do so now
		if (decisionTree == null) {
			decisionTree = new Node("Is it bigger than a breadbox?");
			try {
				decisionTree.setYes(new Node("elephant"));
				decisionTree.setNo(new Node("mouse"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		do {

			System.out.println("Think of an animal.");
			do {
				System.out.println("Are you ready?");
			} while (userInputYesOrNo() == NO);

			// start the finger at the root of the decision tree
			finger = decisionTree;
			while (finger.hasChildren()) { // if this node has children
				System.out.println(finger.getValue()); // ask the question
				if (userInputYesOrNo()) {
					finger = finger.getYes(); // move finger to yes child
				} else {
					finger = finger.getNo(); // move finger to no child
				}
			}

			// guess the animal
			System.out.println("Is it a(n) " + finger.getValue() + "?");

			if (userInputYesOrNo() == YES) {
				System.out.println("Celebrations!"); // woot!
			} else {
				// input the animal
				System.out.println("What animal were you thinking of?");
				
				// create a new node containing the animal
				newAnimal = new Node(in.nextLine().toLowerCase().trim());
				
				// create a new node continaing the finger animal
				oldAnimal = new Node(finger.getValue());
				
				// input a question AND store question in finger node
				System.out.println("Ask a question that would distinguish between a(n) " + oldAnimal.getValue()
						+ " and a(n) " + newAnimal.getValue());
				finger.setValue(in.nextLine().trim());

				// when asked "question" about "animal", yes or no?
				System.out.println("If I asked you \"" + finger.getValue() + "\" and you were thinking of a(n) "
						+ newAnimal.getValue() + ", how would you answer?");
				try {
					if (userInputYesOrNo() == YES) {
						finger.setYes(newAnimal);
						finger.setNo(oldAnimal);
					} else {
						finger.setYes(oldAnimal);
						finger.setNo(newAnimal);
					}
					
					// write updated decision tree to file
					ObjectOutput obj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
					obj.writeObject(decisionTree);
					obj.flush();
					obj.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			System.out.println("Do you want to play again?");

		} while (userInputYesOrNo() == YES);
	}

	/**
	 * Extract a yes or no answer from the user
	 * 
	 * @return true if the user answers yes, false if the user answers no
	 */
	private static boolean userInputYesOrNo() {
		String input;
		if (in == null) {
			in = new Scanner(System.in);
		}
		do {
			input = in.nextLine().toLowerCase();
		} while (input.charAt(0) != 'y' && input.charAt(0) != 'n');
		return (input.charAt(0) == 'y');
	}

}
