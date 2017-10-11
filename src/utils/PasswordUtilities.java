package utils;

public class PasswordUtilities {
	
	
	public static boolean verifyPassword(String userPassword) {
		// 
		//  begin edits and immediately return password as invalid if an edit fails
		//
		//
		// length check - should add length as a parm in future versions for flexibility
		// max length as well as minimum length
		//
		boolean badLength = checkLength(userPassword);
		if(badLength) {
			return false;
		}
		//
		// contents check - should add digits and char counts as parms?
		// if bad contents are present passwod failure back
		//
		
		boolean invalidContents = parsePassword(userPassword);
		if(invalidContents) {
			return false;
		}
		//
		// we have passed all the edits - return true back to the main method of user response
		//
		return true;
		
		
	}
	//
	// length edit - will make hard coded 10 a variable in next version
	//
	static boolean checkLength(String userPassword) {
		if (userPassword.length() < 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// 
	// parse traverses the password. it sends back a true for edit failure if an invalid character if found
	// otherwisw increments digit and character counts.
	// call another method to test the validity of the char and digit rules
	
	static boolean parsePassword(String userPassword) {
		int digitCount = 0;
		int charCount = 0;
		char[] ch=userPassword.toCharArray();
		for(char c: ch) {
			if(!Character.isLetter(c) && !Character.isDigit(c)) {
				return true;
			}
			if(Character.isDigit(c)) {
				digitCount++;
			}
			if(Character.isLetter(c)) {
				charCount++;
			}
			
		}
		boolean invalidCounts = checkCounts(digitCount, charCount);
		if(invalidCounts) {
			return true;
		}
		else {
			return false;
		}

	}
	
	//
	// the final test for an invalid condition
	//
	public static boolean checkCounts(int digitCount, int charCount) {
		if(digitCount >= 2 && charCount >=1) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
