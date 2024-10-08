package org.ADSassig1;

import java.util.Scanner;

public class LeapYear {
	
	public static boolean isLeapyear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return year % 400 == 0;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a year");
		
		int year = sc.nextInt();
		
		boolean result = isLeapyear(year);
		
		if (result) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
		
		sc.close();		
		
	}
	

}
