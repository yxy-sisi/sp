package Diagp1;

import java.util.Arrays;

public class BuyingDrinks {
	public int variety(int amount, int[] prices) {
		int number = 0;
		int sum = 0;
		Arrays.sort(prices);
		for (int i = 0; i < prices.length; i++) {

			sum += prices[i];

			if (sum <= amount) {
				number++;
			}
		}

		return number;

	}

	public static void main(String[] args){
		BuyingDrinks db = new BuyingDrinks();
		int[] prices = {5,5,2,5,3};
		System.out.println(db.variety(10, prices));
		
	}
}