package smcs.sorting;

public class Sample {
	
	public static void main(String[] args) {
		RandomVector v = new RandomVector(10);
		v.shuffle();
		System.out.println(v);
		InsertionSort(v);
	}

	private static void InsertionSort(RandomVector v) {
		
		// walk through unsorted elements until we run out
		for (int i = 1; i < v.size(); i++) {

			int j = 0, // start looking through sorted section from beginning
				temp = v.get(i); // stash our current unsorted element for future reference
			
			// and now, INSERT the unsorted element into the sorted portion of the list:
			
			// walk through sorted list until we find current unsorted element's position
			for (j = 0; j < i && v.get(j) <= v.get(i); j++) {}
			
			// walk from one element to the left of i through to j to the left
			for (int k = i-1; k >= j; k--) {
				// move element at k 1 step to the right
				v.set(k+1, v.get(k));
			}
			
			// copy temp into element j
			v.set(j, temp);
			
			
			// show updated list
			System.out.println(v);
		}
	}
	
}
