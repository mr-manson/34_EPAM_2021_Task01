package by.epamtc.nikalaichanka.task0102.logic;

import by.epamtc.nikalaichanka.task0102.mounth.Mounth;

public class LeapYearLogic {

	public static boolean leapYear(int year) {
		boolean leap = false;
		if ((year % 400 == 0 || year % 4 == 0) && (year % 100 != 0)) {
			leap = true;
		}
		return leap;
	}

	public static int mounthDaysQuantity(int mounth, int year) {
		int c = 0;
		for (Mounth m : Mounth.values()) {
			if (mounth - 1 == m.ordinal()) {
				if (mounth == 2 && LeapYearLogic.leapYear(year)) {
					c = m.getQuantity() + 1;
				} else {
					c = m.getQuantity();
				}
			}
		}
		return c;
	}
}
