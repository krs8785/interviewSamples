package karan.LinkedList;

import karan.Node.Node;

public class findKthNodeEnd {

	
	public static void findK(Node start, int k){
		if(start == null){
			return;
		}
		Node first = start;
		Node second = first;
		for (int i = 0; i <k; i++) {
			second = second.getNext();
		}
		while(second!= null){
			first = first.getNext();
			second = second.getNext();
		}
		System.out.println(first.getValue());
	}
	
	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		findK(ll.getHead(), 4);
	}
}
