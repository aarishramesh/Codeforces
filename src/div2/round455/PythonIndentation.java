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
		System.out.println(calIndentPoss(arr, 0));
		sc.close();
	}

	private static int calIndentPoss(char[] arr, int i) {
		if (i < arr.length) {
			if (arr[i] == 's') {
				i++;
				return calIndentPoss(arr, i);
			} else if (arr[i] == 'f') {
				if (i + 1 < arr.length && arr[i + 1] == 's') {
					if (i + 2 < arr.length && arr[i + 2] == 'f') {
						i = i + 2;
						return 2 * calIndentPoss(arr, i);
					} else {
						i++;
						return calIndentPoss(arr, i);
					}
				} else {
					i++;
					return calIndentPoss(arr, i);
				}
			}
		}
		return 1;
	}
}
