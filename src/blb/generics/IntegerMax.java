package blb.generics;

/*
 * Given 3 Integers finding the maximum number
 */
public class IntegerMax {

	public static void main(String[] args) {
		System.out.println("Welcome to the Test Maximum program");
		Integer num1 = 5;
		Integer num2 = 2;
		Integer num3 = 8;
		
		if (num1.compareTo(num2) == 1 && num1.compareTo(num3) == 1) {
			System.out.println("First number is maximum and number is : " + num1);
			
		} else if (num2.compareTo(num1) == 1 && num2.compareTo(num3) == 1) {
			System.out.println("Second number is maximum and number is : " + num2);
			
		} else {
			System.out.println("Third number is maximum and number is : " + num3);
		}

	}

}
