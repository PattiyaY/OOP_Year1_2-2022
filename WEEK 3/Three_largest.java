package Exercise;

public class Three_largest {

	public static int maxThree(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	
	public static void main(String[] args) {
		System.out.println("The largest value is " + maxThree(10,50,90));

	}

}
