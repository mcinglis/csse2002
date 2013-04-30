package au.edu.uq.csse2002.week3.practical;

public class ModulusCounterTests {

	public static void main(String[] args) {
		// Make a modulus counter out of each String parameter passed in
		// as program arguments (i.e. you have to put these in Run Config)
		for (String s : args) {
			testModulo(Integer.parseInt(s));
		}
	}

	static void testModulo(int modulo) {
		// As in ThreeWayLampTests, add "-ea" to VM Arguments in Run Config
		// to get asserts to actually work.

		ModulusCounter counter = new ModulusCounter(modulo);

		assert counter.getCount() == 0 : "Count doesn't start at 0";

		for (int i = 1; i < modulo; i++) {
			counter.increment();
			assert counter.getCount() == i : "Count isn't incremented";
		}

		counter.increment();
		assert counter.getCount() == 0 : "Count isn't reset at modulo";

		// Question: why can we simply use string concatenation (+) with our
		// counter?
		System.out.println("Asserts passed for " + counter);
	}
}
