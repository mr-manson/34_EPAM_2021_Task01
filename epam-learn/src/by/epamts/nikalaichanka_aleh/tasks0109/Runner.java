package by.epamts.nikalaichanka_aleh.tasks0109;

public class Runner {

	public static void main(String[] args) {
		double radius, area, length;
		System.out.println("Enter radius");

		radius = InputFromConsole.inputByUser();

		area = CircleAreaLogic.circleArea(radius);
		System.out.println("Circle area is " + area);

		length = CircleAreaLogic.circleLength(radius);
		System.out.println("Circle length is " + length);

	}
}
