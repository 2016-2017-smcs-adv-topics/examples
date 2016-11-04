package smcs.joeysmith.mergesort;

import java.util.*;

public class SortingAlgorithm {

	public static void main(String[] args) {

		Random random = new Random();
		int value = random.nextInt(1000);
		
		int n = 4;

		System.out.println("Here you have a vector of ordered numbers");
		RandomVector newVector = new RandomVector(n);
		System.out.println(newVector);

		System.out.println("Now lets shuffle it " + value + " times:");

		newVector.shuffle(value);
		System.out.println(newVector);

		System.out.println("And now we can sort it from least to greatest again using merge sort");

		RandomVector firstSplit1 = new RandomVector(n/2);
		RandomVector firstSplit2 = new RandomVector(n/2);
		RandomVector quarter1 = new RandomVector(n/4);
		RandomVector quarter2 = new RandomVector(n/4);
		RandomVector quarter3 = new RandomVector(n/4);
		RandomVector quarter4 = new RandomVector(n/4);
		RandomVector midStep1 = new RandomVector(n/2);
		RandomVector midStep2 = new RandomVector(n/2);
		RandomVector mergedList = new RandomVector(n);


			for (int i = 0; i < n/2; i++) {
				int temp;
				int another;
				temp = newVector.get(i);
				another = newVector.get(i + 2);
				firstSplit1.set(i, temp);
				firstSplit2.set(i, another);
			}
			
			for (int i = 0; i < n/4; i++) {
				int temp;
				int another;
				int pencil;
				int pen;
				temp = firstSplit1.get(i);
				another = firstSplit1.get(i + 1);
				pencil = firstSplit2.get(i);
				pen = firstSplit2.get(i + 1);
				quarter1.set(i, temp);
				quarter2.set(i, another);
				quarter3.set(i, pencil);
				quarter4.set(i, pen);
			}
			

			System.out.println("First half of original = " + firstSplit1);

			System.out.println("Second half of original = " + firstSplit2);
			
			System.out.println("First quarter of original split = " + quarter1);

			System.out.println("Second quarter of original split = " + quarter2);
			
			System.out.println("Third quarter of original split = " + quarter3);

			System.out.println("Fourth quarter of original split = " + quarter4);
			
			for (int i = 0; i < n/4; i++) {
				int min1 = quarter1.get(i);
				int min2 = quarter2.get(i);
				int min3 = quarter3.get(i);
				int min4 = quarter4.get(i);
				if (min1 < min2) {
					midStep1.set(i, min1);
					midStep1.set(i + 1, min2);
				} else {
					midStep1.set(i, min2);
					midStep1.set(i + 1, min1);
				}
				if (min3 < min4) {
					midStep2.set(i, min3);
					midStep2.set(i + 1, min4);
				} else {
					midStep2.set(i, min4);
					midStep2.set(i + 1, min3);
				}

				System.out.println("Sorted branch one = " + midStep1);
				System.out.println("Sorted branch two = " + midStep2);

			for (int j = 0; j < n/2; j ++) {
				int x = midStep1.get(j);
				int y = midStep2.get(j);
				if (x < y){
					mergedList.set(j, x);
					mergedList.set(j+1, y);
				} else {
					mergedList.set(j, y);
					mergedList.set(j+1, x);
				}
			}
			for (int j = 2; j < n; j ++) {
				int x = midStep1.get(n/4);
				int y = midStep2.get(n/4);
				if (x < y){
					mergedList.set(j, x);

				} else {
					mergedList.set(j, y);
				}
			}
			
			System.out.println("Final Merged List = " + mergedList);
	}
}
}
	