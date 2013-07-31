package Diagp1;

public class StringSegment {
	public double average(String s) {
		double seg = 0;
		double ave = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1) {
				
				seg++;
			}else{
			if (s.charAt(i) != s.charAt(i + 1)) {
				seg++;
				System.out.println("seg1:"+seg);	
			}
			
			}
		}
		System.out.println("seg2:"+seg);
		System.out.println("s.length():"+s.length());
		ave = s.length() / seg;

		return ave;

	}

	public static void main(String[] args) {
		StringSegment ss = new StringSegment();
		System.out.println(ss.average("aabbcc"));
	}
}
