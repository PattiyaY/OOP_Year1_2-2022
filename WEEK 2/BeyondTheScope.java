package Example;

public class BeyondTheScope {

	public static void main(String[] args) {
		short positiveShort = 32767; 
		positiveShort++; 
		System.out.println(positiveShort); 
		short negativeShort = -32768; 
		negativeShort--; 
		System.out.println(negativeShort);

	}

}
