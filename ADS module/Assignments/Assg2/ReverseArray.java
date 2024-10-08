package org.logicbuilding;

/*5. Reverse Array in Place
Problem: Write a Java program to reverse an array in place.

Test Cases:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Input: arr = [7, 8, 9]
Output: [9, 8, 7]
*/

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start = 0, end = n-1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println("Output");
		
		for (int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}
}
