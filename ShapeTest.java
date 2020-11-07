package Homework2;

public class ShapeTest {
	public static void main(String[] args) {

		TwoDimentionalShape circle = new Circle(2);
		TwoDimentionalShape square = new Square(3);
		TwoDimentionalShape triangle = new Triangle(5, 6);
		ThreeDimentionalShape sphare = new Sphare(5);
		ThreeDimentionalShape cube= new Cube(8);
		ThreeDimentionalShape tetrahedron = new Tetrahedron(2,5,6);

		System.out.println("Diện tích" + circle.getArea());
		System.out.println("Diện tích" + square.getArea());
		System.out.println("Diện tích" + triangle.getArea());
		System.out.println("---------------------------");
		System.out.println("Diện tích "+ sphare.getArea()+ " Thể tích : "+sphare.getVolumn());
		System.out.println("Diện tích "+ cube.getArea()+ " Thể tích : "+cube.getVolumn());
		System.out.println("Diện tích "+ tetrahedron.getArea()+ " Thể tích : "+tetrahedron.getVolumn());
		
	}
}
