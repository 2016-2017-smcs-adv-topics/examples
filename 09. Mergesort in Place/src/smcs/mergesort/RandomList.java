package smcs.mergesort;

import smcs.burke.mergsortlist.ListNode;

public class RandomList {
	
	/*
	 * Group 1: Gabe, Joey, Reid
	 * Group 2: Janelle, Steven, Carol
	 * Group 3: Amanda, Gillian, Sabin
	 */
	
	private ListNode head, tail;

	/**
	 * O(1)
	 * 
	 * @param other
	 * @postcondition This list is a duplicate of other, in that it shares the
	 *                same head and tail values
	 */
	public RandomList(RandomList other) {
		// TODO Group 1
		int intOtherHead = l.getValue(head);
		int intOtherTail = l.getValue(tail);
		other.set(other.size(), intOtherTail);
		other.set(0, intOtherTail);
	}

	/**
	 * O(n) (could be optimized to O(1))
	 * 
	 * @return The number of elements in this list
	 */
	public int size() {
		int i = 0;
		// TODO Group 2
		for(ListNode j = head; j != tail; j = head.getNext()){
			 
			++i;
			
			
		}
		return i+1;
	}

	/**
	 * O(n)
	 * 
	 * @param startOfSecondHalf
	 *            Index of the first element of the "split off" second half of
	 *            the list
	 * @return A new RandomList composed the elements of this list from
	 *         startOfSecondHalf to the end
	 * @postcondition List now ends at startOfSecondHalf-1
	 */
	public RandomList split(int startOfSecondHalf) {
		// TODO Group 3
		if(!isEmpty()){
			
		RandomList second = new RandomList();
		ListNode count = head;
		for(int i=0; i<startOfSecondHalf-1; i++){
			count = count.getNext(); //count counts to the tail of first half
		}
		second.add(count.getNext()); //head of second is the node after first half tail
		second.add(tail); //add tail of current list
		
		this.tail = count; //change current list to only the first half of the list
		return second; 
		
		}else{
			return this;
			System.out.println("empty list");
		}
	}

	/**
	 * O(1)
	 * 
	 * @return whether or not the list is empty
	 */
	public boolean isEmpty() {
		
		if (head == null && tail == null){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * O(1)
	 * 
	 * @precondition List is not empty
	 * @return Value of the first element of the list
	 */
	public int head() {
		// TODO Group 2
		//return 0;
		int a = 0;
		if (head != null){
		
			 a =  head.getValue();
			
			//how do you get a avlue from a node
				
			
		}
		return a;
	}

	/**
	 * O(1)
	 * 
	 * @precondition List is not empty
	 * @return value of the head element of the list
	 * @postcondition Head of list advances to element after head
	 */
	public int pop() {
		// TODO Group 2
		//return 0;
		int i = 0;
		if(head != null){
		 
		 System.out.print(head.getValue());
		  i = head.getValue();
		 head = head.getNext();
		
		 
		
		//check head method
		
		
		}
		 return i;
	}

	private static void set(int x, int i) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @postcondition The list becomes empty; head and tail are null
	 */
	public void clear() {
		// TODO Group 3
		head = null;
		tail = null;
	}
}
