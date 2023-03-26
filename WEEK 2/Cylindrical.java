package Example;

import java.util.Scanner;

public class Cylindrical {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter the outer radius : ");
		double outer = Scan.nextDouble();
		System.out.print("Enter the inner radius : ");
		double inner = Scan.nextDouble();
		System.out.print("Enter the height : ");
		double height = Scan.nextDouble();
		
		double computeVolume = Math.PI*height*(Math.pow(outer, 2) - Math.pow(inner, 2));
		System.out.printf("The volume of this hollow cylinder is "+"%.2f",computeVolume);
		Scan.close();
	}

}
