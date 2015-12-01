package src;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Bullet extends Object {
	private final Player player;
	public boolean inGame = false;
	BufferedImage image;
	int speed = 10;
	
	public Bullet(Player player, int x, int y, int height, int width) {
		this.player = player;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		image = imageLoad("Bullet.png");
		inGame = true;
	}
	
	public void shoot(){
		System.out.println(x);
		
		if (player.f == Player.face.LEFT)
			x -= speed;
		else if (player.f == Player.face.RIGHT)
			x += speed;
		 else if (player.f == Player.face.UP)
			 y -= speed;
		 else if (player.f == Player.face.DOWN)
			 y += speed;
		
		if (x < 0 || x > 1280 || y < 0 || y > 720)
			Player.bullet = null;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public void draw(Graphics g) {
		if(inGame){
			g.drawRect(x, y, width,height);
			g.drawImage(image, x, y, width, height, null);
		}
	
	}
}
