package Example;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How old are you : ");
		short age = in.nextShort();
		String describe = (age>50)? "quite old": "still young";
		System.out.print("You are " + describe);
		in.close();
	}

}
