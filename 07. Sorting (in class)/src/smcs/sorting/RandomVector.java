package smcs.sorting;

import java.util.*;

/**
 * A randomizable vector of integers
 * 
 * @author Seth Battis <sethbattis@stmarksschool.org>
 *
 */
public class RandomVector extends Vector<Integer> {

	/**
	 * Constructs a vector with the specified initial capacity with each
	 * element's value set to its index
	 * 
	 * @param initialCapacity
	 */
	public RandomVector(int initialCapacity) {
		super(initialCapacity);
		for (int i = 0; i < initialCapacity; i++) {
			add(i);
		}
	}

	/**
	 * Swap the values of the elements at index1 and index2
	 * 
	 * @param index1
	 * @param index2
	 */
	public void swap(int index1, int index2) {
		int temp = get(index1);
		set(index1, get(index2));
		set(index2, temp);
	}

	/**
	 * Shuffle the vector by randomly swapping pairs of elements
	 * 
	 * A "complete" shuffle will swap once for each element of the vector,
	 * however there is no guarantee that every element of the vector will in
	 * fact be moved or that any element will finish in a different position
	 * than that in which it started.
	 */
	public void shuffle() {
		shuffle(1);
	}

	/**
	 * Shuffle the vector multiple times
	 * 
	 * @param iterations
	 */
	public void shuffle(int iterations) {
		for (int i = 0; i < iterations; i++) {
			for (int j = 0; j < size(); j++) {
				swap((int) (Math.random() * size()), (int) (Math.random() * size()));
			}
		}
	}
	
	public RandomVector subList(int start, int end) {
		RandomVector sub = new RandomVector(0);
		for (int i = start; i <= end && i >= 0 && i < size(); i++) {
			sub.add(get(i));
		}
		return sub;
	}
}
