package com.ds.linklist;

public class SingleLinkList {

	LLNode head;
	
	public void add(Object val) {
		LLNode newNode = new LLNode(val, null);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void delete() {
		head = head.next;
	}
	
	public void display() {
		LLNode n = head;
		while(n != null) {
			System.out.print(n.value+",");
			n = n.next;
		}
	}
	
	public void deleteKthNode(int kth) throws Exception{
		LLNode slow = head;
		LLNode fast = head;
		int move = kth;
		
		while(move > 0) {
			try {
				fast = fast.next;
			}catch(NullPointerException nux) {
				throw new Exception("Can't delete "+ kth +"th element from Link List of size : "+(kth-move));
			}
			move--;
		}
		
		while(null != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
		
	}
}
