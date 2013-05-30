package exam2012s1.q1b;

public class Foo {

	protected int y = 0;

	public Foo(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void add(int n) {
		for (int i = 0; i < n; i++) {
			inc();
		}
	}

	public void inc() {
		y++;
	}

}