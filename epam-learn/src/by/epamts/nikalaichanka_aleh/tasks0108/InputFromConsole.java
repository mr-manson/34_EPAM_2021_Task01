package by.epamts.nikalaichanka_aleh.tasks0108;

import java.util.Scanner;

public class InputFromConsole {

	public static double inputByUser() {
		double a = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextDouble()) {
			s.nextDouble();
		}
		a = s.nextDouble();

		return a;
	}

}
