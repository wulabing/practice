
public class RegularPolygon {
	private int n;
	private int side;
	private double x;
	private double y;

	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	public RegularPolygon(int n, int side) {
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}

	public RegularPolygon(int n, int side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public double getSide() {
		return side;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void SetN(int n) {
		this.n = n;
	}

	public void SetSide(int side) {
		this.side = side;
	}

	public void SetX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return n * side;
	}
	
	public double getArea(){
		return n*Math.pow(n*side, 2)/4*Math.tan(Math.PI/n);
	}
}
