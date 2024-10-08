package org.ADSassig1;
import java.util.Scanner;

public class RepeatedCharacters {

    public static void findRepeatedChars(String str) {
        int[] count = new int[256];  

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        System.out.print("Repeated characters: ");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.print((char) i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        findRepeatedChars(input);
    }
}
