package au.edu.uq.csse2002.week1.practical;

/** A class for displaying a polygon.
 * @author Roger Duke (author of Java Genesis)
 * @author Graeme Smith
 * @version 1.0
 */
public class Shape {
	
	// class variable
	private static ShapeFrame window;
	
	/** Create an empty window in which a shape
	 *  can be drawn. 
	 */
	public static void create() {
		window = new ShapeFrame();
		window.setVisible(true);
	}
	
	/** Draw a solid red polygon whose vertices are
	 *  (x[0],y[0]),(x[1],y[1]), (x[2],y[2]), ... 
	 *  The argument arrays must be of the same length.
	 *  @param x The x-coordinates of the polygon's vertices.
	 *  @param y The y-coordinates of the polygon's vertices.
	 */
	public static void draw(int [] x, int [] y) {
		PlanarPoint [] vertices = new PlanarPoint [x.length];
		for (int i=0; i < x.length; i++) {
			vertices[i] = new PlanarPoint(x[i], y[i]);
		}
		window.fill(vertices);
	}
}