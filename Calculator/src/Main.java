/**
 * @author Anthony Garzon
 * 
 * */

//Basic calculator program for fun :)

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int x, y;
		
		Scanner input = new Scanner(System.in);//Creating a scanner object
		System.out.print("Enter first and second number: ");//asking user for input
		x=input.nextInt();//setting x as the first user input
		y=input.nextInt();//setting y as the second user input
		//telling user what number is for which operation
		System.out.print("Choose Operation Where 1 is Add, 2 is subtract, 3 is multiply, 4 is divide: ");
        int chooseOperation;
        chooseOperation = input.nextInt();
        switch(chooseOperation){
        case 1: //case 1 is for adding
        	System.out.println(add(x,y));
        	break;
        case 2: //case2 is for subtracting
        	System.out.println(subtract(x,y));
        	break;
        case 3: //case3 is for multiplying
        	System.out.println(multiply(x,y));
        	break;
        case 4: //case4 is for dividing
        	System.out.println(divide(x,y));
        	break;
        	default://checks just to make sure you don't enter an incorrect number that it doesn't recognize
        		System.out.println("Illegal Operation");
        }//switch statement that helps to easily identify witch operation you want to do
	}//main method

	private static int add(int x, int y) {
		return x+y;
	}//method that adds x and y
	
	private static int subtract(int x, int y){
		return x-y;
	}//method that subtracts x and y
	
	private static int multiply(int x, int y){
		return x*y;
	}//method that multiplies x and y
	
	private static int divide(int x, int y){
		
		if(y==0){
			System.err.println("Cannot divide by 0!");
		}
		
		return x/y;
	}//method that divides x and y and checks for the division by zero error
		
}//class