import java.util.Scanner;
public class test {

	private static Scanner input;

	public static void main(String[] args) {
		final double R = 6371.01;
		input = new Scanner(System.in);
		System.out.println("hello world");
		double x1,x2,y1,y2;
		System.out.print("point1");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("point2");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		double d = R * Math.acos((Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		System.out.println("Distance is " + d + "km");

	}

}
