package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	Boolean CLICKED=false;
	String oldValue;
	String newValue;
	String operator;
	
	JFrame jf; // jf global aayi
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton;
	JButton threeButton,twoButton, oneButton,sixButton,zeroButton,resultButton;
	JButton dotButton;
	JButton plusButton;
	JButton substractButton;
	JButton divideButton;
	JButton multipleButton;
	JButton clearbutton;
	Calculator(){
		//FRAME//
		
		jf=new JFrame("nv_calc"); //Heading & window//
		jf.setLayout(null);
		jf.setSize(600, 600);//width&height of window\\
		jf.getContentPane().setBackground(Color.LIGHT_GRAY);
		jf.setLocation(300,150);//to move the frame anywhere of the screen//
		
		//RESULT SHOW AREA
		
		displayLabel=new JLabel();//for display values//
		displayLabel.setBounds(30, 50, 540, 40);//WIDTH,HEIGHT,MOVEMENT FROM TOP-TO-BOTTOM IN ONE SYNTAX//
		displayLabel.setBackground(Color.WHITE);//to give color//
		displayLabel.setOpaque(true);//set the opaque true for display color//
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.DARK_GRAY);
		jf.add(displayLabel);
		
		//BUTTONS//
		
		   
	 
		
		 // ImageIcon sevenIcon = new ImageIcon(getClass().getResource("/calc/images/seven.png"));
		//  Image resizedSevenImage = sevenIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		 // ImageIcon resizedSevenIcon = new ImageIcon(resizedSevenImage);
		  
	        sevenButton=new JButton("7");
	        sevenButton.setFont(new Font("Arial", Font.BOLD, 20));
			sevenButton.setBackground(Color.WHITE);
			sevenButton.setForeground(Color.DARK_GRAY);
		  //sevenButton = new JButton(resizedSevenIcon);
		  //sevenButton = new JButton(sevenIcon);
		  sevenButton.setBounds(30, 170, 70, 70);
		  sevenButton.addActionListener(this);
		  jf.add(sevenButton);
		
		
		  
	      eightButton=new JButton("8");
	      eightButton.setFont(new Font("Arial", Font.BOLD, 20));
	      eightButton.setBackground(Color.WHITE);
	      eightButton.setForeground(Color.DARK_GRAY);
	      eightButton.setBounds(150, 170, 70, 70);
	      eightButton.addActionListener(this);
	      jf.add(eightButton);
		
		
		 nineButton=new JButton("9");
		 nineButton.setFont(new Font("Arial", Font.BOLD, 20));
		 nineButton.setBackground(Color.WHITE);
		 nineButton.setForeground(Color.DARK_GRAY);
		 nineButton.setBounds(270, 170, 70, 70);
		 nineButton.addActionListener(this);
		 jf.add(nineButton);
		
		
		 fourButton=new JButton("4");
		 fourButton.setFont(new Font("Arial", Font.BOLD, 20));
		 fourButton.setBackground(Color.WHITE);
		 fourButton.setForeground(Color.DARK_GRAY);
		 fourButton.setBounds(30, 260, 70, 70);
		 fourButton.addActionListener(this);
		 jf.add(fourButton);
		
		
		 fiveButton=new JButton("5");
		 fiveButton.setFont(new Font("Arial", Font.BOLD, 20));
		 fiveButton.setBackground(Color.WHITE);
		 fiveButton.setForeground(Color.DARK_GRAY);
		 fiveButton.setBounds(150, 260, 70, 70);
		 fiveButton.addActionListener(this);
		 jf.add(fiveButton);
		

		 sixButton=new JButton("6");
		 sixButton.setFont(new Font("Arial", Font.BOLD, 20));
		 sixButton.setBackground(Color.WHITE);
		 sixButton.setForeground(Color.DARK_GRAY);
		 sixButton.setBounds(270, 260, 70, 70);
		 sixButton.addActionListener(this);
		 jf.add(sixButton);
		
		 
		 oneButton=new JButton("1");
		 oneButton.setFont(new Font("Arial", Font.BOLD, 20));
		 oneButton.setBackground(Color.WHITE);
		 oneButton.setForeground(Color.DARK_GRAY);
		 oneButton.setBounds(30, 350, 70, 70);
		 oneButton.addActionListener(this);
		 jf.add(oneButton);
		

		 twoButton=new JButton("2");
		 twoButton.setFont(new Font("Arial", Font.BOLD, 20));
		 twoButton.setBackground(Color.WHITE);
		 twoButton.setForeground(Color.DARK_GRAY);
		 twoButton.setBounds(150, 350, 70, 70);
		 twoButton.addActionListener(this);
		 jf.add(twoButton);

		
		 threeButton=new JButton("3");
		 threeButton.setFont(new Font("Arial", Font.BOLD, 20));
		 threeButton.setBackground(Color.WHITE);
		 threeButton.setForeground(Color.DARK_GRAY);
		 threeButton.setBounds(270, 350, 70, 70);
		 threeButton.addActionListener(this);
		 jf.add(threeButton);
		
		 dotButton=new JButton(".");
		 dotButton.setFont(new Font("Arial", Font.BOLD, 20));
		 dotButton.setBackground(Color.WHITE);
		 dotButton.setForeground(Color.DARK_GRAY);
		 dotButton.setBounds(30, 440, 70, 70);
		 dotButton.addActionListener(this);
		 jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
		zeroButton.setBackground(Color.WHITE);
		zeroButton.setForeground(Color.DARK_GRAY);
		zeroButton.setBounds(150, 440, 70, 70);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);

		resultButton=new JButton("=");
		resultButton.setFont(new Font("Arial", Font.BOLD, 20));
		resultButton.setBackground(Color.WHITE);
		resultButton.setForeground(Color.DARK_GRAY);
		resultButton.setBounds(270, 440, 70, 70);
		resultButton.addActionListener(this);
		jf.add(resultButton);
		
		//OPERATEORS BUTTON
		
		plusButton=new JButton("+");
		plusButton.setFont(new Font("Arial", Font.BOLD, 20));
		plusButton.setBackground(Color.WHITE);
		plusButton.setForeground(Color.DARK_GRAY);
		plusButton.setBounds(390, 170, 70, 70);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		substractButton=new JButton("-");
		substractButton.setFont(new Font("Arial", Font.BOLD, 20));
		substractButton.setBackground(Color.WHITE);
		substractButton.setForeground(Color.DARK_GRAY);
		substractButton.setBounds(390, 260, 70, 70);
		substractButton.addActionListener(this);
		jf.add(substractButton);
		
		multipleButton=new JButton("x");
		multipleButton.setFont(new Font("Arial", Font.BOLD, 20));
		multipleButton.setBackground(Color.WHITE);
		multipleButton.setForeground(Color.DARK_GRAY);
		multipleButton.setBounds(390, 350, 70, 70);
		multipleButton.addActionListener(this);
		jf.add(multipleButton);
		
		divideButton=new JButton("/");
		divideButton.setFont(new Font("Arial", Font.BOLD, 20));
		divideButton.setBackground(Color.WHITE);
		divideButton.setForeground(Color.DARK_GRAY);
		divideButton.setBounds(390, 440, 70, 70);
		divideButton.addActionListener(this);
		jf.add(divideButton);
		
		
		clearbutton=new JButton("clear");
		clearbutton.setFont(new Font("Arial", Font.BOLD, 10));
		clearbutton.setBackground(Color.WHITE);
		clearbutton.setForeground(Color.DARK_GRAY);
		clearbutton.setBounds(510, 440, 70, 30);
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
		
		jf.setVisible(true);//to visible the window\\
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CALCULTOR CLOSE CHEYUMBO PROGRAM RUN CHEYUNATH STOP CHEYAN USE CHEYUNATH//
		
	}
	public static void main(String[] args) {
		new Calculator()    ;     // Calculator S=new Calculator(); instead of this new calculator();//
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//action chythal avde ath avunudon check chynm,
		//so oru bg color koduth chech cheynm.
		
		//jf.getContentPane().setBackground(Color.red);
		// displayLabel.setText("7"); oru button mathre wrk avu...we want differ button
		if(e.getSource()==sevenButton) {
			if(CLICKED) {
				displayLabel.setText("7");
				CLICKED=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");}}
				
		else if(e.getSource()==eightButton) {
			if(CLICKED) {
				displayLabel.setText("8");
				CLICKED=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");}}
		else if(e.getSource()==nineButton) {
				if(CLICKED) {
					displayLabel.setText("9");
					CLICKED=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"9");}}
		else if(e.getSource()==sixButton) {
			if(CLICKED) {
				displayLabel.setText("6");
				CLICKED=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");}}
		else if(e.getSource()==fiveButton) {
			if(CLICKED) {
				displayLabel.setText("5");
				CLICKED=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");}}
		else if(e.getSource()==fourButton) {
		if(CLICKED) {
				displayLabel.setText("4");
			CLICKED=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"4");}}
	else if(e.getSource()==threeButton) {
		if(CLICKED) {
			displayLabel.setText("3");
			CLICKED=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"3");}}
	else if(e.getSource()==twoButton) {
		if(CLICKED) {
			displayLabel.setText("2");
			CLICKED=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"2");}}
	else if(e.getSource()==oneButton) {
		if(CLICKED) {
			displayLabel.setText("1");
			CLICKED=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"1");}}
	else if(e.getSource()==zeroButton) {
		if(CLICKED) {
			displayLabel.setText("0");
			CLICKED=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"0");}}
	else if(e.getSource()==dotButton) {
		if(CLICKED) {
			displayLabel.setText(".");
			CLICKED=false;
		}else {
		displayLabel.setText(displayLabel.getText()+".");
	}}
	else if(e.getSource()==resultButton) {
		
		newValue=displayLabel.getText();
		float oldValueF=Float.parseFloat(oldValue);
		float newValueF=Float.parseFloat(newValue);
		float result = 0;
		switch (operator) {
		case "+": 
			result=oldValueF + newValueF;
			break;
		
		
		case "-":
			result=oldValueF - newValueF;
			break;
	
		case "*":
			result=oldValueF *  newValueF;
			break;
		
		case "/":
			  if (newValueF == 0) {
	                displayLabel.setText("Error: Division by zero");
	                return;// Exit the method to prevent displaying the result
	            } else {
	                result = oldValueF / newValueF;
	            }
	            break;

		}
		displayLabel.setText(result +"");
		
	}
	
	else if(e.getSource()==plusButton) {
			CLICKED=true;
			oldValue=displayLabel.getText();
			operator = "+";
	}else if(e.getSource()==substractButton) {
		CLICKED=true;
		oldValue=displayLabel.getText();
		operator = "-";
	}else if(e.getSource()==multipleButton) {
		CLICKED=true;
		oldValue=displayLabel.getText();
		operator ="*";
	}else if(e.getSource()==divideButton) {
		CLICKED=true;
		oldValue=displayLabel.getText();
		operator ="/";
	}else if(e.getSource()==clearbutton){
		displayLabel.setText("");
		
	}else {
        displayLabel.setText("Error");
        return;
    }

}}
