package org.ADSassig1;

import java.util.Scanner;

public class nonRepeatedChar {
	
	public static Character findFirstNonRepeated(String str) {
        int[] count = new int[256];  
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return str.charAt(i);  
            }
        }
        
        return null;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = sc.nextLine();

        Character result = findFirstNonRepeated(input);

        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }

        sc.close(); 
    }

}
