package Homework2;

public class Sphare extends ThreeDimentionalShape {
	
	private float Radius;
	
	
	public Sphare(float radius) {
		super();
		Radius = radius;
	}
	@Override
	float getArea() {
		// TODO Auto-generated method stub
		return 4*PI*Radius*Radius;
	}
	@Override
	public float getVolumn() {
		// TODO Auto-generated method stub
		return (float) (4/3*PI*Math.pow(Radius,3));
	}
			
}
