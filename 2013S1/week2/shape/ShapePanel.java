package au.edu.uq.csse2002.week1.practical;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

/** A panel for displaying a solid or hollow red polygon. 
 * @author Roger Duke (author of Java Genesis)
 * @author Graeme Smith
 * @version 1.0
 */
public class ShapePanel extends JPanel {

	// class variables
	// the polygon to display
	private static Polygon p = new Polygon();
	// whether the polygon is solid
	private static boolean filled = true;
	
	/** Display the polygon on a white background. 
	 * @param g The graphical context.
	 */ 
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		setBackground(Color.white);
		Random r = new Random();
		g.setColor(r.nextBoolean() ? Color.cyan : Color.green);
		if (filled) g.fillPolygon(p);
		else g.drawPolygon(p);
	}

	/** Draw a hollow red polygon. 
	 * @param vertices The vertices of the polygon.
	 */
	public void draw (PlanarPoint [] vertices) {
		setPoly(vertices);
		filled = false;
		repaint();
	}
  
	/** Draw a solid red polygon.
	 *  @param vertices The vertices of the polygon.
	 */
	public void fill (PlanarPoint [] vertices) {
		setPoly(vertices);
		filled = true;
		repaint();
	}
	
	/** Create a polygon.
	 * @param vertices The vertices of the polygon.
	 */
	private static void setPoly(PlanarPoint [] vertices) {
		p = new Polygon();
		 // the next vertex
		PlanarPoint gridPoint = new PlanarPoint();
		for (int i=0; i<vertices.length; i++) {
			gridPoint = vertices[i].rounded();
			p.addPoint((int)gridPoint.getX(), 
						(int)gridPoint.getY());
		}
	}
}