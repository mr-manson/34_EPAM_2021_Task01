package by.epamtc.nikalaichanka.task0108.runner;

import by.epamtc.nikalaichanka.task0108.logic.FunctionValueLogic;
import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;

public class Runner {

		public static void main(String[] args) {

			double x;
			double f;

			System.out.println("Enter X value");

			x = EnterFromConsole.enterIntByUser();
			f = FunctionValueLogic.functionCalculating(x);

			System.out.println("Function Value is " + f);

		}
	}
