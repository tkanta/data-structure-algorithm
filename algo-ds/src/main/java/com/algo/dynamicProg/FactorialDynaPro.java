package com.algo.dynamicProg;

import java.time.Duration;
import java.time.Instant;

/**
 * Hello world!
 *
 */
public class FactorialDynaPro 
{
    public static void main( String[] args )
    {
    	
    	Instant startR = Instant.now();
    	long resR = factorialRecur(65);	
    	Instant finishR = Instant.now();
    	System.out.println("factorialRecur : "+resR);	
    	System.out.println("Elapsed Time : "+Duration.between(startR, finishR).toNanos());
    	
    	System.out.println("-------------------------");
    	
    	Instant startD = Instant.now();
        long resD = factorialDyna(65);		
    	Instant finishD = Instant.now();
    	System.out.println("factorialDyna : "+resD);
    	System.out.println("Elapsed Time : "+Duration.between(startD, finishD).toNanos());
    	
        
    }
    
    
    public static long factorialDyna(int n) {
    	long[] dpFact = new long[n+1];
    	
    	dpFact[0] = 1;
    	for(int i = 1; i <= n ; i++ ) {
    		dpFact[i] = dpFact[i-1] * i;
    	}
    	
    	return dpFact[n];
    }
    
    public static long factorialRecur(long n) {
    	if(n == 1) {
    		return 1;
    	}
    	return  n * factorialRecur(n-1);  
    }
    
}
