package by.epamtc.nikalaichanka.task0101.logic;

public class PowerLastDigitLogic {

	public static double powerTwo(double a) {
		a *= a;
		return a;
	}

	public static double lastDigit(double a) {
		a = a % 10;
		return a;
	}

}
