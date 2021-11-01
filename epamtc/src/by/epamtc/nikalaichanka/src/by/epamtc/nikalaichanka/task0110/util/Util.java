package by.epamtc.nikalaichanka.task0110.util;

import java.util.Map;

public class Util {

	public static void printSummaryTable(Map<Double, Double> map) {

		System.out.printf("%7s %10s", "x", "y");
		for (Map.Entry<Double, Double> e : map.entrySet()) {
			System.out.printf("\n%10f %10f", e.getKey(), e.getValue());
		}

	}

}
