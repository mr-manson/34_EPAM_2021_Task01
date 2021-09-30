package by.epamts.nikalaichanka_aleh.tasks0106;

public class Runner {

	public static void main(String[] args) {
		int a;
		String h, m, s;
		System.out.println("Enter the number of seconds");
		a = InputFromConsole.inputByUser();

		h = TimePassedLogic.hoursPassed(a) + " hours ";
		m = TimePassedLogic.minutesPassed(a) + " minutes ";
		s = TimePassedLogic.secondsPassed(a) + " seconds";

		System.out.print(h + m + s + " have passed");

	}
}
