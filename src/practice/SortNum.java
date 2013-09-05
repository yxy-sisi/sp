package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortNum {
	public void inputList() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}

		Arrays.sort(num);
		
		System.out.println("after sorting: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ",");
		}
	}

	public static void main(String[] args) {
		System.out.println("input the list of number: ");
		SortNum sn = new SortNum();
		sn.inputList();
	}
}
