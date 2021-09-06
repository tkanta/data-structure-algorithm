package com.interview;

public class RectangleOverlapping {

	static class Point{
		int x,y;
	}
	
	static boolean isOverlapped(Point L1, Point R1, Point L2, Point R2) {
		
		//(no overlapping)
		if((L1.x < L2.x && R1.x < L2.x)) {
			return false;
		}
		
		// (no overlapping)
		if((L1.x > R2.x && R1.x > R2.x) ) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Point l1 = new Point(),r1 = new Point(), 
                l2 = new Point(),r2 = new Point(); 
		l1.x=0;l1.y=10; r1.x=10;r1.y=0; 
        l2.x=5;l2.y=5; r2.x=15;r2.y=0;
         
         System.out.println(isOverlapped(l1, r1, l2, r2));
	}
	
}
