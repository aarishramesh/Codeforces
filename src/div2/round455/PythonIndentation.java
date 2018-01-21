package div2.round455;

import java.util.Scanner;

/**
 * Python Indentation

 * In Python, code blocks don't have explicit begin/end or curly braces to mark beginning and end of the block. 
 * Instead, code blocks are defined by indentation.
 * 
 * Simple statements are written in a single line, one per line. An example of a simple statement is assignment.

   For statements are compound statements: they contain one or several other statements. For statement consists of a header written in a separate line which starts with "for" prefix, and loop body. Loop body is a block of statements indented one level further than the header of the loop. Loop body can contain both types of statements. Loop body can't be empty.

   You are given a sequence of statements without indentation. Find the number of ways in which the statements can be indented to form a valid Python program.

 * Examples
	input
	4
	s
	f
	f
	s
	output
	1
	
	input
	4
	f
	s
	f
	s
	output
	2
 * 
 * @author aarishramesh
 *
 */
public class PythonIndentation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		char[] arr = new char[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextLine().charAt(0);
		System.out.println(calIndentPoss(arr));
		sc.close();
	}

	/**
	 * Iterative solution
	 * 
	 * @param arr
	 * @return
	 */
	private static long calIndentPoss(char[] arr) {
		long[][] dpArr = new long[arr.length][arr.length];
		dpArr[0][0] = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == 'f') {
				for (int j = 0; j < i; j++)
					dpArr[i][j + 1] = dpArr[i - 1][j]; 
			} else {
				long suffix = 0;
				for (int j = i - 1; j >=0; j--) {
					suffix = suffix + dpArr[i - 1][j];
					dpArr[i][j] = suffix;
				}
			}
		}
		
		long noOfWays = 0;
		for (int col = 0; col < arr.length; col++)
			noOfWays += dpArr[arr.length - 1][col];
		return noOfWays;
	}
}
