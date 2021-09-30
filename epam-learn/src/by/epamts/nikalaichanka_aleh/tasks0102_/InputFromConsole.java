package by.epamts.nikalaichanka_aleh.tasks0102_;

import java.util.Scanner;

public class InputFromConsole {

	public static int inputByUser() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			s.nextInt();
		}
		int a = s.nextInt();
		//s.close();
		return a;
	}

}
