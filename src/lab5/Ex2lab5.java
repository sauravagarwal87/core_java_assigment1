package lab5;

import java.util.Scanner;

class InvalidNameException extends Exception {
}

class Ex3lab6 {
	public static void main(String args[]) {
		// System.out.println("hiii");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name ");
		String name = s.next();
		try {
			for (int i = 0; i < name.length(); i++) {
				int ch = (int) name.charAt(i);
				if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				} else {
					throw new InvalidNameException();
				}
			}
			System.out.println("Employee Name is :" + name);
		} catch (InvalidNameException e) {
			System.out.println("Invalid user Name ");
		}
	}
}