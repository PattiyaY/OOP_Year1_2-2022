package Exercise;

public class UserDefinedMethod {

	public static boolean isPositive(int number) {
		return number>=0;
	}
	
	//public static int isPositive(int number) {
	//	return number>=0;
	//}
	
	public static void main(String[] args) {
		if(isPositive(-10))
			System.out.println("It's a positive number");
		else
			System.out.println("It's not a positive number");
	}

}
