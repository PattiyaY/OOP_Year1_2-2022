package Example;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight, height, BMI;
		System.out.print("Input your weight in KG : ");
		weight = scan.nextDouble();
		System.out.print("Input your height in CM : ");
		height = scan.nextDouble();
		
		if (height >= 33 && height <= 300) { //According to height average from 2 years old to highest people in the world
			BMI = (weight/Math.pow((height/100.00),2));
			if (BMI < 18.5) {
				System.out.printf("Your Body Mass Index is %.2f, You are Underweight.",BMI);
			} else if (BMI >= 18.5 && BMI < 25){
				System.out.printf("Your Body Mass Index is %.2f, You are normal.",BMI);
			} else if (BMI >= 25 && BMI < 30) {
				System.out.printf("Your Body Mass Index is %.2f, You are Overweight.",BMI);
			} else if (BMI >= 30) {
				System.out.printf("Your Body Mass Index is %.2f, You are Obese.",BMI);
			}
		} else {
			System.out.printf("Try again the height input might be wrong");
		}
		scan.close();
	}
	
}
