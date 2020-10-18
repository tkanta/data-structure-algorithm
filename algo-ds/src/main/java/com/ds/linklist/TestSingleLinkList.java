package com.ds.linklist;

public class TestSingleLinkList {

	public static void main(String[] args) {
		SingleLinkList ll = new SingleLinkList();
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.display();
		System.out.println("\n------------");
		try {
			ll.deleteKthNode(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		ll.display();
	}
}
