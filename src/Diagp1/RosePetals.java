package Diagp1;

public class RosePetals {
	public int getScore(int[] dice) {
		int sum = 0;
		int j = 0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] % 2 != 0) {
				dice[j] = dice[i] - 1;
			} else {
				dice[j] = 0;
			}
			sum += dice[j];

		}

		return sum;

	}

	public static void main(String[] args) {
		RosePetals rp = new RosePetals();
		int[] dice = {4, 4, 5, 6, 5};
		System.out.println(rp.getScore(dice));
		
		
		
	}

}
