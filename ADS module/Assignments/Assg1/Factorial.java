package org.ADSassig1;

/*3. Factorial
Problem: Write a Java program to compute the factorial of a given number.
Test Cases:

Input: 5
Output: 120
Input: 0
Output: 1
*/

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);  
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value");
		int num = sc.nextInt();
		
		int result = factorial(num);  
		
		System.out.println("Output: " + result);
	}
}
