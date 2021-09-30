package by.epamts.nikalaichanka_aleh.tasks0101;

public class Runner {

	public static void main(String[] args) {

		double a, b, c;

		System.out.println("Enter number");
		a = InputFromConsole.inputByUser();

		b = PowerLastDigitLogic.powerTwo(a);
		System.out.println("Sqr is " + b);

		c = PowerLastDigitLogic.lastDigit(b);
		System.out.println("Last digit of sqr is - " + c);
	}
}
