package src;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import src.pic.Pic;

public class Player extends Object {

	public enum face {
		UP, DOWN, LEFT, RIGHT;
	}
	
	int currentRoomId;
	String name;
	BufferedImage image;

	public boolean pUP;
	public boolean pDOWN;
	public boolean pRIGHT;
	public boolean pLEFT;
	public boolean space;
	public static Bullet bullet;
	public face f = null;
	

	public Player(String name) {
		this.name = name;
		x = 300;
		y = 300;
		height = 100;
		width = 100;
		speed = 10;
		image = imageLoad("turtle.png");
	}





	public void physic() {
		if (pUP) {
			f = Player.face.UP;
			up();
		}
		if (pDOWN) {
			f = Player.face.DOWN;
			down();
		}
		if (pLEFT) {
			f = Player.face.LEFT;
			left();
		}
		if (pRIGHT) {
			f = Player.face.RIGHT;
			right();
		}
		if (space && bullet == null) {
		 bullet = new Bullet(this, getX(), getY(), 20, 20);
		} 
		if (bullet != null){
			bullet.shoot();	
		}
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public void draw(Graphics g) {
		g.drawString(name, x, y-10);
		g.drawImage(image, x, y, width,height, null);
		if (bullet != null){
			bullet.draw(g);
		}
	}

}
