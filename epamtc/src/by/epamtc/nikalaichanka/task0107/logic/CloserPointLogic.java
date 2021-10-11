package by.epamtc.nikalaichanka.task0107.logic;

import by.epamtc.nikalaichanka.task0107.entity.Point;

public class CloserPointLogic {

	public static double distanceToZero(double x, double y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;
	}

	public static double distanceToZero(Point p) {
		double distance = Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
		return distance;
	}

	public static int whoIsCloser(double a, double b) {
		int c = 0;
		c = (a > b) ? 1 : 2;
		return c;
	}

	public static int whoIsCloser(Point p1, Point p2) {
		int c;
		if (CloserPointLogic.distanceToZero(p1) == CloserPointLogic.distanceToZero(p2)) {
			c = 0;
		} else {
		c = (CloserPointLogic.distanceToZero(p1) < CloserPointLogic.distanceToZero(p2)) ? 1 : 2;
		}
		return c;
	}

	public static String whoIsCloserPrint(Point p1, Point p2) {
		String result;
		if (CloserPointLogic.whoIsCloser(p1, p2) == 0) {
			result = "Distance to zero is the same";
		} else {
			result = (CloserPointLogic.whoIsCloser(p1, p2) < 2)
					? "Closer to zero is " + p1.toString() : "Closer to zero is " + p2.toString();
		}
		return result;
	}
}
