package Homework2;

public class Tetrahedron extends ThreeDimentionalShape {

	private float diagonalEdge;

	public Tetrahedron(float length, float width, float diagonalEdge) {
		super();
		setLength(length);
		setWidth(width);
		this.diagonalEdge = diagonalEdge;
	}

	@Override
	float getArea() {
		// TODO Auto-generated method stub
		return super.getArea();
	}

	@Override
	public float getVolumn() {
		// TODO Auto-generated method stub

		double M = Math.pow(getWidth(), 4)
				* (2 * Math.pow(diagonalEdge, 2) + 2 * Math.pow(getLength(), 2) - 2 * Math.pow(getWidth(), 2));
		double N = Math.pow(diagonalEdge, 4)
				* (2 * Math.pow(getWidth(), 2) + 2 * Math.pow(getLength(), 2) - 2 * Math.pow(diagonalEdge, 2));
		double P = Math.pow(getLength(), 4)
				* (2 * Math.pow(getWidth(), 2) + 2 * Math.pow(diagonalEdge, 2) - 2 * Math.pow(getLength(), 2));
		double Q = 4 * Math.pow(getLength() * getWidth() * diagonalEdge, 2);
		return (float) (1 / 12 * Math.sqrt((M + N + P + Q)));
	}

	public float getDiagonalEdge() {
		return diagonalEdge;
	}

	public void setDiagonalEdge(float diagonalEdge) {
		this.diagonalEdge = diagonalEdge;
	}

}
