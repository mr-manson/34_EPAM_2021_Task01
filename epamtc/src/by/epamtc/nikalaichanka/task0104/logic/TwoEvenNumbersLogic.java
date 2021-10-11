package by.epamtc.nikalaichanka.task0104.logic;

public class TwoEvenNumbersLogic {

	public static boolean thereIsTwoEvenNumbers(int [] a) {
		boolean b = false;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		if (count >=2) {
		b = true;
		}
		return b;
	}

}
