package by.epamtc.nikalaichanka.task0105.runner;

import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;
import by.epamtc.nikalaichanka.task0105.logic.PerfectNumberLogic;

public class Runner {

	public static void main(String[] args) {
		int a;
		boolean b;
		System.out.println("Enter the number");

		a = EnterFromConsole.enterIntByUser();
		b = PerfectNumberLogic.isPerfectNumbers(a);

		System.out.print(b);

	}
}
