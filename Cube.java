package Homework2;

public class Cube extends ThreeDimentionalShape {
	private float height;
	
	
	public Cube(float height) {
		super();
		this.height = height;
	}
	@Override
	float getArea() {
		// TODO Auto-generated method stub
		return (float) (6*Math.pow(height,2));
	}
	@Override
	public float getVolumn() {
		// TODO Auto-generated method stub
		return (float) Math.pow(height, 3);
	}
	
}
