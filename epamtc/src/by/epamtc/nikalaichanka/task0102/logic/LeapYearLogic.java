package by.epamtc.nikalaichanka.task0102.logic;

import by.epamtc.nikalaichanka.task0102.mounth.Mounth;

public class LeapYearLogic {
	
	public static final int FOUR_HUND_DIV = 400;
	public static final int FOUR_DIV = 4;
	public static final int HUND_DIV = 100;

	public static boolean isLeapYear(int year) {
		boolean leap = false;
		if ((year % FOUR_HUND_DIV == 0 || year % FOUR_DIV == 0) && (year % HUND_DIV != 0)) {
			leap = true;
		}
		return leap;
	}

	public static int mounthDaysQuantity(int mounth, int year) {
		int c = 0;
		for (Mounth m : Mounth.values()) {
			if (mounth - 1 == m.ordinal()) {
				c = m.getQuantity();
				if (mounth == 2 && LeapYearLogic.isLeapYear(year)) {
					c++;
				}
			}
		}
		return c;
	}
}
