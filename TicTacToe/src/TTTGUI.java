/*
 * @author Anthony Garzon
 */
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TTTGUI extends JFrame{
	
	JButton[] buttons;
	JPanel buttonPanel;

	public void load(){
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("TicTacToe v1.0");
		this.setSize(500, 500);
		this.setResizable(false);
		buttons = new JButton[9];
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,3));
		EventListener el = new EventListener(this);
		for(int i=0; i<buttons.length; i++){
			buttons[i] = new JButton();
			buttonPanel.add(buttons[i]);
			buttons[i].addActionListener(el);
		}
		this.add(buttonPanel);
		this.setVisible(true);

	}//load method that creates the board
	
}//tic tac toe GUI class that extends JFrame so it can use JFrame's methods
