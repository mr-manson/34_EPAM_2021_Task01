package by.epamtc.nikalaichanka.task0108.logic;

public class FunctionValueLogic {

	public static boolean isLessThanThree(double x) {
		boolean less = true;
		if (x >= 3) {
			less = false;
		}
		return less;
	}

	public static double functionCalculatingLess(double x) {
		double f = 1 / (Math.pow(x, 3) - 6);
		return f;
	}

	public static double functionCalculatingMore(double x) {
		double f = (Math.pow(-x, 2)) + 3 * x + 9;
		return f;
	}

	public static double functionCalculating(double x) {
		double f = 0;
		if (FunctionValueLogic.isLessThanThree(x)) {
			f = FunctionValueLogic.functionCalculatingLess(x);
		} else {
			f = FunctionValueLogic.functionCalculatingMore(x);
		}
		return f;

	}

}