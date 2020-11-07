package Homework2;

public abstract class Shape {
	private float width;
	private float length;
	
	
	
	public Shape() {
		super();
	}

	public Shape(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	abstract float getArea();

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}


}
