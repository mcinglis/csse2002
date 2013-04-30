package au.edu.uq.csse2002.week1.practical;

/** A point in the Cartesian plane. 
 * @author Roger Duke (author of Java Genesis)
 * @author Graeme Smith
 * @version 1.0
 */
public class PlanarPoint {
		
	// instance variables
	private double x;  // x-coordinate of the point
	private double y;  // y-coordinate of the point
	
	// constructors: the following two methods set the
	// values of the instance variables for a new object
	
	/** Create a new PlanarPoint. 
	 * @param a The x-coordinate.
	 * @param b The y-coordinate.
	 */
	public PlanarPoint(double a, double b) {
		x = a;
		y = b;
	}
	
	/** Create a new PlanarPoint representing the origin (0,0). */
	public PlanarPoint() {
		x = 0;
		y = 0;
	}

	// getters: the following two methods return the current
	// values of the instance variables of the receiver

	/** The x-coordinate of this PlanarPoint. */
	public double getX() {
		return x;
	}
	
	/** The y-coordinate of this PlanarPoint. */ 
	public double getY() {
		return y;
	}
	
	/** The result of adding this PlanarPoint to the point p;
	 *  this PlanarPoint itself is not modified.
	 *  @param p The PlanarPoint to add to this PlanarPoint.
	 */
	public PlanarPoint add(PlanarPoint p) {
		PlanarPoint result = new PlanarPoint(x + p.x, y + p.y);
		return result;
	}
	
	/** The nearest grid point to this PlanarPoint; 
	 *  this PlanarPoint itself is not modified.
	 */
	public PlanarPoint rounded() {
		PlanarPoint result = 
			new PlanarPoint(Math.round(x), Math.round(y));
		return result;
	}
	
	/* A string representation of this PlanarPoint. */
	public String toString() {
		return "("+x+", "+y+")";
	}
}