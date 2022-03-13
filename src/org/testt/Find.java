package org.testt;

public class Find {
	public void count(String input) {
		String upperCase = "";
		String lowerCase = "";
		String number = "";
		String specialChar = "";
		for (int i = 0; i < input.length(); i++) {
			
		 
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				upperCase = upperCase + c;
			} else if (Character.isLowerCase(c)) {

				lowerCase = lowerCase + c;
			} else if (Character.isDigit(c)) {

				number = number + c;
			} else {

				specialChar = specialChar + c;
			}}
		System.out.println("UR INPUT "+input);
			System.out.println("Upper case " + upperCase);
			System.out.println("Lower case " + lowerCase);
			System.out.println("Number " + number);
			System.out.println("Special character " + specialChar);
		

	}

	public static void main(String[] args) {
		Find f = new Find();
		
		f.count("DEEPACKlal2080$$$$$$$$$");
		
	}
}
