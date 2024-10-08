package org.logicbuilding;

/*4. Reverse a String
Problem: Write a Java program to reverse a given string.

Test Cases:

Input: "hello"
Output: "olleh"
Input: "Java"
Output: "avaJ"
*/

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String str = sc.nextLine();
		
		String reversestr= "";
		
		for (int i=str.length()-1; i>-0;i--) {
			reversestr += str.charAt(i);
		}
		
		System.out.println("Output: "+reversestr);

		sc.close();
	}
	
}
