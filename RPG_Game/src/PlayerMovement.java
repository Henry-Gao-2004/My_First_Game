import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayerMovement implements ActionListener {
	Player player;
	private JButton up;
	private JButton down;
	private JButton left;
	private JButton right;
	public PlayerMovement(Launcher launcher) {
		this.player=launcher.player;
		up=launcher.up;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(up))
			player.up();
		
	}

}
