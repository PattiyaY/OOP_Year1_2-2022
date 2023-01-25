package Example;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n : ");
		int n = scan.nextInt();
		
		for (int i = 1; i < n+1; i++) {
			for(int j = 1; j < n+1; j++) {
				if (j <= n - i) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scan.close();
	}
	
}
