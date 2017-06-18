/**
 * @author Anthony Garzon
 * @description - Program that acts as a basic calculator but using JOptionPane for better user interaction
 */

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String input;//input string variable for first digit
		String input1;//input1 string variable for second digit
		String input2;//input2 string variable for the operations
        
		//JOptionPane that asks for first digit and doesn't go through unless a correct digit is given
		do{
			
			input = JOptionPane.showInputDialog("Input first number: ",null);
			
		}while(!input.matches("\\d*") || input.equalsIgnoreCase(""));
		
		//JOptionPane that asks for second digit and doesn't go through unless a correct digit is given
		do{
			
			input1 = JOptionPane.showInputDialog("Input second number: ",null);
			
		}while(!input1.matches("\\d*") || input.equalsIgnoreCase(""));
		
		//JOptionPane that asks for operations and doesn't go through unless a correct operation is given
		do{
			
			 input2 = JOptionPane.showInputDialog("Choose Operation Such As +, -, *, /: ",null);
			
			 if(input2.equalsIgnoreCase("+")){
				JOptionPane.showMessageDialog(null, "Result: " + add(Integer.parseInt(input),Integer.parseInt(input1)));
				break;
			}else if(input2.equalsIgnoreCase("-")){
				JOptionPane.showMessageDialog(null, "Result: " + subtract(Integer.parseInt(input),Integer.parseInt(input1)));
				break;
			}else if(input2.equalsIgnoreCase("*")){
				JOptionPane.showMessageDialog(null, "Result: " + multiply(Integer.parseInt(input),Integer.parseInt(input1)));
				break;
			}else if(input2.equalsIgnoreCase("/")){
				JOptionPane.showMessageDialog(null, "Result: " + divide(Integer.parseInt(input),Integer.parseInt(input1)));
				break;
			}
			 
		}while(!input2.contentEquals("+")|| !input2.contentEquals("-") || !input2.contentEquals("*") || !input2.contentEquals("/"));
		
	}//main method
	
	public static int add(int x, int y){
		return x+y;
	}//add method
	
	public static int subtract(int x, int y){
		return x-y;
	}//subtract method
	
	public static int multiply(int x, int y){
		return x*y;
	}//multiply method
	
	public static int divide(int x, int y){
		
		if(y==0){
			JOptionPane.showMessageDialog(null, "Cannot Divide By Zero!");
		}//checks for division by zero error
		
		return x/y;
	}//divide method

}//class main
