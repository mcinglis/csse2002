package au.edu.uq.csse2002.week4;

import static au.edu.uq.csse2002.week4.Employee.OVERTIME_THRESHOLD;
import static au.edu.uq.csse2002.week4.Employee.OVERTIME_MULTIPLIER;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	// Due to the approximate nature of doubles, we have to specify
	// a permissable error margin in our test results.
	private static double payErrorMargin = 0.00001;

	/*
	 * The tests written here are using the Given-When-Then structure I
	 * mentioned in class. Further than that, though, I've also gone to lengths
	 * to remove any "magic values":
	 * 
	 * http://www.naildrivin5.com/blog/2012/02/16/even-more-clean-tests-magic-values.html
	 */

	@Test
	public void pay_HoursLessThanOvertimeThreshold() {
		// Given
		int hours = (int) (Math.random() * OVERTIME_THRESHOLD);
		double rate = anyPositiveDouble();
		Employee employee = new Employee(hours, rate);

		// When
		double pay = employee.pay();

		// Then
		assertEquals(hours * rate, pay, payErrorMargin);
	}

	@Test
	public void pay_HoursEqualToOvertimeThreshold() {
		// Given
		int hours = OVERTIME_THRESHOLD;
		double rate = anyPositiveDouble();
		Employee employee = new Employee(hours, rate);

		// When
		double pay = employee.pay();

		// Then
		assertEquals(hours * rate, pay, payErrorMargin);
	}

	@Test
	public void pay_HoursMoreThanOvertimeThreshold() {
		// Given
		int hours = OVERTIME_THRESHOLD + (int) (Math.random() * 50);
		double rate = anyPositiveDouble();
		Employee employee = new Employee(hours, rate);

		// When
		double pay = employee.pay();

		// Then
		double expected = (OVERTIME_THRESHOLD * rate)
				+ ((hours - OVERTIME_THRESHOLD) * OVERTIME_MULTIPLIER * rate);
		assertEquals(expected, pay, payErrorMargin);
	}

	private double anyPositiveDouble() {
		return Math.random() * 100;
	}

}
