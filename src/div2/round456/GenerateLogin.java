package div2.round456;

import java.util.Scanner;

/**
 * Problem stmt
 * 
 * You are given the first and the last name of a user. Return the alphabetically earliest login they can get 
 * 
 * Examples
	input
		harry potter
	output
		hap
	input
		tom riddle
	output
		tomr
		
 * @author aarishramesh
 *
 */
public class GenerateLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] words = new String[2];
		words = a.split(" ");
		StringBuilder builder = new StringBuilder();
		builder.append(words[0].charAt(0));
		
		char suffix = words[1].charAt(0);
		for (int i = 1; i < words[0].length(); i++) {
			if (words[0].charAt(i) < suffix) {
				builder.append(words[0].charAt(i));
				continue;
			}
			break;
		}
		builder.append(suffix);
		System.out.println(builder.toString());
	}
}
