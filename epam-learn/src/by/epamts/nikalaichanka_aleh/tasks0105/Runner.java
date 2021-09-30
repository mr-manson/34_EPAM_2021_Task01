package by.epamts.nikalaichanka_aleh.tasks0105;

public class Runner {

	public static void main(String[] args) {
		int a;
		boolean b;
		System.out.println("Enter the number");
		
		a = InputFromConsole.inputByUser();
		
		b = PerfectNumberLogic.isPerfectNumbers(a);
		
		System.out.print(b);
		
		
		//b = PerfectNumber.thereIsTwoEvenNumbers(a);

	}
}
