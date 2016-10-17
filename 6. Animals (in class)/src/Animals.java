import java.util.*;

public class Animals {

	private static Scanner in;
	
	public static void main(String[] args) {
		Node finger, decisionTree = new Node("Is it bigger than a breadbox?");
		try {
			decisionTree.setYes(new Node("elephant"));
			decisionTree.setNo(new Node("mouse"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// start the finger at the root of the decision tree
		finger = decisionTree;
		while (finger.hasChildren()) { // if this node has children
			System.out.println(finger.getValue()); // ask the question
			if (userInputYesOrNo()) {
				finger = finger.getYes(); // move finger to yes child
			} else {
				finger = finger.getNo();
			}
		}
		
		// guess the animal
		System.out.println("Is it a(n) " + finger.getValue() + "?");
	}

	/**
	 * Extract a yes or no answer from the user
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
