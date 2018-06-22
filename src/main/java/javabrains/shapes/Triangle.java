package javabrains.shapes;

import java.util.List;

public class Triangle {
	private Style style;
	private List<Point> points;

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

}
