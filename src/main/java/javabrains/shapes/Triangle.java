package javabrains.shapes;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware{
	private Style style;
	private List<Point> points;
	private ApplicationContext context;

	public Triangle() {
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public void draw() {

		System.out.println(style);
		for (Point p : points) {
			System.out.println(p);
		}
	}

	public void setBeanName(String arg0) {
		System.out.println("Name is "+arg0);
		
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}

}
