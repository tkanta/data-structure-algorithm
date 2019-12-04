package linklist.singly;

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
		
		linkList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		linkList.head.next = second;
		second.next = third;
		System.out.println(linkList.head.next.next.value);
	}
}
