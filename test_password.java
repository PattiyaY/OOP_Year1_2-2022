package Assignment;
import java.util.Scanner;

public class test_password {
	
	public static boolean isPasswordValid(String password) {
		int len;
		boolean upper_check, digit_check, symbol_check;
			len = password.length();
			upper_check = false;
			digit_check =  false;
			symbol_check =  false;
		String symbol = "_@#$/&";
		
		if (len >= 8) {
			for(int i = 0; i < len; i++) {
				char chr = password.charAt(i);
				if(Character.isUpperCase(chr)) {
					upper_check = true;
				} 
				if (Character.isDigit(chr)) {
					digit_check = true;
				}
				if (symbol.contains(Character.toString(chr))) {
					symbol_check = true;
				} else {
					symbol_check = false;
				}
			}
			if (upper_check && digit_check && symbol_check) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input password : ");
		String password = scan.nextLine();
		if (isPasswordValid(password)) {
			System.out.println("The password is valid ✅");
		} else {
			System.out.println("The password is invalid ❌");
		}
		scan.close();
	}
}

//H0la9500&
//Jone@500$
//Ton&089789#

 
//12345678
//9T2 89 5
//Hello_smile



//public static boolean isPasswordValid(String password) {
//	int len, upper_count, digit_count, symbol_count;
//		len = password.length();
//		upper_count = 0;
//		digit_count = 0;
//		symbol_count = 0;
//	String symbol = "_@#$/&";
//	
//	if (len >= 8) {
//		for(int i = 0; i < len; i++) {
//			char chr = password.charAt(i);
//			if(Character.isUpperCase(chr)) {
//				upper_count += 1;
//			}
//			if (Character.isDigit(chr)) {
//				digit_count += 1;
//			}
//			if (symbol.contains(Character.toString(chr))) {
//				symbol_count += 1;
//			}
//		}
//		if (upper_count >= 1 && digit_count >= 1 && symbol_count >= 1) {
//			return true;
//		}
//	}
//	return false;
//}
//
//public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	System.out.print("Input password : ");
//	String password = scan.nextLine();
//	if (isPasswordValid(password)) {
//		System.out.println("The password is valid ✅");
//	} else {
//		System.out.println("The password is invalid ❌");
//	}
//	scan.close();
//}
//}

//H0&la9500-
//Jone@500$
//Ton&089789#

//12345678
//9T2 89 5
//Hello_smile
