package org.logicbuilding;

/*9. String Palindrome
Problem: Write a Java program to check if a given string is a palindrome.

Test Cases:

Input: "madam"
Output: true
Input: "hello"
Output: false
Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for each:
*/

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean ispalindrome(String str) {
		
		int start = 0;
		int end = str.length() -1;
		
		while(start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str = sc.nextLine();
		
		if (ispalindrome(str)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		sc.close();	
	}
}
