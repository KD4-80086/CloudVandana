package com.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check if the input strings are anagrams
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }

        // Close the scanner
        sc.close();
    }
	
	public static boolean isAnagram(String str1, String str2) {
		char charStr1[] = str1.toCharArray();
		char charStr2[] = str2.toCharArray();
		
		if(charStr1.length != charStr2.length) {
			return false;
		}
		
		Arrays.sort(charStr1);
		Arrays.sort(charStr2);

	     return Arrays.equals(charStr1, charStr2);
	}

}
