package au.edu.uq.csse2002.week1.practical;

/** Provides a method for delaying a program's execution.
 * @author Graeme Smith
 * @author Roger Duke (author of Java Genesis)
 * @version 1.0
 */
public class Delay {

	/** Delay a program's execution. 
	 * @param time Length of delay in milliseconds.
	 */
	public static void milliseconds(int time) {
		try {
			Thread.sleep(time);
		} catch(InterruptedException e) {}
	}
}