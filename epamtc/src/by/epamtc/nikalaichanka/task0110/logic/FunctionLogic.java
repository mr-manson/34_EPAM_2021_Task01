package by.epamtc.nikalaichanka.task0110.logic;

public class FunctionLogic {
	
	public static double functionTangens(double a, double b, double h) {
		double f = 0;
		
		for (double i = a ; i <= b ; i += h) {
			f = Math.tan(i);
		}
		
		return f;
	}

}
