package au.edu.uq.csse2002.week4;

public class Student {

	private int creditHours;

	/*
	 * This is what the book wants you to write, but this code shouldn't be
	 * acceptable for professional development. "Magic values" (see
	 * EmployeeTest) should be eliminated where possible: here, we have magic
	 * values like "4" or "1250".
	 */

	public int fees() {
		int fees;
		if (creditHours < 4) {
			fees = 500;
		} else if (creditHours < 7) {
			fees = 750;
		} else if (creditHours < 10) {
			fees = 1000;
		} else {
			fees = 1250;
		}
		return fees;
	}

}
