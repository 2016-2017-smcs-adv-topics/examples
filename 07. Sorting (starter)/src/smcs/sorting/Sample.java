package smcs.sorting;

public class Sample {
	
	public static void main(String[] args) {
		
		/* create a new 10-element vector */
		RandomVector v = new RandomVector(10);
		System.out.println(v); // ... and display it
		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		/* swap elements 2 and 6 */
		v.swap(2, 6);
		System.out.println(v); // ...and display it
		// [0, 1, 6, 3, 4, 5, 2, 7, 8, 9]
		
		/* shuffle the elements once */
		v.shuffle();
		System.out.println(v); // ...and display it
		// [3, 1, 0, 6, 4, 2, 9, 5, 7, 8]
		
		/* shuffle the elements 100 times */
		v.shuffle(100);
		System.out.println(v); // ...and display it
		// [2, 7, 1, 9, 0, 6, 8, 5, 4, 3]

	}
	
}
