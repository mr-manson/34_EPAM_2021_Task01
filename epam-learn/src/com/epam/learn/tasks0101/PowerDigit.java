package com.epam.learn.tasks0101;

public class PowerDigit {

	public static void main(String[] args) {
		double a = 0.0;
		System.out.println("������� �����");
		a = Input.inputByUser();
		double b = Logic.powerTwo(a);
		Logic.lastDigit(b);
	}

}
