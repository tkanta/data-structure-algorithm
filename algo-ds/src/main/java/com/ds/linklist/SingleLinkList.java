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
	
	
	
	/**
	 * Delete node from end of Link List
	 * @param kth
	 * @throws Exception
	 */
	public void deleteKthNode(int kth) throws Exception{
		
		if(kth <= 0) {
			throw new Exception("argument should be >= 0");
		}
		LLNode slow = head;
		LLNode fast = head;
		int move = kth;
		
		//move fast pointer to kth location
		while(move > 0) {
			try {
				fast = fast.next;
			}catch(NullPointerException nux) {
				throw new Exception("Can't delete "+ kth +"th element from Link List of size : "+(kth-move));
			}
			move--;
		}
		
		//move fast and slow, incrementally
		while(fast != null && null != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		
		//removing the element where kth == sizeof(linkList)
		if(slow == head && fast == null) {
			head = slow.next;
		}else {
			//removing intermediate element
			slow.next = slow.next.next;
		}
		
	}
}
