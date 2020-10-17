package com.ds.array;

import java.util.Arrays;

public class DynamicArray<T> {
	
	// element size
	int size = 0;
	Object[] data;
	
	
	public DynamicArray() {
		this.data = new Object[1];
	}
	
	public int getElementSize() {
		return this.size;
	}
	
	public int getArraySize() {
		return this.data.length;
	}
	public T get(int index) {
		return (T) data[index];
	}
	
	public void put(int val) {
		ensureCapacity(this.size+1);
		data[size++] = val;
	}
	
	private void ensureCapacity(int minCap) {
		int oldCap = getArraySize();
		if(minCap > oldCap) {
			int newCap = oldCap * 2;
			if(newCap < minCap) {
				newCap = minCap;
			}
			data = Arrays.copyOf(data, newCap);
		}
	}
	
	public static void main(String[] args) {
		DynamicArray<Integer> arr = new DynamicArray<>();
		arr.put(23);
		System.out.println("Element size : "+ arr.getElementSize() +", Array size :" + arr.getArraySize());
		arr.put(24);
		System.out.println("Element size : "+ arr.getElementSize() +", Array size :" + arr.getArraySize());
		arr.put(235);
		System.out.println("Element size : "+ arr.getElementSize() +", Array size :" + arr.getArraySize());
		arr.put(236);
		System.out.println("Element size : "+ arr.getElementSize() +", Array size :" + arr.getArraySize());
		arr.put(238);
		System.out.println("Element size : "+ arr.getElementSize() +", Array size :" + arr.getArraySize());
		arr.put(239);
		System.out.println("Element size : "+ arr.getElementSize() +", Array size :" + arr.getArraySize());
		arr.put(240);
		System.out.println("Element size : "+ arr.getElementSize() +", Array size :" + arr.getArraySize());
		
		for(int i =0; i<arr.getElementSize(); i++) {
			System.out.println(arr.get(i));
		}
	}
	
}
