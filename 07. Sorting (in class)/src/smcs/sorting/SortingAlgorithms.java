package smcs.sorting;

public class SortingAlgorithms {

	public static void main(String[] args) {
		RandomVector v = new RandomVector(10);

		for (int i = 0; i < 4; i++) {
			v.shuffle(v.size());
			System.out.println();
			System.out.print(v);
			System.out.print(" <-- UNSORTED before ");
			switch (i) {
			case 0:
				System.out.println("Bubble Sort");
				bubbleSort(v);
				break;
			case 1:
				System.out.println("Selection Sort");
				selectionSort(v);
				break;
			case 2:
				System.out.println("Insertion Sort");
				insertionSort(v);
				break;
			case 3:
				System.out.println("Mergesort");
				mergesort(v);
				break;
			}
		}
	}

	private static void insertionSort(RandomVector v) {

		// walk through unsorted elements until we run out
		for (int i = 1; i < v.size(); i++) {

			int j = 0, // start looking through sorted section from beginning
					temp = v.get(i); // stash our current unsorted element for
										// future reference

			// and now, INSERT the unsorted element into the sorted portion of
			// the list:

			// walk through sorted list until we find current unsorted element's
			// position
			for (j = 0; j < i && v.get(j) <= v.get(i); j++) {
			}

			// walk from one element to the left of i through to j to the left
			for (int k = i - 1; k >= j; k--) {
				// move element at k 1 step to the right
				v.set(k + 1, v.get(k));
			}

			// copy temp into element j
			v.set(j, temp);

			// show updated list
			System.out.println(v);
		}
	}

	private static void selectionSort(RandomVector v) {
		// i is first unsorted element in my array
		for (int i = 0; i < v.size(); i++) {

			// assume the first element we see is the smallest we've seen so far
			// (a safe assumption!)
			int min = i;

			// walk across the remaining unsorted elements...
			for (int j = i + 1; j < v.size(); j++) {

				// ...and if I find a smaller element, update min to point it
				if (v.get(j) < v.get(min)) {
					min = j;
				}
			}

			// swap my smallest element with my first unsorted element
			if (min != i) {
				v.swap(min, i);
			}
			System.out.print(v);
			System.out.println(" <-- swap elt " + min + " and " + i);
		}
	}

	private static void bubbleSort(RandomVector v) {
		int swaps;
		do {
			// restart our swap counter at zero for this pass through the list
			swaps = 0;
			System.out.println("Starting a pass through the vector...");

			// walk through v...
			for (int i = 1; i < v.size(); i++) {

				// ...if we encounter two elements that are out of order, swap
				// them
				if (v.get(i - 1) > v.get(i)) {
					v.swap(i - 1, i);
					swaps++;
					System.out.print(v);
					System.out.println(" <-- swapped elt " + (i - 1) + " and " + i);
				}
			}
		} while (swaps > 0);
	}
	
	private static void mergesort(RandomVector v) {
		
		System.out.println(v + " <-- UNSORTED");
		
		if (v.size() <= 1) {
			// it's sorted!
			return;
		} else {
			int
				half = v.size() / 2,
				i = 0,
				j = 0;
			RandomVector
				left = v.subList(0, half-1),
				right = v.subList(half, v.size()-1),
				sorted = new RandomVector(0);

			System.out.println(left + " " + right);

			mergesort(left);
			mergesort(right);

			System.out.println(left + " " + right);
			
			while (i < left.size() || j < right.size()) {
				if (i < left.size()) {
					if (j < right.size()) {
						if (left.get(i) < right.get(j)) {
							sorted.add(left.get(i));
							i++;
						} else {
							sorted.add(right.get(j));
							j++;
						}
					} else {
						sorted.add(left.get(i));
						i++;
					}
				} else {
					sorted.add(right.get(j));
					j++;
				}
			}
			
			v.clear();
			v.addAll(sorted);
			
			System.out.println(v + " <-- SORTED");
		}
	}
}
