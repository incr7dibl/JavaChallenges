package function_and_arrays;

import java.util.Scanner;

//Problem link:- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/digit_frequency/topic
//1. You are given a number n.
//2. You are given a digit d.
//3. You are required to calculate the frequency of digit d in number n.

public class DigitFrequency {
	public static void main(String[] args) {
		System.out.println("Enter a mnumber");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter a digit to find out its frequency in " + n);
		int d = sc.nextInt();
		sc.close();
		int counter = 0;
		while (n != 0) {
			if (n % 10 == d) {
				counter++;
			}
			n /= 10;
		}
		System.out.println("Number " + d + " occured " + counter + " times");
	}
}
