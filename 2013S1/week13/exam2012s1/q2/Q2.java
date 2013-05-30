package exam2012s1.q2;

public class Q2 {

	/**
	 * Q2 (a)
	 * Significant problems with AcademicPeriod:
	 * - violates `equals()` contract; two equal objects are not guaranteed
	 *   to have the same hash code. 
	 * - no validation of `year` or `semester` values.
	 * - no invariant protection: i.e. `final` modifiers
	 * - no `@Override` annotations
	 */

	/**
	 * Q2 (c)
	 * Significant problems with AcademicTranscript:
	 * - use of implementation collection types rather than interfaces,
	 *   possibly forcing inefficiencies down the track.
	 * - `@assume` rather than `@ensure`
	 * 
	 */

	public static void main(String[] args) {
		AcademicPeriod ap = new AcademicPeriod(2012, 1);
		System.out.println(ap.equals(null));
	}
}