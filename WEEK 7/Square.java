package inheritanceExample;

public class Square extends GeometricObject{
	private int side;
	
	public Square() {
	}
	
	public Square(int side) {
		this.side = side;
	}
	
	public Square(int side, String color, boolean filled) {
		super(color,filled);
		this.side = side;
	}
	
	public int getArea() {
		return side * side;
	}
	
	public int getPerimeter() {
		return 4 * side;
	}
	
	public String toString() {
		return "The square is " + super.toString() + "\nIts area is " + getArea() 
				+ " Its perimeter is " + getPerimeter() + "\n"; 
	}
}
