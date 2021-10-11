package by.epamtc.nikalaichanka.task00all.console;

import java.util.Scanner;

public class EnterFromConsole {

	public static double enterDoubleByUser() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextDouble()) {
			s.nextDouble();
		}
		double a = s.nextDouble();
		return a;
	}

	public static int enterIntByUser() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			s.nextInt();
		}
		int a = s.nextInt();
		return a;
	}
	
	public static int[] enterIntMassByUser() {
		int [] a = new int[4];
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
		while (!s.hasNextInt()) {
			s.nextInt();
		}
		a [i] = s.nextInt();
		}
		return a;
	}
}
