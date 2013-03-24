package au.edu.uq.csse2002.week4;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be positive");
		}
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
		return radius * 2;
	}

	public double getArea() {
		return PI * pow(radius, 2);
	}

	public double getCircumference() {
		return PI * getDiameter();
	}
}
