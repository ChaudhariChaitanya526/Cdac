package org.ADSassig1;

import java.util.Scanner;

public class Parlindrome {
	
	public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  
            reversed = reversed * 10 + digit; 
            num /= 10;  
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int input = sc.nextInt();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close(); 
    }

}
