package Homework2;

public class Square extends TwoDimentionalShape {
	
	
	
	public Square( float length) {
		super();
		setLength(length);
	}

	@Override
	float getArea() {
		// TODO Auto-generated method stub
		return (float) Math.pow(getLength(),2);
	}
}
