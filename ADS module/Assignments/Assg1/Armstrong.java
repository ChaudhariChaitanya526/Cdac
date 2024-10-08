package org.ADSassig1;

/*1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number.

Test Cases:

Input: 153
Output: true
Input: 123
Output: false
*/

import java.util.Scanner;

public class Armstrong {
	
	public static boolean isArmstrong(int val){
		int num = val;
		int sum = 0;
		int digits = String.valueOf(val).length();
		
		while(val > 0) {
			int digit = val % 10;
			sum += Math.pow(digit, digits);
			val/=10;
		}
		
		return sum == num;	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value:");
		
		int val = sc.nextInt();

		if (isArmstrong(val)) {
			System.out.println("Output: true");
		} else {
			System.out.println("Output: False");
		}
		
		sc.close();	
	}

}
