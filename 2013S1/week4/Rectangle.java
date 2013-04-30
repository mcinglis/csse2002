package au.edu.uq.csse2002.week4;

public class Rectangle {

	Location location;
	int height, width;

	public Rectangle(Location location, int height, int width) {
		this.location = location;
		this.height = height;
		this.width = width;
	}

	public boolean contains(Location other) {
		return other.x() >= location.x() &&
				other.x() <= location.x() + width &&
				other.y() >= location.y() &&
				other.y() <= location.y() + height;
	}

}
