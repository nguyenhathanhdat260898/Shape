package Homework2;

public class Triangle extends TwoDimentionalShape{
	private float height;

	
	public Triangle(float length, float height) {
		super();
		setLength(length);
		this.height = height;
	}

	@Override
	float getArea() {
		// TODO Auto-generated method stub
		return (float) (0.5*getLength()*height);
	}
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
}
