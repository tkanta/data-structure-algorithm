package linklist.singly;

import java.util.Stack;

public class SimpleLinkList {
	
	static class Node{
		Node next;
		int value;
		
		Node(int x){
			value = x;
			next = null;
		}
	}
	
	Node head;
	
	public static void main(String[] args) {
		SimpleLinkList linkList = new SimpleLinkList();
		
//		linkList.head = new Node(1);
//		Node second = new Node(2);
//		Node third = new Node(3);
//		
//		linkList.head.next = second;
//		second.next = third;
//		System.out.println(linkList.head.next.next.value);
		
//		linkList.push(3);
//		linkList.append(5);
//		linkList.insertAfter(linkList.head, 4);
//		linkList.printList();
		
		//linkList.push(5);
//		linkList.push(4);
//		linkList.push(3);
//		linkList.push(2);
//		linkList.push(1);
//		linkList.printList();
		//linkList.deleteNode(3);
		//linkList.deleteNodeAtPosition(3);
		//System.out.println();
		//linkList.printList();
		//System.out.println();
		//System.out.println("count : "+linkList.getCount());
		
		//Print nth from last
		//linkList.printNthFromLast(2);
		
		//-------- Print Middle --------
		//linkList.printMiddleWithOddIndex();
		//linkList.printMiddleWithDoubleIncrement();
		
		//--------- detect loop ---------
//		Node head = new Node(1); 
//        head.next = new Node(2); 
//        head.next.next = new Node(3); 
//        head.next.next.next = new Node(4); 
//        head.next.next.next.next = new Node(5); 
//        // Create a loop for testing(5 is pointing to 3) / 
//        head.next.next.next.next.next = head.next.next.next;
//		boolean isLoop = linkList.detectLoop(head);
//		System.out.println("\n"+isLoop);
		
		//----------- check palindrome --------
		linkList.push(4);
		linkList.push(2);
		linkList.push(1);
		linkList.push(2);
		linkList.push(5);
		System.out.println(linkList.checkPalindrome());
	}
	
	public void printList() {
		Node tnode = head;
		while(null != tnode) {
			System.out.print(tnode.value + " ");
			tnode = tnode.next;
		}
	}
	
	//Insert new node at first
	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfter(Node prevNode, int newValue) {
		if(null == prevNode) {
			return;
		}
		Node newNode = new Node(newValue);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	public void append(int newValue) {
		Node newNode = new Node(newValue);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node last = head;
		while(null != last.next) {
			last = head.next;
		}
		last.next = newNode;
	}
	
	public void deleteNode(int key) {
		
		Node temp = head, prev = null;
		
		if(temp != null && temp.value == key) {
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.value != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) return;
		
		prev.next = temp.next;
	}
	public void deleteNodeAtPosition(int pos) {
		
		if(head == null) return;
				
		Node temp = head;
		
		if(pos == 0) {
			head = temp.next;
			return;
		}
		
		int index = 0;
		while(index < pos-1) {
			temp = temp.next;
			index++;
		}
		
		if(temp == null || temp.next == null) {
			return;
		}
		
		temp.next = temp.next.next;
		
	}
	
	public int getCount() {
		Node temp = head;
		
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
		
	}
	
	public void printNthFromLast(int nth) {
		Node temp = head;
		
		int len = 0;
		while(temp != null) {
			temp = temp.next;
			len++;
		}
		
		if(nth > len ) return ;
		
		temp = head;
		
		for(int i = 1; i < len-nth+1 ; i++) {
			temp = temp.next;
		}
		System.out.println("\n"+ nth +"th from last : "+temp.value);
	}
	
	//================ print Middle Element ================
	
	// increment when odd index to find the middle number
	public void printMiddleWithOddIndex() {
		Node mid = head, temp = head;
		int count = 0;
		while(temp != null) {
			if(count % 2 != 0) {
				mid = mid.next;
			}
			temp = temp.next;
			count++;
		}
		System.out.println("\nMid Value ---> "+mid.value);
	}
	
	public void printMiddleWithDoubleIncrement() {
		Node mid = head, fast = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			mid = mid.next;
		}
		System.out.println("\nMid Value ---> "+mid.value);
	}
	
	
	//-------------  detect loop --------------
	
	public boolean detectLoop(Node head) {
		Node fast = head, slow = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println(countLoopLen(slow));
				return true;
			}
		}
		return false;
	}
	
	public int countLoopLen(Node n) {
		int count = 0;
		Node temp = n;
		while(temp.next != n) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	// ------------- check palindrome ------------
	
	public  boolean checkPalindrome() {
		Stack<Integer> stack = new Stack<>();
		
		Node temp = head;
		if(temp == null) return false;
		
		while(temp != null) {
			stack.push(temp.value);
			temp = temp.next;
		}
		
		temp = head;
		while(temp != null) {
			if(temp.value != stack.pop()) {
				return false;
			}
			temp = temp.next;
		}
		return true;
	}
	
}
