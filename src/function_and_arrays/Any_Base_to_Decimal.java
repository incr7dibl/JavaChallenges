package function_and_arrays;

import java.util.Scanner;

/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any_base_to_decimal/topic
	1. You are given a number n.
	2. You are given a base b. n is a number on base b.
	3. You are required to convert the number n into its corresponding value in decimal number system.
*/
public class Any_Base_to_Decimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		System.out.println("Enter a base of number");
		int b = scn.nextInt();
		int d = getValueIndecimal(n, b);
		System.out.println(d);
	}

	public static int getValueIndecimal(int n, int b) {
		int remainder, multiplier = 1;
		int result = 0;
		while (n > 0) {
			remainder = n % 10;
			n = n / 10;
			result = result + remainder * multiplier;
			multiplier = multiplier * b;
		}
		return result;
	}
}
