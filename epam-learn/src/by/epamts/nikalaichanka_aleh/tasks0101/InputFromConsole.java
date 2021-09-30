package by.epamts.nikalaichanka_aleh.tasks0101;

import java.util.Scanner;

public class InputFromConsole {

	public static double inputByUser() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextDouble()) {
			s.nextDouble();
		}
		double a = s.nextDouble();
		return a;
	}

}
