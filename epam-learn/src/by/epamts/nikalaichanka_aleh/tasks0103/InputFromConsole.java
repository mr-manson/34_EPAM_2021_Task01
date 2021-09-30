package by.epamts.nikalaichanka_aleh.tasks0103;

import java.util.Scanner;

public class InputFromConsole {

	public static int inputByUser() {
		int a = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			s.nextInt();
		}
		a = s.nextInt();

		return a;
	}

}
