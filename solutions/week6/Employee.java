package au.edu.uq.csse2002.week6;

public class Employee {
	public static final int OVERTIME_THRESHOLD = 40;
	public static final double OVERTIME_MULTIPLIER = 1.5;

	/*
	 * In practice, never use floating-point values like float or double to
	 * represent or work with currency. They are only approximations of values,
	 * and the approximation errors may be magnified when multiplying.
	 * 
	 * More information: http://en.wikipedia.org/wiki/Floating_point
	 * 
	 * Rather, prefer BigDecimal for currency representation and manipulation.
	 */

	private int hours;
	private double rate;

	public Employee(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	/**
	 * Returns the appropriate payment of an Employee, given the hours worked in
	 * a single week.
	 * 
	 * @param hours
	 *            the hours the employee worked in a week
	 * @param rate
	 *            the pay rate of the employee
	 * @require 0 <= hours <= 168 && rate >= 0
	 * @ensure \result >= 0
	 * @return the amount the employee should be paid for a week's work
	 */
	public static double pay(int hours, int rate) {
		Employee e = new Employee(hours, rate);
		return e.pay();
	}

	public double pay() {
		return (hours * rate) + overtimePay();
	}

	// Convenience method for pay() -- returns the extra pay from t
	private double overtimePay() {
		if (hours <= OVERTIME_THRESHOLD) {
			return 0;
		} else {
			int overtimeHours = hours - OVERTIME_THRESHOLD;
			double overtimeRate = rate * (OVERTIME_MULTIPLIER - 1);
			return overtimeHours * overtimeRate;
		}
	}
}
