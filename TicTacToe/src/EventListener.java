import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/* @author Anthony Garzon 
 * 
 */

public class EventListener implements ActionListener{
	
	TTTGUI tttgui = new TTTGUI();//instantiating tttgui 
	private String xoro = "";//Declaring a string xoro where it is later set as x or o 
	boolean firstMove = true;//starting with firstMove by declaring it variable to be true
	boolean nextMove = false;//nextMove is false because it must wait for first move to be done first
	
	public EventListener(TTTGUI tttgui){
		this.tttgui = tttgui;
	}//Constructor that passes tttgui as the source 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 
		//Checking who's turn it is by using booleans firstMove and nextMove where when the firtMove is made thats when we set x and when the
		//nextMove is made that when we set O
		for(int i=0; i<tttgui.buttons.length; i++){
			if(e.getSource().equals(tttgui.buttons[i])){
				if(firstMove){
					xoro = "X";
					tttgui.buttons[i].setText(xoro);
					tttgui.buttons[i].setEnabled(false);
					firstMove = false;//first move went
					nextMove = true;//now we set true for nextMove to go and set O
				}else if(nextMove){
					xoro = "O";
					tttgui.buttons[i].setText(xoro);
					tttgui.buttons[i].setEnabled(false);
					nextMove = false;//now that nextMove is done we go back to firstMove x 
					firstMove = true;//by setting firstMove to true
				}
			}
			
		}
		
		if(checkWin() == true){
			JOptionPane.showMessageDialog(null, xoro + " Wins!");
			int x = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
			if(x == JOptionPane.YES_OPTION){
				reset();
			}else if(x == JOptionPane.NO_OPTION || x == JOptionPane.CANCEL_OPTION){
				System.exit(0);
			}
		}//checking who wins and then checks if you want to play again or not
		
		if(isFull()){
			int y = JOptionPane.showConfirmDialog(null, "Tie! Play Again?");
			if(y == JOptionPane.YES_OPTION){
				reset();
			}else if(y == JOptionPane.NO_OPTION || y == JOptionPane.CANCEL_OPTION){
				System.exit(0);
			}	
		}//checking if board is full if it is then reset if you want or closes
		
	}//setting x and o for each button and also checking for win and if full 
	
	public boolean checkWin(){
		if((tttgui.buttons[0].getText().equals("X") && tttgui.buttons[1].getText().equals("X") && tttgui.buttons[2].getText().equals("X"))
				|| (tttgui.buttons[0].getText().equals("O") && tttgui.buttons[1].getText().equals("O") && tttgui.buttons[2].getText().equals("O"))) {
				return true;
			}
			else if((tttgui.buttons[3].getText().equals("X") && tttgui.buttons[4].getText().equals("X") && tttgui.buttons[5].getText().equals("X"))
				|| (tttgui.buttons[3].getText().equals("O") && tttgui.buttons[4].getText().equals("O") && tttgui.buttons[5].getText().equals("O"))){
				return true;
			}
			else if((tttgui.buttons[6].getText().equals("X") && tttgui.buttons[7].getText().equals("X") && tttgui.buttons[8].getText().equals("X"))
				|| (tttgui.buttons[6].getText().equals("O") && tttgui.buttons[7].getText().equals("O") && tttgui.buttons[8].getText().equals("O"))){
				return true;
			}
			
			else if((tttgui.buttons[0].getText().equals("X") && tttgui.buttons[3].getText().equals("X") && tttgui.buttons[6].getText().equals("X"))
				|| (tttgui.buttons[0].getText().equals("O") && tttgui.buttons[3].getText().equals("O") && tttgui.buttons[6].getText().equals("O"))){
				return true;
			}
			else if((tttgui.buttons[1].getText().equals("X") && tttgui.buttons[4].getText().equals("X") && tttgui.buttons[7].getText().equals("X"))
				|| (tttgui.buttons[1].getText().equals("O") && tttgui.buttons[4].getText().equals("O") && tttgui.buttons[7].getText().equals("O"))){
				return true;
			}
			else if((tttgui.buttons[2].getText().equals("X") && tttgui.buttons[5].getText().equals("X") && tttgui.buttons[8].getText().equals("X"))
				|| (tttgui.buttons[2].getText().equals("O") && tttgui.buttons[5].getText().equals("O") && tttgui.buttons[8].getText().equals("O"))){
				return true;
			}
			else if((tttgui.buttons[0].getText().equals("X") && tttgui.buttons[4].getText().equals("X") && tttgui.buttons[8].getText().equals("X"))
				|| (tttgui.buttons[0].getText().equals("O") && tttgui.buttons[4].getText().equals("O") && tttgui.buttons[8].getText().equals("O"))){
				return true;
			}
			else if((tttgui.buttons[2].getText().equals("X") && tttgui.buttons[4].getText().equals("X") && tttgui.buttons[6].getText().equals("X"))
				|| (tttgui.buttons[2].getText().equals("O") && tttgui.buttons[4].getText().equals("O") && tttgui.buttons[6].getText().equals("O"))){
				return true;
			}
			else{
				return false;
			}

	}//check win method that checks for horizontal vertical and diagonal wins and explicitly checking x and o's in each position
	
	public boolean isFull(){
		if(!tttgui.buttons[0].isEnabled() && !tttgui.buttons[1].isEnabled() && !tttgui.buttons[2].isEnabled() && !tttgui.buttons[3].isEnabled()
			&& !tttgui.buttons[4].isEnabled() && !tttgui.buttons[5].isEnabled() && !tttgui.buttons[6].isEnabled() && !tttgui.buttons[7].isEnabled()
			&& !tttgui.buttons[8].isEnabled()
		) return true;
		
		return false;
			
	}//checking if board is full by seeing if there is no winner by all buttons not being enabled 
	
	public void reset(){
		for(int i=0; i<tttgui.buttons.length; i++){
			tttgui.buttons[i].setText("");
			tttgui.buttons[i].setEnabled(true);
		}
	}//resets board by clearing all text and enabling all buttons again
	
}//EventListener class that uses the ActionListener interface 

