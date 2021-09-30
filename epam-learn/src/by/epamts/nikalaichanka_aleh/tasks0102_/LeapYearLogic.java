package by.epamts.nikalaichanka_aleh.tasks0102_;

public class LeapYearLogic {
	public static boolean leapYear(int year) {
		boolean leap = false;
		if (year % 4 == 0) {
			leap = true;
		}
		return leap;
	}
	
	
}
