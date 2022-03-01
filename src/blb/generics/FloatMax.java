package blb.generics;

/*
 * Given 3 Floats finding the maximum
 */
public class FloatMax {

	public static void main(String[] args) {
		System.out.println("Welcome to the Test Maximum program");
		
		Float num1 = 5.3f;
		Float num2 = 2.2f;
		Float num3 = 8.4f;
		
		if (num1.compareTo(num2) == 1 && num1.compareTo(num3) == 1) {
			System.out.println("First number is maximum and number is : " + num1);
			
		} else if (num2.compareTo(num1) == 1 && num2.compareTo(num3) == 1) {
			System.out.println("Second number is maximum and number is : " + num2);
			
		} else {
			System.out.println("Third number is maximum and number is : " + num3);
		}

	}

}