/*
 * @author Anthony Garzon
 * */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This is the EventListener class where the action takes place when a button is clicked
public class EventListener implements ActionListener{
	
	//Instantiating a new CalculatorGUI object to be able to use variables from that class 
	CalculatorGUI cg = new CalculatorGUI();
	
	public EventListener(CalculatorGUI cg){
		this.cg = cg;
	}//EventListener constructor so cg class knows what to listen for
	
	//Heres where the action takes place. First I use setText and getText to set numbers o to 9 on screen when chosen.
	//Also clear just sets text on screen to blank when clicked. Now when user chooses add subtract multiply or divide
	//the firstnum variable from the cg class is set to get the text on the screen then we set it to that text and finally
	//we use operations to be equal to a string of the operation that is done. For the equals button, we have to see
	//what the second number was that was chosen so we set second number to getText as well just like we did for first
	//number. Now we use the operations variable from the cg class to see what operation was chosen after the first
	//number was clicked. Result is the actual operation that is done with first and second number and answer is just to
	//format the string then we finally pass answer into setText so the actual answer will be shown on the screen. 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(cg.zero)){
			cg.tf.setText(cg.tf.getText() + "0");	
		}else if(e.getSource().equals(cg.one)){
			cg.tf.setText(cg.tf.getText() + "1");
		}else if(e.getSource().equals(cg.two)){
			cg.tf.setText(cg.tf.getText() + "2");
		}else if(e.getSource().equals(cg.three)){
			cg.tf.setText(cg.tf.getText() + "3");
		}else if(e.getSource().equals(cg.four)){
			cg.tf.setText(cg.tf.getText() + "4");
		}else if(e.getSource().equals(cg.five)){
			cg.tf.setText(cg.tf.getText() + "5");
		}else if(e.getSource().equals(cg.six)){
			cg.tf.setText(cg.tf.getText() + "6");
		}else if(e.getSource().equals(cg.seven)){
			cg.tf.setText(cg.tf.getText() + "7");
		}else if(e.getSource().equals(cg.eight)){
			cg.tf.setText(cg.tf.getText() + "8");
		}else if(e.getSource().equals(cg.nine)){
			cg.tf.setText(cg.tf.getText() + "9");
		}else if(e.getSource().equals(cg.clear)){
			cg.tf.setText("");
		}else if(e.getSource().equals(cg.add)){
			cg.firstNum = Double.parseDouble(cg.tf.getText());
			cg.tf.setText("");
			cg.operations = "+";
		}else if(e.getSource().equals(cg.subtract)){
			cg.firstNum = Double.parseDouble(cg.tf.getText());
			cg.tf.setText("");
			cg.operations = "-";
		}else if(e.getSource().equals(cg.multiply)){
			cg.firstNum = Double.parseDouble(cg.tf.getText());
			cg.tf.setText("");
			cg.operations = "*";
		}else if(e.getSource().equals(cg.divide)){
			cg.firstNum = Double.parseDouble(cg.tf.getText());
			cg.tf.setText("");
			cg.operations = "/";
		}else if(e.getSource().equals(cg.equals)){
			cg.secondNum = Double.parseDouble(cg.tf.getText());
			if(cg.operations == "+"){
				cg.result = cg.firstNum + cg.secondNum;
				cg.answer = String.format("%.0f", cg.result);
				cg.tf.setText(cg.answer);
			}else if(cg.operations == "-"){
				cg.result = cg.firstNum - cg.secondNum;
				cg.answer = String.format("%.0f", cg.result);
				cg.tf.setText(cg.answer);
			}else if(cg.operations == "*"){
				cg.result = cg.firstNum * cg.secondNum;
				cg.answer = String.format("%.0f", cg.result);
				cg.tf.setText(cg.answer);
			}else if(cg.operations == "/"){
				try{
				cg.result = cg.firstNum / cg.secondNum;
				cg.answer = String.format("%.0f", cg.result);
				cg.tf.setText(cg.answer);
				}catch(ArithmeticException ax){
					System.err.println(ax);
				}
			}
		}
		
	}

}
