package by.epamts.nikalaichanka_aleh.tasks0105;

public class PerfectNumberLogic {

	public static boolean isPerfectNumbers(int a) {
		boolean b = false;
		int summ = 0;

		for (int i = 1; i <= a / 2; i++) {
			if (a % i == 0) {
				summ += i;
			}
		}
		System.out.println(summ);
		if (summ == a) {
		b = true;
		}
		return b;
	}

}
