package by.epamtc.nikalaichanka.task0103.runner;

import by.epamtc.nikalaichanka.task00all.console.EnterFromConsole;
import by.epamtc.nikalaichanka.task0103.logic.CircleSquareLogic;

public class Runner {
	
	public static void main (String [] args) {
		double squareArea;
		double radiusInscribed;
		double inscribedSquareArea;
		double difference;
		
		System.out.println("Enter the area of the square");
		
		squareArea = EnterFromConsole.enterDoubleByUser();
		
		radiusInscribed = CircleSquareLogic.inscribedCircleRadius(squareArea);
		inscribedSquareArea =  CircleSquareLogic.inscribedSquareArea(radiusInscribed);
		System.out.println("Area of the inscribed square - " + inscribedSquareArea);
		
		difference = CircleSquareLogic.areaDifference(squareArea, inscribedSquareArea);
		System.out.println("Area Difference is - " + difference);
		
	}
}
