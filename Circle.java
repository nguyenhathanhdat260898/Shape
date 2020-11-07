package Homework2;

public class Circle extends TwoDimentionalShape {

	private float Radius;

	public Circle( float Radius) {
		setRadius(Radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	float getArea() {

		// TODO Auto-generated method stub
		return (float) (Math.pow(Radius, 2) * PI);
	}

	public float getRadius() {
		return Radius;
	}

	public void setRadius(float radius) {
		Radius = radius;
	}
}
