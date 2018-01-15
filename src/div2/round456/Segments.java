package div2.round456;
import java.util.Scanner;

/**
 * You are given an integer N. Consider all possible segments on the coordinate axis with endpoints at integer points with coordinates between 0 and N, inclusive; there will be n * (n + 1) / 2 of them.

You want to draw these segments in several layers so that in each layer the segments don't overlap (they might touch at the endpoints though). You can not move the segments to a different location on the coordinate axis.

Find the minimal number of layers you have to use for the given N.

Input
The only input line contains a single integer N (1 ≤ N ≤ 100).

Output
Output a single integer - the minimal number of layers required to draw the segments for the given N
 * 
 * @author aarishramesh
 *
 */
public class Segments {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(((n / 2) + 1) * (int) Math.ceil((n + 1)/2));
	}
}
