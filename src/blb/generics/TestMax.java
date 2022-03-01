package blb.generics;

/*
 * Extending this and use options and use sorting
 */
import java.util.Arrays;

public class TestMax {
	public static void main(String[] args) {
		Integer xInt = 5, yInt = 3, zInt = 2;
		Float xFlt = 3.4f, yFlt = 2.5f, zFlt = 8.3f;
		String xSt = "Apple", ySt = "Peach", zSt = "Banana";

		Integer[] arrI = { xInt, yInt, zInt };
		Float[] arrF = { xFlt, yFlt, zFlt };
		String[] arrS = { xSt, ySt, zSt };

		System.out.println("Before sorting Elements");
		printArray(arrI);
		printArray(arrF);
		printArray(arrS);

		/*
		 * sorting array
		 */
		Arrays.sort(arrI);
		Arrays.sort(arrF);
		Arrays.sort(arrS);

		printArraySort(arrI);
		printArraySort(arrF);
		printArraySort(arrS);

		System.out.println();
		testMaximum(xSt, ySt, zSt);
		testMaximum(xInt, yInt, zInt);
		testMaximum(xFlt, yFlt, zFlt);

	}

	private static <T> void printArraySort(T[] arr) {
		System.out.println("Sorted array[] is : " + Arrays.toString(arr));

	}

	/*
	 * Before sorting
	 */
	public static <T> void printArray(T[] arr) {
		Integer i;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/*
	 * Testing the maximum value
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

	/*
	 * Printing the maximum value
	 */
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("max of %s,%s and %s is %s\n", x, y, z, max);
	}

}
