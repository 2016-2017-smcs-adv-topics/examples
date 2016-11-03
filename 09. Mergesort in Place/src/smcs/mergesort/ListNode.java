package smcs.mergesort;

public class ListNode {
	private int value;
	private ListNode next;

	public ListNode(int value) {
		this.value = value;
	}
	
	public ListNode(int value, ListNode next) {
		this(value);
		this.setNext(next);
	}
	
	public int getValue() {
		return value;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setNext(ListNode n) {
		next = n;
	}
 }
