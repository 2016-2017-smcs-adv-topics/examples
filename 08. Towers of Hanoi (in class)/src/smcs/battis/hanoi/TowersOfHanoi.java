package smcs.battis.hanoi;

import java.util.*;

public class TowersOfHanoi {
	private static int steps = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("How many disks do you want to move from post 1 to post 3?");
		n = in.nextInt();
		
		solve(n, 1, 3, 2);
	}
	
	public static void solve(int n, int start, int end, int spare) {
		// move n-1 disks out of the way to the spare (recursive case)
		if (n > 1) {
			solve (n-1, start, spare, end);
		}
		
		// move the bottom disk (base case)
		steps++;
		System.out.println(steps + ". Move disk " + n + " from post " + start + " to post " + end);
		
		// move n-1 disks off the spare on to the end post (on top of the bottom disk)
		if (n > 1) {
			solve (n-1, spare, end, start);
		}
	}
}
