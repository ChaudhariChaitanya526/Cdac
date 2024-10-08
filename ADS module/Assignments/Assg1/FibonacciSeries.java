package org.ADSassig1;

import java.util.Scanner;

/*4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.

Test Cases:

Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]
*/


public class FibonacciSeries {

    public static int[] FibonacciSeries(int n) {
        int arr[] = new int[n];
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = a;
            int c = a + b;
            a = b;
            b = c;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        int[] fib = FibonacciSeries(n);

        System.out.print("Output: [");
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i]);
            if (i < fib.length - 1) {
                System.out.print(", ");  
            }
        }
        System.out.print("]");
    }
}
