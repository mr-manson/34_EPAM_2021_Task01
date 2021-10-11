package by.epamtc.nikalaichanka.task0106.logic;

public class TimePassedLogic {
	
	public static int hoursPassed(int totalSec) {
		int hour = totalSec / 3600;
		return hour;
	}

	public static int minutesPassed(int totalSec) {
		int min = (totalSec % 3600) / 60;
		return min;
	}

	public static int secondsPassed(int totalSec) {
		int sec = ((totalSec % 3600) % 60);
		return sec;
	}

}