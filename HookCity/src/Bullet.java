package src;

import java.awt.Graphics;

public class Bullet extends Object {
	public boolean inGame = false;
	int speed = 10;
	
	public Bullet(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		inGame = true;
	}
	
	public void shoot(){
		x += speed;
		if (x > 700){
			Player.bullet = null;
		}
	}
	public void draw(Graphics g) {
		if(inGame){
			g.drawRect(x, y, width,height);
		}
	
	}
}
