package javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import javabrains.shapes.Triangle;

public class DrawingApplication {
public static void main(String[] args) {
	//Triangle t = new Triangle();
	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
	Triangle t = (Triangle) factory.getBean("triangle");
	t.draw();
}
}
