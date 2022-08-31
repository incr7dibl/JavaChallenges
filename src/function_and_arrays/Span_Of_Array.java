package function_and_arrays;
/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span_of_an_array/topic
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
*/

import java.util.Scanner;

public class Span_Of_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter values for array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = findMax(arr);
		int min = findMin(arr);
		System.out.println("Span of Array is " + (max - min));
		sc.close();
	}

	private static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		return min;
	}

	private static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		return max;
	}
}
