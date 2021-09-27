package com.epam.learn.tasks0102;

public class LeapYear {

	public static void main(String[] args) {
		int a = 0, b = 0;
		System.out.println("Âגוהטעו םמלונ לוסÿצא (מע 1 המ 12)");
		a = Input.inputByUser();
		System.out.println("Âגוהטעו דמה ג פמנלאעו דדדד");
		b = Input.inputByUser();
		Logic.mounthLeapYear(a, b);
		//Logic.lastDigit(b);
	}

}
