package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static	Robot rob = new Robot() ;
	public static void main(String[] args) {
		String x =	JOptionPane.showInputDialog("What shape do you want circle, triangle, or square.");
		String y = JOptionPane.showInputDialog("What color red, green, or blue?");
		
		rob.hide();
		rob.penDown();

		rob.setSpeed(60);
		
		if (y.equals("red")) {
			rob.setPenColor(Color.red);
		}
		if (y.equals("green")) {
			rob.setPenColor(Color.green);
		}
		if (y.equals("blue")) {
			rob.setPenColor(Color.blue);
			
		}
		if (x.equals("square")) {
			drawSquare();
		}
		if (x.equals("triangle")) {
			drawTriangle();
		}
		if (x.equals("circle")) {
			drawCircle();
		}
	}


	static void drawSquare() {
		for (int i = 0; i < 4; i ++) {
			rob.move(80);
			rob.turn(90);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i ++) {
			rob.move(80);
			rob.turn(120); 
		}
	}
	static void drawCircle() {
		for( int i = 0; i < 45; i ++) {
			rob.move(10);
			rob.turn(10);
		}
	}
}


