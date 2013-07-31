package Diagp1;

public class StringSegment1 {
	public double average(String s) {

		double seg = 0;
		double ave = 0;
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				seg++;
			}
		}
		System.out.println("seg check:" + seg + 1);
		System.out.println("s.length():" + s.length());
		ave = s.length() / (seg + 1);
		return ave;
	}

	public static void main(String[] args) {
		StringSegment1 ss = new StringSegment1();
		System.out.println(ss.average("aabbc"));
	}
	
}
