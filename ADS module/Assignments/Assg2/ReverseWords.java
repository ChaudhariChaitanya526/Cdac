package org.logicbuilding;

import java.util.Scanner;

/*6. Reverse Words in a String
Problem: Write a Java program to reverse the words in a given sentence.

Test Cases:

Input: "Hello World"
Output: "World Hello"
Input: "Java Programming"
Output: "Programming Java"
*/

public class ReverseWords {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentence");
		
		String str = sc.nextLine();
		
		String[] word = str.split(" ");
		
		int start = 0, end = word.length-1;
		while (start < end) {
			String temp = word[start];
			word[start] = word[end];
			word[end] = temp;
			
			start++;
			end--;
		}
		
		String reversewords = String.join(" ", word);
		
		System.out.println("Output: "+reversewords); 
		
		sc.close();
	}

}
