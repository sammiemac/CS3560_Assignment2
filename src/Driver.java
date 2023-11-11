import javax.swing.*;
import java.awt.event.*;

public class Driver {
	
	private static JFrame window;

	public static void main(String[] args) {
		
		window = new JFrame("MiniTwitter");
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//objects -> panel -> window
		
		JPanel panel = new JPanel();
		
		window.add(panel);
		window.setSize(1080, 720);
		window.setVisible(true);

	}

}
