package by.epamtc.nikalaichanka.task0103.logic;

public class CircleSquareLogic {

	public static double inscribedCircleRadius(double squareArea) {
		double radius = Math.sqrt(squareArea) / 2;
		return radius;
	}
	
	public static double inscribedSquareArea(double outscribedCircleRadius) {
		double squareSide = (2 * outscribedCircleRadius) / Math.sqrt(2);
		double area = squareSide * squareSide;
		return area;
	}
	
	public static double areaDifference(double out, double in) {
		double difference = out / in;
		return difference;
	}

}
