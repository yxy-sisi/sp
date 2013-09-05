package practice;

import java.util.Scanner;

public class Palindrome_5 {
	public static void main(String[] args) {
		System.out.println("input a number between 10000 and 99999:");
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		String s = String.valueOf(number);// transfer integer to string
		char[] ch = s.toCharArray();// char array

		if (number >= 10000 && number <= 99999) {
			if (ch[0] == ch[4] && ch[1] == ch[3]) {
				System.out.println("this is a palindrome number");
			} else {
				System.out.println("this is not a palindrome number");
			}
		}else{
			System.out.println("this is out of range");
		}

	}
}
