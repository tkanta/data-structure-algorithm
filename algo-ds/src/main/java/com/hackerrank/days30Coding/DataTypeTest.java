package com.hackerrank.days30Coding;

import java.util.Scanner;

public class DataTypeTest {
	
//	Input Format
//
//	The first line contains an integer that you must sum with .
//	The second line contains a double that you must sum with .
//	The third line contains a string that you must concatenate with .
	
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2 = Integer.parseInt(scan.nextLine());
        d2 = Double.parseDouble(scan.nextLine());
        s2 = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        i2 = i+i2;
        System.out.println(i2);
        /* Print the sum of the double variables on a new line. */
		d2 = d+d2;
        System.out.println(d2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        s2 = s+s2;
        System.out.println(s2);
        scan.close();
    }
}
