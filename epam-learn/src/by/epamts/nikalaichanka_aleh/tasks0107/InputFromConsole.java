package by.epamts.nikalaichanka_aleh.tasks0107;

import java.util.Scanner;

public class InputFromConsole {

	public static int[] inputByUser() {
		int [] a = new int[4];
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
		while (!s.hasNextInt()) {
			s.nextInt();
		}
		a [i] = s.nextInt();
		}
		return a;
	}

	
	/*private int[] numbersReader() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.println("Enter four numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number format.");
                scanner.nextLine();
            }
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }*/
	
}
