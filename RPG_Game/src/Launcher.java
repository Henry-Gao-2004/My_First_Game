import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Launcher {
	public static Player player;
	public static JButton up;
	public static JButton down;
	public static JButton left;
	public static JButton right;
	public static void main(String [] args) {
		JFrame jFrame =new JFrame();
		jFrame.setSize(500,500);
		jFrame.setTitle("RPG");
		jFrame.setLayout(null);
		
		player=new Player(jFrame);
		
		JFrame controlBar=new JFrame();
		controlBar.setLayout(null);
		controlBar.setTitle("Control Bar");
		controlBar.setSize(200,500);
		
		up=new JButton("up");
		up.setBounds(50,50,50,50);
		PlayerMovement playerMovement=new PlayerMovement(this);
		up.addActionListener(playerMovement);
		controlBar.add(up);
		
		jFrame.setVisible(true);
		controlBar.setVisible(true);
		
	}
}
