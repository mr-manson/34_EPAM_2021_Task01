package by.epamts.nikalaichanka_aleh.tasks0104;

public class CloserPointLogic {

	public static boolean thereIsTwoEvenNumbers(int [] a) {
		boolean b = false;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		//System.out.println(count);
		if (count >=2) {
		b = true;
		}
		return b;
	}

}
