package com.epam.learn.tasks0101;

import java.util.Scanner;

public class Input {

	public static double inputByUser() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextDouble()) {
			s.nextDouble();
		}
		double a = s.nextDouble();
		//s.close();
		return a;
	}

}
