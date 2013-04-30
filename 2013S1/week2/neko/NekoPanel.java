package au.edu.uq.csse2002.week2.practical;

import javax.swing.*;
import java.awt.*;

/** A panel for displaying the Neko the Cat animation. */
public class NekoPanel extends JPanel {

	// still images of Neko the Cat
	private Image[] nekoPics = new Image[9];
	// current image
	private Image currentImage = null;
	// x-position of the current image
	private int xPos;
	// y-position of the current image
	private int yPos = 30;

	// speed that neko moves across the screen
	private int speed;

	/** Create a new NekoPanel. */
	public NekoPanel(int speed) {
		this.speed = speed;
		setBackground(Color.white);
		// the image files
		String nekosrc[] = { "right1.gif", "right2.gif", "stop.gif",
				"yawn.gif", "scratch1.gif", "scratch2.gif", "sleep1.gif",
				"sleep2.gif", "awake.gif" };
		// toolkit to create image object from .gif file
		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < nekoPics.length; i++)
			nekoPics[i] = tk.getImage("neko/" + nekosrc[i]);
	}

	/** Display the current state of the animation. */
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawImage(currentImage, xPos, yPos, this);
	}

	/** Run the animation. */
	public void nekoRun() {
		moveIn(0, getWidth() / 2);
		scratch(10);
		moveIn(getWidth() / 2, getWidth() + 50);
	}

	/* Move Neko to the centre of the panel. */
	private void moveIn(int start, int end) {
		for (int i = start; i < end; i += 10) {
			xPos = i;
			// Swap images
			if (currentImage == nekoPics[0]) {
				currentImage = nekoPics[1];
				// Note from Malcolm: a student in my prac, John, shared this
				// technique with me to get Neko to hop. Thanks John! (I was
				// really making things more complicated than they needed to be)
				yPos = 20;
			} else {
				currentImage = nekoPics[0];
				yPos = 30;
			}
			repaint();
			pause(1500 / speed);
		}
	}

	private void scratch(int num) {
		for (int i = 0; i < num; i++) {
			currentImage = nekoPics[4];
			repaint();
			pause(150);
			currentImage = nekoPics[5];
			repaint();
			pause(150);
		}
		currentImage = nekoPics[0];
		repaint();
	}

	/* Wait for "time" milliseconds. */
	private void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}

}
