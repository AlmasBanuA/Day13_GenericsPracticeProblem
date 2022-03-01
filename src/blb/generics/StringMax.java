package blb.generics;

/*
 * Given 3 Strings finding the maximum
 */
public class StringMax {

	public static void main(String[] args) {
		System.out.println("Welcome to the Test Maximum program");

		String string1 = "Apple";
		String string2 = "Peach";
		String string3 = "Banana";

		if (string1.compareTo(string2) == 1 && string1.compareTo(string3) == 1) {
			System.out.println("First string is maximum and string is : " + string1);

		} else if (string2.compareTo(string1) == 1 && string2.compareTo(string3) == 1) {
			System.out.println("Second string is maximum and string is : " + string2);

		} else {
			System.out.println("Third string is maximum and string is : " + string3);
		}

	}

}
