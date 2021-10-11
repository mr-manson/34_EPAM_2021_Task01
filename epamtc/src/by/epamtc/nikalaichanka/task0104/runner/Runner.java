package by.epamtc.nikalaichanka.task0104.runner;

import by.epamtc.nikalaichanka.task0104.logic.TwoEvenNumbersLogic;
import by.epamtc.nikalaichanka.task00all.console.*;

public class Runner {

	public static void main(String[] args) {
		int [] a;
		boolean b;
		System.out.println("Enter four numbers");
		a = EnterFromConsole.enterIntMassByUser();
		b = TwoEvenNumbersLogic.thereIsTwoEvenNumbers(a);
		System.out.print(b);
	}
}
