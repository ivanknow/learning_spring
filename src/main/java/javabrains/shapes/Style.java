package javabrains.shapes;

public class Style {
	String color;
	String border_color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBorder_color() {
		return border_color;
	}

	public void setBorder_color(String border_color) {
		this.border_color = border_color;
	}

	@Override
	public String toString() {
		return "Style [color=" + color + ", border_color=" + border_color + "]";
	}
	
}
