package au.edu.uq.csse2002.week4;

public class Location {
	private final int x, y;

	public static Location of(int x, int y) {
		return new Location(x, y);
	}

	private Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int x() {
		return x;
	}

	public int y() {
		return y;
	}
}
