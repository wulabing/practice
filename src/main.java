
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon test = new RegularPolygon();
		double a = test.getPerimeter();
		double b = test.getArea();
		System.out.println("The Perimeter is " + a + " The Area is " + b);
		RegularPolygon test2 = new RegularPolygon(6, 4);
		System.out.println("The Perimeter is " + test2.getPerimeter() + " The Area is " + test2.getArea());
		RegularPolygon test3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("The Perimeter is " + test3.getPerimeter() + " The Area is " + test3.getArea());
		test3.SetN(15);
		System.out.println("The Perimeter is " + test3.getPerimeter() + " The Area is " + test3.getArea());
	}

}
