package Example;
import java.util.Scanner;

public class GettingString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hello Again! Who are you: ");
		String Name = scan.nextLine();
		System.out.print("Ok, " + Name + " Nice to meet you!");
		scan.close();
		
	}

}
