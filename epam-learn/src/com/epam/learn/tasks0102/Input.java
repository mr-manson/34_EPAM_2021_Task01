package com.epam.learn.tasks0102;

import java.util.Scanner;

public class Input {

	public static int inputByUser() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			s.nextInt();
		}
		int a = s.nextInt();
		//s.close();
		return a;
	}

}
