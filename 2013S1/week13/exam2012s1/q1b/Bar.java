package exam2012s1.q1b;

public class Bar extends Foo {

	private int z = 0;

	public Bar(int y) {
		super(y);
		this.z = 2 * y;
	}

	public int getZ() {
		return z;
	}

	public void add(int n) {
		super.add(n);
		super.add(n);
	}

	public void inc() {
		z = z + 2;
	}

}