package exam2012s1.q1b;

public class Q1B {
	public static void main(String[] args) {
		Foo foo = new Bar(1);
		System.out.print(foo.getY());
		foo.add(2);
		Bar bar = (Bar) foo;
		System.out.print(" " + bar.getZ());
		bar.add(1);
		System.out.print(" " + bar.getZ());
	}
}
