package function_and_arrays;

import java.util.Scanner;

/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/decimal_to_any_base/topic
1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.
*/
public class Decimal_to_any_Base {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter values");
		int n = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(getValueInBase(n, b));
		scn.close();
	}

	public static int getValueInBase(int n, int b) {
		int remainder, multiplier = 1;// multiplier set to 1 for reverse multiplication
		int result = 0;
		while (n > 0) {
			remainder = n % b; // collect remainder by diving by target base
			n = n / b; // divide by the target base
			result = result + remainder * multiplier;
			multiplier = multiplier * 10;// reverse multiplication factor
		}
		return result;

	}
}
