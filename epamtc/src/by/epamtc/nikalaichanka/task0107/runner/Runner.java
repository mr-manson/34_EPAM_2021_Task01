package by.epamtc.nikalaichanka.task0107.runner;

import by.epamtc.nikalaichanka.task0107.entity.Point;
import by.epamtc.nikalaichanka.task0107.logic.CloserPointLogic;
import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;

public class Runner {

	public static void main(String[] args) {

		Point point1 = new Point();
		Point point2 = new Point();

		System.out.println("Enter A point X");
		point1.setX(EnterFromConsole.enterDoubleByUser());
		System.out.println("Enter A point Y");
		point1.setY(EnterFromConsole.enterDoubleByUser());

		System.out.println("Enter B point X");
		point2.setX(EnterFromConsole.enterDoubleByUser());
		System.out.println("Enter B point Y");
		point2.setY(EnterFromConsole.enterDoubleByUser());

		System.out.println(CloserPointLogic.whoIsCloserPrint(point1, point2));
	}
}
