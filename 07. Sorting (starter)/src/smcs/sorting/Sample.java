package smcs.sorting;

public class Sample {
	
	public static void main(String[] args) {
		
		/* create a new 10-element vector */
		RandomVector v = new RandomVector(10);
		System.out.println(v); // ... and display it
		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		/* get the element at index 3 */
		System.out.println(v.get(3)); // ...and display it
		// 3
		
		/* set the element at index 7 */
		v.set(7, -2);
		System.out.println(v); // ...and display it
		// [0, 1, 2, 3, 4, 5, 6, -2, 8, 9]
		
		/* swap elements 2 and 6 */
		v.swap(2, 6);
		System.out.println(v); // ...and display it
		// [0, 1, 6, 3, 4, 5, 2, -2, 8, 9]
		
		/* shuffle the elements once */
		v.shuffle();
		System.out.println(v); // ...and display it
		// [4, 3, 0, -2, 9, 6, 1, 5, 8, 2]
		
		/* shuffle the elements 100 times */
		v.shuffle(100);
		System.out.println(v); // ...and display it
		// [2, -2, 0, 1, 9, 6, 3, 4, 8, 5]

	}
	
}
