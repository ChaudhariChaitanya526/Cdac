package org.logicbuilding;

/*3. Remove White Spaces from String
Problem: Write a Java program to remove all white spaces from a given string.

Test Cases:

Input: "Hello World"
Output: "HelloWorld"
Input: "  Java   Programming  "
Output: "JavaProgramming"
*/

import java.util.Scanner;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		
		String str = sc.nextLine();
		
		String result = str.replaceAll(" ", "");
		
		System.out.println(result);
		
	}
}
