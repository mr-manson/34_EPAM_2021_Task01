package com.epam.learn.tasks0102;

public class LeapYear {

	public static void main(String[] args) {
		int a = 0, b = 0;
		System.out.println("������� ����� ������ (�� 1 �� 12)");
		a = Input.inputByUser();
		System.out.println("������� ��� � ������� ����");
		b = Input.inputByUser();
		Logic.mounthLeapYear(a, b);
		//Logic.lastDigit(b);
	}

}
