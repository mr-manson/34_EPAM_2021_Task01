package by.epamtc.nikalaichanka.task0110.runner;

import java.util.Map;

import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;
import by.epamtc.nikalaichanka.task0101.logic.PowerLastDigitLogic;
import by.epamtc.nikalaichanka.task0110.logic.TanFunctionLogic;
import by.epamtc.nikalaichanka.task0110.util.Util;

public class Runner {

	public static void main(String[] args) {
		
		double a, b, h;

		System.out.println("Enter range from 'a' to 'b'");
		a = EnterFromConsole.enterDoubleByUser();
		b = EnterFromConsole.enterDoubleByUser();

		System.out.println("Enter step");
		h = EnterFromConsole.enterDoubleByUser();


		Map<Double, Double> map = TanFunctionLogic.functionInRange(a, b, h);
		Util.printSummaryTable(map);

	}

}
