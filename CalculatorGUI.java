/*
 * @author Anthony Garzon
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

@SuppressWarnings("serial")
public class CalculatorGUI extends JFrame{
	
	//First I declare some JButtons named zero one two three four five six seven eight nine clear and equals
	//which are similar to what you would see on a basic calculator. Then I also declare add subtract multiply and
	//divide. Then I make a text field for the numbers and results to show on. Finally a JPanel for the numbered buttons
	//the action taken and for the text field. The panel is so everything can be held and moved around neatly. I also
	//declare a first num second num result operations and answer for which I will explain more later when we get to it's 
	//use. 
	JButton zero, one, two, three, four, five, six, seven, eight, nine, clear, equals;	
	JButton add, subtract, multiply, divide;
	JTextField tf;
	JPanel numberButtonsPanel;
	JPanel actions;
	JPanel holdDisplay;
	double firstNum, secondNum, result;
	String operations,answer;
	
	//Initialize method that creates the GUI on start up
	public void initialize(){
	    //Creating the GUI and initializing new JButtons for the numbers and actions on the calculator
		//and initializing the JTextfield as well.
		//After I create all the buttons and the text field I then divide it all up into three JPanels and add them 
		//each to their own panel. I then add the panel on the frame and create and initialize an event listener for all
		//buttons. 
		this.setTitle("Calculator v1.0");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(1000,1000);
	    this.setResizable(false);
	    numberButtonsPanel = new JPanel(); 
        numberButtonsPanel.setLayout(new GridLayout(4,3));
        zero = new JButton("0");
        numberButtonsPanel.add(zero);
        one = new JButton("1");
	    numberButtonsPanel.add(one);
	    two = new JButton("2");
        numberButtonsPanel.add(two);
        three = new JButton("3");
        numberButtonsPanel.add(three);
        four = new JButton("4");
        numberButtonsPanel.add(four);
        five = new JButton("5");
        numberButtonsPanel.add(five);
        six = new JButton("6");
        numberButtonsPanel.add(six);
        seven = new JButton("7");
        numberButtonsPanel.add(seven);
        eight = new JButton("8");
        numberButtonsPanel.add(eight);
        nine = new JButton("9");
        numberButtonsPanel.add(nine);
        clear = new JButton("Clear");
        numberButtonsPanel.add(clear);
        equals = new JButton("=");
        numberButtonsPanel.add(equals);
        actions = new JPanel();
        actions.setLayout(new GridLayout(0,1));
        add = new JButton("+");
        actions.add(add);
        subtract = new JButton("-");
        actions.add(subtract);
        multiply = new JButton("*");
        actions.add(multiply);
        divide = new JButton("/");
        actions.add(divide);
        tf = new JTextField(20);
        tf.setEditable(false);
        holdDisplay = new JPanel();
        holdDisplay.setLayout(new GridLayout(0,1));
        holdDisplay.add(tf);
        this.add(holdDisplay, BorderLayout.NORTH);
        this.add(actions, BorderLayout.EAST);
	    this.add(numberButtonsPanel, BorderLayout.WEST);
	    this.pack();
	    this.setVisible(true);
	    EventListener el = new EventListener(this);
	    zero.addActionListener(el);
	    one.addActionListener(el);
	    two.addActionListener(el);
	    three.addActionListener(el);
	    four.addActionListener(el);
	    five.addActionListener(el);
	    six.addActionListener(el);
	    seven.addActionListener(el);
	    eight.addActionListener(el);
	    nine.addActionListener(el);
	    clear.addActionListener(el);
	    add.addActionListener(el);
	    multiply.addActionListener(el);
	    subtract.addActionListener(el);
	    divide.addActionListener(el);
	    equals.addActionListener(el);
	}//initialize method
	
}//GUI class that uses inheritance so it has the components to do what a JFrame can do 
