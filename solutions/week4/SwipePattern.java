package au.edu.uq.csse2002.week4;

// I chose to implement this class to help communicate concepts.

public class SwipePattern {

	// immutable!
	private final String pattern;

	// We define a static factory method to construct a pattern from a string.
	// This helps readability, but there's a stronger reason to do it. It's
	// virtually always a great idea to only provide static factory methods for
	// immutable classes (and hide your constructors). I'll explain more in
	// detail later on in the semester, but the short story is that static
	// factory methods don't *have* to return a new object (= more memory
	// usage), whereas constructors do. So, if we pass the same string into
	// this method twice, we have the liberty of only creating one object and
	// returning it both times (which is fine, because it's immutable).
	public static SwipePattern fromString(String pattern) {
		// In this implementation, we're just delegating to the
		// constructor anyway, so nothing is effectively different.
		// We'll still be allocating new memory every time fromString is
		// called. However, the important point is that it can be changed
		// later. We can change our implementation of how our Patterns are
		// created and client code won't break; clients won't even know!
		if (isValid(pattern)) {
			return new SwipePattern(pattern);
		} else {
			return null;
		}
	}
	// see the bottom of the class for example code

	// Our constructor is private so clients must call the factory method
	private SwipePattern(String pattern) {
		this.pattern = pattern.toUpperCase();
	}

	// We also define a static validator method to make life much easier for
	// clients of this class. Note: we don't have to call this "isValidString",
	// thanks to Java's overriding ability. We can easily define another method
	// later on with the type "public static boolean isValid(Doohicky x)" to
	// validate Doohickies, and it would coexist happily with this.
	public static boolean isValid(String pattern) {
		// This method is far and away the hardest to implement. I would
		// probably approach it by defining a "T9Keyboard" class to work out
		// e.g. what's "up" from 5, and go from there.
		return true;
	}

	// Earlier problem: I didn't actually override the equals method, because
	// I defined the equals method with the signature of:
	//    public boolean equals(Pattern other)
	// Because the argument is different to the equals method as defined in
	// the Object superclass, it didn't override Object's equals().

	// We can use the @Override annotation to check if the method we're
	// writing actually overrides a method in a superclass. If not (e.g.,
	// if the argument types are different), then our program won't compile.

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof SwipePattern)) {
			return false;
		}
		return ((SwipePattern) obj).pattern.equals(pattern);
	}

	// Earlier problem: I overrode equals, but not hashCode.

	@Override
	public int hashCode() {
		// Equality is defined in terms of the underlying string, so we
		// can simply use the string's hash code for our hash code (which
		// will guarantee that equal patterns have equal hash codes).
		return pattern.hashCode();
	}

	/* Example code:

	String patternCode = "3DDLU";
	if (Pattern.isValid(patternCode)) {
		Pattern p = Pattern.fromString(patternCode);
		if (p.equals(this.pattern)) {
			unlock();
		}
	}

	 */
}
