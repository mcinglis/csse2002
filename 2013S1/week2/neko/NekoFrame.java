package au.edu.uq.csse2002.week2.practical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** A window for displaying the Neko the Cat animation. */
public class NekoFrame extends JFrame {

	// a panel for displaying the animation
	private NekoPanel panel;

	/** Create a new NekoFrame. */
	public NekoFrame(int speed) {
		panel = new NekoPanel(speed);
		setTitle("Neko the Cat");
		setBounds(100, 50, 440, 100);
		Container c = getContentPane();
		c.add(panel);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	/** Start the animation. */
	public void nekoRun() {
		panel.nekoRun();
	}
}
