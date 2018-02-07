package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What shape do you want");
		if(answer.equals("square")) {
			drawSquare();
		}
		else if(answer.equals("triangle")) {
			drawTriangle();
		}
		else if(answer.equals("circle")) {
			drawCircle();
		}
		
	}
	static Robot bob = new Robot();
	static void drawSquare() {
		bob.penDown();
		bob.setSpeed(10);
		for(int i=0 ;i< 4; i++) {
			bob.move(80);
			bob.turn(90);
		}
	}
	static void drawTriangle() {
		for(int i=0 ;i< 3; i++) {
	bob.turn(40);
	bob.move(90);
		}
	}
	static void drawCircle() {
		for(int i=0 ;i< 360; i++) {
		bob.move(1);
		bob.turn(1);
	}
	}
	
		}


