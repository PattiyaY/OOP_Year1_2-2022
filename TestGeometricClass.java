package AbstractExample;

public class TestGeometricClass {

	public static void main(String[] args) {
		GeometricObject geoObj1 = new Circle();
		((Circle) geoObj1).setRadius(2.5);
		System.out.println((Circle) geoObj1);
		Rectangle rectObj1 = new Rectangle(2,3);
		System.out.println(rectObj1);
		
		GeometricObject[] objList = {new Circle(2),new Rectangle(2,5)};
		System.out.println("There are "+objList.length+" objects here!");
		for (GeometricObject objElement: objList) {
			printArea(objElement);
		}
	}

	public static void printArea(GeometricObject obj) {
		System.out.println("The area is " + obj.getArea());
	}
	

}
