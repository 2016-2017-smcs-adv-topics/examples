
public class Animals {

	public static void main(String[] args) {
		Node decisionTree = new Node("Is it bigger than a breadbox?");
		try {
			decisionTree.setYes(new Node("elephant"));
			decisionTree.setNo(new Node("mouse"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("built");
	}

}
