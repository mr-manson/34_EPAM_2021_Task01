package by.epamtc.nikalaichanka.task0106.runner;

import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;
import by.epamtc.nikalaichanka.task0106.logic.TimePassedLogic;

public class Runner {

	public static void main(String[] args) {
		int a;
		String h, m, s;
		System.out.println("Enter the number of seconds");
		a = EnterFromConsole.enterIntByUser();

		h = TimePassedLogic.hoursPassed(a) + " hours ";
		m = TimePassedLogic.minutesPassed(a) + " minutes ";
		s = TimePassedLogic.secondsPassed(a) + " seconds";

		System.out.print(h + m + s + " have passed");

	}
}
