package blb.generics;

/*
 * Refactoring all the 3 to One Generic Method and finding the maximum
 */
public class TestMax {
	public static void main(String[] args) {

		Integer xInt = 5, yInt = 3, zInt = 2;
		Float xFlt = 3.4f, yFlt = 2.5f, zFlt = 8.3f;
		String xSt = "Apple", ySt = "Peach", zSt = "Banana";

		/*
		 * calling methods for finding Maximum
		 */
		testMaximum(xSt, ySt, zSt);
		testMaximum(xInt, yInt, zInt);
		testMaximum(xFlt, yFlt, zFlt);
	}

	/*
	 * Generic method of Type Integer,Float,String for finding maximum of 3
	 */
	private static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max;
		if (x.compareTo(y) == 1 && x.compareTo(z) == 1) {
			max = x;
		} else if (y.compareTo(x) == 1 && y.compareTo(z) == 1) {
			max = y;
		} else {
			max = z;
		}
		printMax(x, y, z, max);

		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("max of %s,%s and %s is :- %s\n", x, y, z, max);
	}

}
