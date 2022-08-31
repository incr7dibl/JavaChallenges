package function_and_arrays;

import java.util.Scanner;

/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any_base_to_any_base/topic
1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.
*/
public class Any_Base_to_Any_Base {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		System.out.println("Enter a base of number " + n);
		int sourceBase = scn.nextInt();
		System.out.println("Enter a base into which you want " + n + " to be converted");
		int destBase = scn.nextInt();
		System.err.println(n + " of base " + sourceBase + " = " + convertToDestBase(n, sourceBase, destBase)
				+ " of base " + destBase);
	}

	private static int convertToDestBase(int n, int sourceBase, int destBase) {
		int remainder, multiplier = 1;
		int result = 0;
		while (n > 0) {
			remainder = n % destBase;
			n = n / destBase;
			result = result + remainder * multiplier;
			multiplier = multiplier * sourceBase;
		}

		return result;
	}
}
