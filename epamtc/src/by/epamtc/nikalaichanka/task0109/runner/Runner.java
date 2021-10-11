package by.epamtc.nikalaichanka.task0109.runner;

import by.epamtc.nikalaichanka.task0109.logic.CircleAreaLogic;
import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;

public class Runner {

	public static void main(String[] args) {
		double radius, area, length;
		System.out.println("Enter radius");

		radius = EnterFromConsole.enterDoubleByUser();

		area = CircleAreaLogic.circleArea(radius);
		System.out.println("Circle area is " + area);

		length = CircleAreaLogic.circleLength(radius);
		System.out.println("Circle length is " + length);

	}
}
