package Diagp1;

public class LeapYear {
	private int year;

	 public LeapYear(int year){
	 this.year = year;
	 }

//	public LeapYear() {
//		// TODO Auto-generated constructor stub
//	}

	public void ifIsLeap() {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("this is leap year");

		} else {
			System.out.println(year + " is not leap year");

		}

	}

	public static void main(String[] args) {
		LeapYear ly = new LeapYear(1987);
		ly.ifIsLeap();
		
	}
}
