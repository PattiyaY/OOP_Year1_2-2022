package Exercise;

import java.util.Scanner;

public class FindAverageInArray {

	public static double averageNum(double[] arr) {
		double sum = 0;
		for(double each: arr)
			sum += each;
		return sum/arr.length;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many number(s)? : ");
		int n = scan.nextInt();
		
		double[] numList = new double[n];
		for (int i = 0; i < numList.length; i++) {
			System.out.println("Enter Number#" + (i+1) + ":");
			numList[i] = scan.nextDouble();
		}
		scan.close();
		System.out.printf("The Average of these number(s) is %f",averageNum(numList));
	}

}
