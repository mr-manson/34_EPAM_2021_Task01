package com.epam.learn.tasks0102;

public class Logic {
	public static int mounthLeapYear(int mounth, int year) {
		if (mounth < 1 || mounth > 12) {
			System.out.println("������ � ����� ������� �� ����������");
		} else if (mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 8 || mounth == 10
				|| mounth == 12) {
			switch (mounth) {
			case 1:
				System.out.println("������ " + year + " ���� - 31 ����");
				break;
			case 3:
				System.out.println("���� " + year + " ���� - 31 ����");
				break;
			case 5:
				System.out.println("��� " + year + " ���� - 31 ����");
				break;
			case 7:
				System.out.println("���� " + year + " ���� - 31 ����");
				break;
			case 8:
				System.out.println("������ " + year + " ���� - 31 ����");
				break;
			case 10:
				System.out.println("������� " + year + " ���� - 31 ����");
				break;
			case 12:
				System.out.println("������� " + year + " ���� - 31 ����");
				break;
			}
		} else if (mounth == 2) {
			if (year % 4 == 0) {
				System.out.println("������� " + year + " ���� - 29 ����");
			} else if (year % 4 != 0) {
				System.out.println("������� " + year + " ���� - 28 ����");
			}
		} else if (mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) {
			switch (mounth) {
			case 4:
				System.out.println("������ " + year + " ���� - 30 ����");
				break;
			case 6:
				System.out.println("���� " + year + " ���� - 30 ����");
				break;
			case 9:
				System.out.println("�������� " + year + " ���� - 30 ����");
				break;
			case 11:
				System.out.println("������ " + year + " ���� - 30 ����");
				break;
			}
		}
		return mounth;
		/*
		 * System.out.println("������� ���������� ����� ����� " + a); return a; }
		 * 
		 * public static double lastDigit(double a) { a = a % 10;
		 * System.out.println("��������� ����� �������� ���������� ����� - " + a);
		 * return a;
		 * 
		 * }
		 */

	}
}
