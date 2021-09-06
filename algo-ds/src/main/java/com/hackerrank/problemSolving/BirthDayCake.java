package com.hackerrank.problemSolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    	// Write your code here
    	//Find the Highest number
    	//Find the count of highest number
    	
    	Integer bigNum = candles.get(0);
    	int size = 0;
    	
    	for(int i =0; i < candles.size(); i++) {
    		
    		if( bigNum.intValue() < candles.get(i).intValue()) {
    			bigNum = candles.get(i);
    			size = 1;
    		}else if( bigNum.equals(candles.get(i)) ){
    			size++;
    		}
    	}
    	
    	return size;
    }

}


public class BirthDayCake {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("result.txt"));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
