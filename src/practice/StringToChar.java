package practice;

import java.util.Scanner;

public class StringToChar {
public static void main(String[] args) {
	System.out.println("input a long: ");
	Scanner input = new Scanner(System.in);
    long a = input.nextLong();
    
    String s = String.valueOf(a);//transfer long to string( Long.toString(a), volueOf can return "null")
    char[] ch = s.toCharArray();//transfer to array
    int count = ch.length;
    System.out.println("input a's length is: "+ count);//print the length of input long a
    
    System.out.println("print invert result: ");
    for(int i=count-1; i>=0; i--){
    	System.out.print(ch[i] + ",");
    }
    
    
    
	
//	System.out.println();
}
}
