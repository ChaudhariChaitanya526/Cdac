package org.logicbuilding;


import java.util.Scanner;

public class ArrayLeftRotation {

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 
        
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter positions to rotate:");
        int d = sc.nextInt();
        
        rotateLeft(arr, d);
        
        System.out.println("After rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}
