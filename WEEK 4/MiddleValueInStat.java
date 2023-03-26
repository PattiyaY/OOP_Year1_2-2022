package Assignment;

import java.util.*;

public class MiddleValueInStat {

	public static double mean(double[] numList) {
		double sum = 0;
		for(double each: numList)
			sum += each;
		return sum/numList.length;
	}
	
	public static double mode(double[] numList) {
		 int len = numList.length;
		 double maxValue = 0;
		 int maxCount = 0;
		 int nextCount = 0;
		 
		 for(int i = 0; i < len; i++) {
			 nextCount = 0;
			 for(int j = 0; j < len; j++) {
				 if(numList[i] == numList[j]) {
					 nextCount++;
				 }
			 }
			 if(nextCount > maxCount) {
				 maxCount = nextCount;
				 maxValue = numList[i];
			 } 
		 }
		 return maxValue;		 
		}
	
	public static double median(double[] numList) {
		Arrays.sort(numList);
		int len = numList.length;
		if (len % 2 != 0) {
			return numList[len/2];
		} else {
			return (numList[(len/2)-1] + numList[len/2])/2;
		}

		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many number(s)?: ");
		int n = scan.nextInt();
		double[] numList = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Number#" + (i+1) + " : ");
			double num = scan.nextDouble();
			numList[i] = num;
		}
		scan.close();
		
		System.out.println("The mean is " + mean(numList));
		System.out.println("The mode is " + mode(numList));
		System.out.println("The median is " + median(numList));
	}

}    
 