package com.hackerrank.interview.warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class CountingValleys {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Solution.countingValleys(steps, path);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
	 

}

class Solution {
	/*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    	
    	int seaLevel=0, valleyStarted=0, NoOfValley=0;
    	
    	// Write your code here
    	char[] chars = path.toCharArray();
    	for(int i=0; i < steps; i++) {
			if(chars[i] == 85) { // U
			    ++seaLevel;
			    
    		}else if(chars[i] == 68) { // D
    			--seaLevel;
    		}
			
			if(seaLevel < 0) {  // Valley Started
				++valleyStarted;
			}
			
			if( seaLevel == 0 && valleyStarted > 0) { // check if valley completed
				valleyStarted = 0;
				++NoOfValley;
			}
    	}
    	
    	System.out.println("Valley Count : "+ NoOfValley);
    	
    	return NoOfValley;
    }
}
