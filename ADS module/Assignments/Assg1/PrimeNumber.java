package org.ADSassig1;

/*2. Prime Number
Problem: Write a Java program to check if a given number is prime.

Test Cases:

Input: 29
Output: true
Input: 15
Output: false
*/

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrimeNum(int num){
		
		if(num <= 1){
			return false;
		}
		
		for (int i = 2; i < num; i++){
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		if (isPrimeNum(num)) {
			System.out.println("Output: true");
		} else {
			System.out.println("Output: false");
		}
		
	}

}
