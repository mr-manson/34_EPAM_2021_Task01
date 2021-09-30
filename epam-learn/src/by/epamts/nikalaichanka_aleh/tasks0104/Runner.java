package by.epamts.nikalaichanka_aleh.tasks0104;

public class Runner {

	public static void main(String[] args) {
		int [] a;
		boolean b;
		System.out.println("Enter four numbers");
		a = InputFromConsole.inputByUser();
		b = CloserPointLogic.thereIsTwoEvenNumbers(a);
		System.out.print(b);
	}
}
