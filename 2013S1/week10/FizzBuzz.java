package au.edu.uq.csse2002.week10;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i += 1) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			if (!(i % 3 == 0) && !(i % 5 == 0)) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
