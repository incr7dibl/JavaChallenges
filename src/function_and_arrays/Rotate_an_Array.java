package function_and_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/rotate_an_array/topic
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to the left for negative values of k.
*/
public class Rotate_an_Array {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter size of array");
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		System.out.println("Enter numbers of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		System.out.println("\nEnter a number of times you want to rotate above array");
		int k = Integer.parseInt(bf.readLine());
		System.out.println("Original Array\n");
		for (int i : arr) {
			System.err.print(i);
		}
		rotateArray(n, arr, k);

		System.out.println("\nArray after rotating " + k + " times\n");
		for (int i : arr) {
			System.out.print(i);
		}

	}

	private static void rotateArray(int n, int[] arr, int k) {
		k = k % arr.length;
		if (k < 0) {
			k = k + arr.length;
		}
		reverseArray(0, arr.length - k - 1, arr);
		reverseArray(n - k, arr.length - 1, arr);
		reverseArray(0, arr.length - 1, arr);

	}

	private static void reverseArray(int i, int j, int[] arr) {
		int firstIndex = i, lastIndex = j, temp;
		while (firstIndex < lastIndex) {
			temp = arr[firstIndex];
			arr[firstIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
			firstIndex++;
			lastIndex--;
		}
	}
}
