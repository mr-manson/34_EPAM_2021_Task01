package by.epamtc.nikalaichanka.task0102.runner;

import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;
import by.epamtc.nikalaichanka.task0102.logic.LeapYearLogic;

public class Runner {

	public static void main(String[] args) {
		
		int mounth = 0, year = 0;
		
		System.out.println("Enter number of mounth (from 1 to 12)");
		mounth = EnterFromConsole.enterIntByUser();
		System.out.println("Enter year");
		year = EnterFromConsole.enterIntByUser();
		
		System.out.println(LeapYearLogic.mounthDaysQuantity(mounth, year));

	}

}
