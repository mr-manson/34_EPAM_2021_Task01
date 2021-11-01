package by.epamtc.nikalaichanka.task0110.logic;

import java.util.Map;
import java.util.TreeMap;

public class TanFunctionLogic {

	public static Map<Double, Double> functionInRange(double a, double b, double h) {

		Map<Double, Double> map = new TreeMap<Double, Double>();

		for (double i = a; i <= b; i += h) {
			map.put(i, Math.tan(i));
		}
		return map;
	}
}