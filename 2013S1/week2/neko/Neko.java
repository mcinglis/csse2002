package au.edu.uq.csse2002.week2.practical;

/** An animation of Neko the Cat. */
public class Neko {

	public static void main(String[] args) {
		NekoFrame frame = new NekoFrame(Integer.parseInt(args[0]));
		frame.setVisible(true);
		frame.nekoRun();
	}

}
