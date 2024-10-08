package org.ADSassig1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepetedcharHash {
	
	public static Set<Character> repetedchar(String str) {
		
		Set<Character> seen = new HashSet<>();
		Set<Character> repeated = new HashSet<>();
		
		for(char c : str.toCharArray()) {
			if (!seen.add(c)) {
				repeated.add(c);
			}
		}
		return repeated;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string input");
		
		String str = sc.nextLine();
		
//		Set<Character> output = repetedchar(str);
		
		System.out.println(repetedchar(str));
		
		
	}

}
