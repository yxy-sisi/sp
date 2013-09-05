package practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number: ");
		boolean is = true;
		long a = input.nextLong();
		String s = Long.toString(a);
		char[] ch = s.toCharArray();
		int count = s.length();

		/**
		 * whether this is a palindrome
		 */
		for (int i = 0; i < count / 2; i++) {
			if (ch[i] != ch[count - i - 1]) {
				is = false;
			}
		}
		if (is == true) {
			System.out.println("this is palindrome");
		} else {
			System.out.println("this is not a palindrome number");
		}

	}
}
