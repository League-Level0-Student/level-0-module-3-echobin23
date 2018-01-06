
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		Robot Bob = new Robot();
		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like?");
		//4. use an if/else statement to set the pen color that the user requested	
		Bob.setPenWidth(10);
		Bob.penDown();
if(color.equals("blue")) {
	Bob.setPenColor(Color.BLUE);
	Bob.move(100);
}

else if(color.equals("green")) {
	Bob.setPenColor(Color.GREEN);
	Bob.move(100);
}

else if(color.equals("red")) {
	Bob.setPenColor(Color.RED);
	Bob.move(100);
}

else {
	Bob.setRandomPenColor();
	Bob.move(100);
}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
}
