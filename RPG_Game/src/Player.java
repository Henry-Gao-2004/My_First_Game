import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Player {
	JLabel self=new JLabel("player");
	public Player(JFrame mainFrame){
		self.setBounds(225,225,50,50);
		mainFrame.add(self);
	}
	
	public void up() {
		int y=self.getY();
		if (y>50)self.setBounds(self.getX(),y-50,50,50);
	}
}
