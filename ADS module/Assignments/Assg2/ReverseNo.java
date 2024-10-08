package org.logicbuilding;

/*7. Reverse a Number
Problem: Write a Java program to reverse a given number.

Test Cases:

Input: 12345
Output: 54321
Input: -9876
Output: -6789
*/

import java.util.Scanner;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int num = sc.nextInt();
		
		int n = num;
		
		int rem, rev= 0;
		
		while(n!=0) {
			rem = n%10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		System.out.println("Output");
		
		System.out.println(rev);
	}
}
