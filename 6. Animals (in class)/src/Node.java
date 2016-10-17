
public class Node {
	private String value;
	private Node yes, no;
	
	public Node(String s) {
		setValue(s);
		yes = null;
		no = null;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String s) {
		// is it an animal?
		// if it's not, does it end with a question mark?
		value = s.toLowerCase();
	}
	
	public Node getYes() {
		return yes;
	}
	
	public Node getNo() {
		return no;
	}
	
	private Node guaranteeNotNull(Node n) throws Exception {
		if (n != null) {
			return n;
		} else {
			throw new Exception("Cannot set a child node to null");
		}
	}
	
	public void setYes(Node n) throws Exception {
		yes = guaranteeNotNull(n);
	}
	
	public void setNo(Node n) throws Exception {
		no = guaranteeNotNull(n);
	}
	
	public boolean hasChildren() {
		return (yes != null) && (no != null);
	}
}
