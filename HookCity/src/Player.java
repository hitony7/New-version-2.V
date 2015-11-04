import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import pic.Pic;

public class Player extends Object {

	int currentRoomId;
	String name;
	BufferedImage image;

	public boolean pUP;
	public boolean pDOWN;
	public boolean pRIGHT;
	public boolean pLEFT;

	public Player(String name) {
		this.name = name;
		x = 300;
		y = 300;
		height = 100;
		width = 100;
		speed = 10;
		init();
	}

	

	private void init() {
		try {
			image = ImageIO.read(new File(Pic.class.getResource("turtle.png").getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}



	public void physic() {
		if (pUP) {
			up();
		}
		if (pDOWN) {
			down();
		}
		if (pLEFT) {
			left();
		}
		if (pRIGHT) {
			right();
		}
		
	}





	public void draw(Graphics g) {
		g.drawImage(image, x, y, width,height, null);
		g.drawString(name, x, y-10);
	}

}
