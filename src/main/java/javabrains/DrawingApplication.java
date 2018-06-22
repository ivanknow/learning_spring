package javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javabrains.shapes.Triangle;

public class DrawingApplication {
public static void main(String[] args) {
	//Triangle t = new Triangle();
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	Triangle t = (Triangle) context.getBean("triangle");
	
	t.draw();
}
}
