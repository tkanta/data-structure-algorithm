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
		
//		linkList.head = new Node(1);
//		Node second = new Node(2);
//		Node third = new Node(3);
//		
//		linkList.head.next = second;
//		second.next = third;
//		System.out.println(linkList.head.next.next.value);
		
		linkList.push(3);
		linkList.append(5);
		linkList.insertAfter(linkList.head, 4);
		linkList.printList();
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
}
