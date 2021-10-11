package by.epamtc.nikalaichanka.task0102.mounth;

public enum Mounth {
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
	OCTOBER(31), NOVEMBER(30), DECEMBER(31);

	private int quantity;

	Mounth(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}
}
