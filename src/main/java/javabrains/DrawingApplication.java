package javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javabrains.shapes.Style;
import javabrains.shapes.Triangle;

public class DrawingApplication {
public static void main(String[] args) {
	//Triangle t = new Triangle();
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	Triangle t = (Triangle) context.getBean("triangle");
	Triangle t2 = (Triangle) context.getBean("triangle");
	Style s = (Style) context.getBean("style");
	s.setColor("pink");
	t.draw();
	
	t2.getPoints().get(0).setX(100);
	
	t.draw();
	
	
}
}
