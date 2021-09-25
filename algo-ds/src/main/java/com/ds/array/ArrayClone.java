package com.ds.array;

public class ArrayClone {

	public static void main(String[] args) {
		clone2DArray();
		System.out.println("--------------------");
		clone1DArray();
	}
	
	private static void clone2DArray() {
		int intArray[][] = {{1,2,3},{4,5}};
        
        int cloneArray[][] = intArray.clone();
          
        // will print false
        System.out.println(intArray == cloneArray);
          
        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
	}
	
	private static void clone1DArray() {
		int intArray[] = {1,2,3};
        
        int cloneArray[] = intArray.clone();
          
        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);
          
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]+" ");
        }
	}
}
