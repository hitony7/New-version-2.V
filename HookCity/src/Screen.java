import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Screen extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;

	public static boolean runGame = true;

	public static Frame frame;
	public Thread thread = new Thread(this);
	public static int myWidth, myHeight;
	
	public static boolean first = true;
	
	public static Image wall;
	public static Image background;
	public Player player ;


	public Screen(Frame frame) {
		frame.addKeyListener(new KeyMove(this));
		frame.setSize(new Dimension(frame.getWidth(), frame.getHeight()));
		myWidth = this.getWidth();
		myHeight = this.getHeight();
		define();
		thread.start();
		
		}
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());//Clears
		player.draw(g);
	}

	public void define() {
		
		player = new Player("Jason Tran");
		System.out.println(player);
			
		background = new ImageIcon("C:\\Users\\398256004\\brown.jpg").getImage();

		wall = new ImageIcon("C:\\Users\\398256004\\Brick_white_wall.jpg").getImage();

	}
	


	public void run() {
		// Runs game loop
		while (true) {
			if (first) {
				first = false;
				System.out.println("false");
				} else if (runGame) {
					player.physic();
					repaint();
				
				}
			try {
				thread.sleep(1000/60);// 1000/60 = 60fps
			} catch (Exception e) {
				
			}

		}

	}

}
