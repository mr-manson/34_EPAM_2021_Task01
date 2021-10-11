package by.epamtc.nikalaichanka.task0101.runner;


import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;
import by.epamtc.nikalaichanka.task0101.logic.PowerLastDigitLogic;

public class Runner {

public static void main(String[] args) {

	double a, b, c;

	System.out.println("Enter number");
	a = EnterFromConsole.enterDoubleByUser();

	b = PowerLastDigitLogic.powerTwo(a);
	System.out.println("Sqr is " + b);

	c = PowerLastDigitLogic.lastDigit(b);
	System.out.println("Last digit of sqr is - " + c);
}
}
