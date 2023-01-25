package Assignment;

import java.util.*;

public class ClassExercise07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Float> list= new ArrayList<Float>();
		System.out.print("Enter amount of number : ");
		int num = scan.nextInt();
		int i = 1;
		
		while(i <= num) {
			System.out.print("Enter number " + (i) + " : ");
			Float number = scan.nextFloat();
			list.add(number);
		i++;
		}
		
		Collections.sort(list);
		System.out.println("The elements are " + String.valueOf(list));
		System.out.println("The lowest number is " + list.get(0));
		Float sum = 0.0f;
		for(Float each:list) {
			sum += each;
		}
		System.out.println("The average number is " + sum/list.size());
		System.out.println("The highest number is " + list.get(list.size()-1));
		
		scan.close();
	}

}
