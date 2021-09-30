package by.epamts.nikalaichanka_aleh.tasks0108;

public class Runner {

	public static void main(String[] args) {
		double x;
		double f;

		System.out.println("Enter X value");

		x = InputFromConsole.inputByUser();

		f = FunctionValueLogic.functionCalculating(x);

		System.out.println("Function Value is " + f);

	}
}
