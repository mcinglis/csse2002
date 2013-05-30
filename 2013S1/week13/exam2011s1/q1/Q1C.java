package exam2011s1.q1;

public class Q1C {
	public static void main(String[] args) {
		Object o = new A();
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		a1.report(a2);
		a1.report(b);
		a1.report(o);
		a2.report(a2);
	}
}

class A {
	public void report(Object o) {
		System.out.println("Object");
	}
	public void report(A a) {
		System.out.println("A");
	}
}

class B extends A {
	public void report(A a) {
		System.out.println("A again");
	}
	public void report(B b) {
		System.out.println("B");
	}
}
