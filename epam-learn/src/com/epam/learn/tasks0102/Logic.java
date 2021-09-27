package com.epam.learn.tasks0102;

public class Logic {
	public static int mounthLeapYear(int mounth, int year) {
		if (mounth < 1 || mounth > 12) {
			System.out.println("ћес€ца с таким номером не существует");
		} else if (mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 8 || mounth == 10
				|| mounth == 12) {
			switch (mounth) {
			case 1:
				System.out.println("январь " + year + " года - 31 день");
				break;
			case 3:
				System.out.println("ћарт " + year + " года - 31 день");
				break;
			case 5:
				System.out.println("ћай " + year + " года - 31 день");
				break;
			case 7:
				System.out.println("»юль " + year + " года - 31 день");
				break;
			case 8:
				System.out.println("јвгуст " + year + " года - 31 день");
				break;
			case 10:
				System.out.println("ќкт€брь " + year + " года - 31 день");
				break;
			case 12:
				System.out.println("ƒекабрь " + year + " года - 31 день");
				break;
			}
		} else if (mounth == 2) {
			if (year % 4 == 0) {
				System.out.println("‘евраль " + year + " года - 29 дней");
			} else if (year % 4 != 0) {
				System.out.println("‘евраль " + year + " года - 28 дней");
			}
		} else if (mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) {
			switch (mounth) {
			case 4:
				System.out.println("јпрель " + year + " года - 30 дней");
				break;
			case 6:
				System.out.println("»юнь " + year + " года - 30 дней");
				break;
			case 9:
				System.out.println("—ент€брь " + year + " года - 30 дней");
				break;
			case 11:
				System.out.println("Ќо€брь " + year + " года - 30 дней");
				break;
			}
		}
		return mounth;
		/*
		 * System.out.println(" вадрат введенного числа равен " + a); return a; }
		 * 
		 * public static double lastDigit(double a) { a = a % 10;
		 * System.out.println("ѕоследн€€ цифра квадрата введенного числа - " + a);
		 * return a;
		 * 
		 * }
		 */

	}
}
