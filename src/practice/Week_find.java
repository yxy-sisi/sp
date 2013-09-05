package practice;

import java.util.Scanner;


public class Week_find {
	public char getChar() {// in java, there is no getChar(), there is
							// getChars()
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char ch = str.charAt(0);
		return ch;

	}

	public static void main(String[] args) {
		Week_find w = new Week_find();
		System.out.println("please input the first Upper Case:");
		char c = w.getChar();
		switch (c) {
		case 'M':
			System.out.println("Monday");
			break;
		case 'W':
			System.out.println("Wednesday");
			break;
		case 'F':
			System.out.println("Friday");
			break;
		case 'T': {
			System.out.println("please input the second Upper Case:");
			char c_another1 = w.getChar();
			if (c_another1 == 'U') {
				System.out.println("Tuesday");
			} else if (c_another1 == 'H') {
				System.out.println("Thursday");
			} else {
				System.out
						.println("this is not correct one.you can just input U and H.");
			}
		}
			;// Notice, here is a {};
			break;
		case 'S': {
			System.out.println("please input the second Upper Case: ");
			char c_another2 = w.getChar();
			if (c_another2 == 'U') {
				System.out.println("Sunday");
			} else if (c_another2 == 'A') {
				System.out.println("Saterday");
			} else if (c_another2 != 'U' && c_another2 != 'A') {
				System.out.println("please input second case U and A. ");
				char c_another3 = w.getChar();
				if (c_another3 == 'U') {
					System.out.println("Sunday");
				} else if (c_another3 == 'A') {
					System.out.println("Saterday");
				}
			}
		}
			;
			break;
		default:
			System.out.println("no!");

		}
	}
}
