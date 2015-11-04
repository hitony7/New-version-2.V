import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMove implements KeyListener {

	Screen screen;
	
	public KeyMove(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			screen.player.pUP = true;	
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			screen.player.pDOWN = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			screen.player.pRIGHT = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			screen.player.pLEFT = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			screen.player.pUP = false;	
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			screen.player.pDOWN = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			screen.player.pRIGHT = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			screen.player.pLEFT = false;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}