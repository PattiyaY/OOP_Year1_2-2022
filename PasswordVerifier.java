package Assignment;

import java.util.Scanner;

public class PasswordVerifier {
	
	public static boolean isPasswordValid(String password) {
		int len;
		boolean upper_check, digit_check, symbol_check;
		len = password.length();
		upper_check = false;
		digit_check =  false;
		symbol_check =  false;
		
		if (len >= 8) {
			for(int i = 0; i < len; i++) {
				char chr = password.charAt(i);
				if(Character.isUpperCase(chr)) {
					upper_check = true;
				} 
				if (Character.isDigit(chr)) {
					digit_check = true;
				}
				if (password.contains("_") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("/") || password.contains("&")) {
				    symbol_check = true;
				} 
			}
			return (upper_check && digit_check && symbol_check);
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

//Test if the password is valid
//H0la-9500&
//Jone@500$
//Ton&089789#

//12-45-78
//9T2 89I 5
//Hello_World
