package au.edu.uq.csse2002.week9;

// BTW: it's bad practice to put package-private top-level classes in the
// same file. I'm just doing it here so this file doesn't stop my project
// compiling (and I didn't want to make a file for each empty class).

class Transcript {}
class Grade {}
class Course {}

public class Student {

	// Suppose you have a complicated algorithm to work out a student's
	// grade. One approach that can sometimes help make an implementation
	// simpler and more readable is to abstract the algorithm into a private
	// helper class, and use an object of that class (which can hold
	// intermediary values as required) to perform the algorithm.

	// This solves the problem of having to deal with multiple related
	// local variables in a static method. It can get hard to break parts up
	// into methods without those methods having lots of parameters. With
	// an algorithm object, you can add methods that just depend on the
	// values of the instance variables of that object; no parameters needed.

	// It's also useful if you don't want to pollute a class with instance
	// variables and methods related to an algorithm, but only tangentially
	// related to that class.

	public static Grade grade(Transcript transcript) {
		return new GradeCalculator(transcript).getGrade();
	}

	// Only suppressing the error because this is a demonstration.
	@SuppressWarnings("unused")
	private static class GradeCalculator {
		private final Transcript transcript;
		private final Grade grade;
		private final int[] units;

		// The algorithm's constructor needn't take the same arguments as the
		// static method (e.g. you might like to extract certain things
		// from the Transcript object first), but in this situation it makes
		// sense to pass it straight through.
		GradeCalculator(Transcript t) {
			transcript = t;
			// assuming transcript won't change, we should cache the grade
			units = calcUnits();
			grade = calcGrade();
		}

		Grade getGrade() {
			// return grade as cached in the constructor
			return grade;
		}

		// We can add helper methods as required, and they can use instance
		// variables to hold the algorithm's intermediary values. No death
		// by a thousand parameters!

		// If helper methods depend on certain instance variables being
		// defined before they're executed, then you should specify that in
		// their contract.

		/**
		 * @require this.transcript != null
		 * @ensure \result != null
		 */
		private int[] calcUnits() {
			return null;
		}

		/**
		 * @require (this.transcript != null) && (this.units != null)
		 * @ensure \result != null
		 */
		private Grade calcGrade() {
			return null;
		}

	}

}
