package function_and_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/reverse_an_array/topic
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.
*/
public class Reverse_An_Array {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[a];
		System.out.println("Enter array numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

		Reverse_An_Array(arr);
		for (int i : arr) {
			System.out.print(i);
		}
	}

	private static int[] Reverse_An_Array(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		return arr;

	}
}
