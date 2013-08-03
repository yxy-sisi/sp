package Diagp1;

import java.util.Scanner;

public class LeapYearScanner {
public static void main(String[] args) {
	System.out.println("please enter year: ");
	Scanner input = new Scanner(System.in);
	int year = input.nextInt();
	
	if(year < 0 || year > 3000){
		System.out.println("bad input!");
		System.exit(0);
	}else{
		if(year%4 ==0 && year % 100!=0 || year%400 == 0){
			System.out.println(year + " is leap year");	
		}else{
			System.out.println(year + " is not a leap year");
		}
	}
	input.close();
}
}
