package by.epamtc.nikalaichanka.task0110.runner;

public class Test {

	public static void main(String[] args) {
		double a = 1;
		double b = 10;
		double h = 2;
		double f;

		for (double i = a; i <= b; i += h) {
			f = Math.tan(i);
			System.out.printf(i + "\t" + f + "\n");
		}
	}
}
