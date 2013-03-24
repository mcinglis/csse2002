package au.edu.uq.csse2002.week4;

public class Student {

	private int creditHours;

	/*
	 * This is what the book wants you to write, but this code shouldn't be
	 * acceptable for professional development.
	 */
	public int pay() {
		if (0 <= creditHours && creditHours < 4) {
			return 500;
		} else if (4 <= creditHours && creditHours < 7) {
			return 750;
		} else if (7 <= creditHours && creditHours < 10) {
			return 1000;
		} else if (10 <= creditHours) {
			return 1250;
		} else {
			return 0;
		}
	}
}
