package com.epam.learn.tasks0101;

public class Logic {
	public static double powerTwo(double a) {
		a *= a;
		System.out.println("������� ���������� ����� ����� " + a);
		return a;
	}

	public static double lastDigit(double a) {
		a = a % 10;
		System.out.println("��������� ����� �������� ���������� ����� - " + a);
		return a;
	}

}
