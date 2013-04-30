package au.edu.uq.csse2002.week4;

import static org.junit.Assert.*;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

import org.junit.Test;

import au.edu.uq.csse2002.week4.Circle;

public class CircleTest {

	@Test(expected = IllegalArgumentException.class)
	public void newCircle_NegativeRadius() {
		@SuppressWarnings("unused")
		Circle c = new Circle(-5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void newCircle_ZeroRadius() {
		@SuppressWarnings("unused")
		Circle c = new Circle(0);
	}

	@Test
	public void getRadius() {
		Circle c = new Circle(1);

		double result = c.getRadius();

		assertEquals(1, result, 0);
	}

	@Test
	public void getDiameter() {
		Circle c = new Circle(5);

		double result = c.getDiameter();

		assertEquals(10, result, 0);
	}

	@Test
	public void getArea() {
		Circle c = new Circle(5);

		double result = c.getArea();

		assertEquals(PI * pow(5, 2), result, 0);
	}

	@Test
	public void getCircumference() {
		Circle c = new Circle(10);
		
		double result = c.getCircumference();
		
		assertEquals(20 * PI, result, 0);
	}
}
