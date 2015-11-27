package src;
import javax.swing.JLabel;
public class Object extends JLabel{ 
	int x;
	int y;
	int height;
	int width;
	int speed;
	
public void right(){
	this.x = this.x + this.speed;
}
public void left(){
	this.x = this.x - this.speed;
}
public void down(){
	this.y = this.y + this.speed;
}
public void up(){
	this.y = this.y - this.speed;
}

public String toString(){
		return  "Current x,y:" + x + "," + y + " | Current height,width: " + height +"," + width;
	}

}

