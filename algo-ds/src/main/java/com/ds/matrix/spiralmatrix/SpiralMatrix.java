package com.ds.matrix.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20} };
		List<Integer> resArr = getSpiralMatrix(arr);
		System.out.println(resArr);
	}
	
	
	static List<Integer> getSpiralMatrix(int[][] arr){
		List<Integer> spiralList = new ArrayList<>();
		int rowFirst = 0;
		int rowLast = arr.length-1;
		int colFirst = 0;
		int colLast = arr[0].length-1;
		
		while(rowFirst < rowLast && colFirst < colLast) {
			
			for(int i = colFirst; i <= colLast; i++) {
				spiralList.add(arr[rowFirst][i]);
			}
			for(int j = rowFirst+1; j <= rowLast; j++) {
				spiralList.add(arr[j][colLast]);
			}
			for(int k = colLast-1; k >= colFirst; k-- ) {
				spiralList.add(arr[rowLast][k]);
			}
			for(int l = rowLast-1; l > rowFirst; l--) {
				spiralList.add(arr[l][colFirst]);
			}
			rowFirst++;
			colFirst++;
			rowLast--;
			colLast--;
		}
		return spiralList;
	}
}
