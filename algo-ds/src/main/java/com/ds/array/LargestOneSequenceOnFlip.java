package com.ds.array;

/**
 * Find longest sequence of 1's with one flip
 * @author tarini
 *
 */
public class LargestOneSequenceOnFlip {

	private static int[] arrInt = {1,1,1,0,1,1,1,0,1,1,1,1,1};
	
	//Take two variables that will hold the count of 1's and 0's. maxSeq that will hold max sequence of 1's.
	// when '0' is encountered set isZero  and check for maxSequence of 1's (x+y+1) by verifying x>0 AND y>0. 
	// Worst case = O(n)
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		boolean isZero = false;
		int maxSeq = 0;
		
		for(int i = 0; i<arrInt.length; i++) {
			
			if(arrInt[i] == 1) {
				if(isZero) y++; else x++;
				
				if(i == arrInt.length-1) {
					if(x+y+1 > maxSeq && isZero) {
						maxSeq = x+y+1;
					}else {
						maxSeq = x;
					}
				}
			}
			
			if(arrInt[i] == 0) { 
				isZero = true;
				if(i == arrInt.length-1) {
					maxSeq = x+y+1;
				}else if(x>0 && y>0) {
					if(x+y+1 > maxSeq) {
						maxSeq= x+y+1;
					}
					//reset
					x = y;
					y = 0;
				}
			}
			
		}
		
		System.out.println(maxSeq);
		
	}
	
	
//	private static void findMaxSeq() {
//		int sequenceOnesTot = 0;
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		for(int i = 0; i < arrInt.length; i++) {
//			
//			if(arrInt[i] == 1) {
//				sequenceOnesTot++;
//				if(sequenceOnesTot > 0 && i == arrInt.length-1) {
//					list.add(sequenceOnesTot);
//				}
//			}else {
//				if(sequenceOnesTot > 0) {
//					list.add(sequenceOnesTot);
//				}
//				list.add(arrInt[i]);
//				sequenceOnesTot = 0;
//			}
//			
//		}
//		System.out.println(list);
//		int maxSeq = 0;
//	}
	
}
