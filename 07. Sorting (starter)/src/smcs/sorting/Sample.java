package smcs.sorting;

public class Sample {
	
	public static void main(String[] args) {
		
		/* create a new 10-element vector */
		RandomVector v = new RandomVector(10);
		System.out.println(v); // ... and display it
		
		/* swap elements 2 and 6 */
		v.swap(2, 6);
		System.out.println(v); // ...and display it
		
		/* shuffle the elements once */
		v.shuffle();
		System.out.println(v); // ...and display it
		
		/* shuffle the elements 100 times */
		v.shuffle(100);
		System.out.println(v); // ...and display it

	}
	
}
