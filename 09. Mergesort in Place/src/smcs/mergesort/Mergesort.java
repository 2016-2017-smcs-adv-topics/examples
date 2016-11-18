package smcs.mergesort;

public class Mergesort {
	
	public static void main(String args[]) {
		RandomList l = new RandomList(10);
		System.out.println(l);
		mergesort(l);
	}
	
	private static void mergesort(RandomList l) {
		if (l.size() <= 1) {
			return;
		} else {
			/* the list in half */
			RandomList left, right;
			right = l.split((int) (l.size() / 2));
			left = new RandomList(l);
			l.clear();
			
			/* mergesort each half */
			mergesort(left);
			mergesort(right);
			System.out.println(left + " / " + right);
			
			/* merge the sorted halves back together */
			while (!left.isEmpty() || !right.isEmpty()) {
				if (!left.isEmpty() && !right.isEmpty()) {
					if (left.head() < right.head()) {
						l.add(left.pop());
					} else {
						l.add(right.pop());
					}
				} else if (left.isEmpty()) {
					l.add(right.pop());
				} else {
					l.add(left.pop());
				}
			}
			System.out.println(l);
		}
	}
}
