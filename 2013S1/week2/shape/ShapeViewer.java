package au.edu.uq.csse2002.week1.practical;

public class ShapeViewer {

	/**
	 * Generate and draw a shape
	 * @param args The arguments for the program
	 */
	public static void main(String[] args) {
		final int NUM = 20;
		
		// Hopefully  the user will pass something that can be parsed as an Integer.
//		final int NUM = Integer.parseInt(args[0]);
		
		final int WIDTH = 392;
		final int HEIGHT = 600;
		//int[] x = {195,300,250,150,100};
		//int[] y = {50,135,250,220,100};
		int[] x = new int[NUM];
		int[] y = new int[NUM];
		
		// Generate the coordinates
		for (int i=0; i < x.length; i++) {
			x[i] = WIDTH / 2;
			y[i] = HEIGHT / 2;
		}
		
		Shape.create();
		
		// Move the coordinates in random directions
		while (true) {
			int[] xDir = new int[NUM];
			int[] yDir = new int[NUM];
			//Generating the directions in which each coordinate will move
			for (int i=0; i < x.length; i++) {
				xDir[i] = (int) (3*Math.random()) -1;
				yDir[i] = (int) (3*Math.random()) -1;
			}
			for (int t=0; t < 100; t++) {
				Delay.milliseconds(100);
				for (int i = 0; i < x.length; i++) {
					if (x[i] == 0 && xDir[i]==-1) {
						xDir[i] = 1;
					}
					if (x[i] == WIDTH && xDir[i]==1) {
						xDir[i] = -1;
					}
					if (y[i] == 0 && yDir[i]==-1) {
						yDir[i] = 1;
					}
					if (y[i] == HEIGHT && yDir[i]==1) {
						yDir[i] = -1;
					}
					x[i] += xDir[i];
					y[i] += yDir[i];
				}
				
				Shape.draw(x,y);
			}
			
		}

	}

}
