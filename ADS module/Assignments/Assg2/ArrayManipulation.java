package org.logicbuilding;

import java.util.Scanner;

public class ArrayManipulation {

    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 1];
        
        for (int[] query : queries) {
            int start = query[0] - 1; 
            int end = query[1];       
            int value = query[2];     
            
            arr[start] += value;       
            if (end < n) {
                arr[end] -= value;     
            }
        }
        
        long max = 0, sum = 0;
        for (long val : arr) {
            sum += val;
            if (sum > max) {
                max = sum;
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        System.out.println("Enter Queries rows");
        
        int q = sc.nextInt();
        
        int[][] queries = new int[q][3];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
        }
        
        System.out.println(arrayManipulation(n, queries));
        
        sc.close();
    }
}

