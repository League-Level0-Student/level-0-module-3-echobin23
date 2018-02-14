package extras;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		bob.penDown();
		bob.setSpeed(20);
		String color = JOptionPane.showInputDialog("what color do you want the shape to be");
		if(color.equalsIgnoreCase("BLUE")) {
			bob.setPenColor(Color.BLUE);
		}
		else if(color.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.RED);
		}
		else if(color.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.GREEN);
		}
		else {
			JOptionPane.showMessageDialog(null, color+ " not applicable");
		}
		String answer = JOptionPane.showInputDialog("What shape do you want");
		if(answer.equalsIgnoreCase("square")) {
			drawSquare();
		}
		else if(answer.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		else if(answer.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		else {
			JOptionPane.showMessageDialog(null, answer+ " not applicable");
		}
		
	}
	static Robot bob = new Robot();
	static void drawSquare() {
		for(int i=0 ;i< 4; i++) {
			bob.move(80);
			bob.turn(90);
		}
	}
	static void drawTriangle() {
		for(int i=0 ;i< 4; i++) {
		bob.move(90);
		bob.turn(60);
		}
	}
	static void drawCircle() {
		for(int i=0 ;i< 360; i++) {
		bob.move(1);
		bob.turn(1);
	}
	}
	
		}


