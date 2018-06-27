package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Majesty=new Robot();
	Majesty.setSpeed(100);
	Majesty.penDown();
	for (int i = 0; i <4 ; i++) {
		Majesty.move(90);
		Majesty.turn(90);
	}
	
	
	}
}
