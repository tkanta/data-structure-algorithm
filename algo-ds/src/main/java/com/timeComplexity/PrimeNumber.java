package com.timeComplexity;

import java.time.Duration;
import java.time.Instant;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Instant start = Instant.now();
		System.out.println(findIsPrimeBySqrt(1000033));
		Instant end = Instant.now();
		System.out.println("Time elapsed : "+ Duration.between(start, end).toMillis());
	}
	
	
	@SuppressWarnings("unused")
	private static boolean findIsPrime(double num) {
		
		int i = 2;
		while (i <= num) {
			if(num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	private static boolean findIsPrimeBySqrt(double num) {
		
		int i = 2;
		while (i <= Math.sqrt(num)) {
			if(num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
}
