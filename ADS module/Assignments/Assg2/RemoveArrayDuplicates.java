package org.logicbuilding;

/*2. Remove Array Duplicates
Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the array.

Test Cases:

Input: arr = [1, 1, 2]
Output: 2
Input: arr = [0, 0, 1, 1, 2, 2, 3, 3]
Output: 4
*/

import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayDuplicates {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sized of Array");
		
		int n = sc.nextInt();
		
		System.out.println("Enter number of Elements");
		
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Element"+ arr[i]+":");
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		
		Arrays.sort(arr);
				
		int repeatedCount = 0;
		
		for (int i=0; i<n; i++) {
			int count = 0;
			for(int j=0; j<n; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if (count>=2) {
				repeatedCount++;
			}
		}
		
		System.out.println();
		
		System.out.println("Output: "+repeatedCount);
		
	}
}
