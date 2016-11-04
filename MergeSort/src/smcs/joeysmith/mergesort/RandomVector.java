package smcs.joeysmith.mergesort;

import java.util.*;

public class RandomVector extends Vector<Integer>{


	public RandomVector(int initialCapacity) {
		super(initialCapacity);
		for (int i = 0; i < initialCapacity; i++) {
			add(i);
		}
	}

	public void swap(int index1, int index2) {
		int temp = get(index1);
		set(index1, get(index2));
		set(index2, temp);
	}


	public void shuffle() {
		shuffle(1);
	}


	public void shuffle(int iterations) {
		for (int i = 0; i < iterations; i++) {
			for (int j = 0; j < size(); j++) {
				swap((int) (Math.random() * size()), (int) (Math.random() * size()));
			}
		}
	}

	

}