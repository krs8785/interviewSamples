package karan.LinkedList;

import karan.Node.Node;

public class reverseLinkedListRecursive {

	public static Node reverseLL(Node head){
		if(head == null || head.getNext() == null){
			return head;
		}
		Node second = head.getNext();
		head.setNext(null);
		Node remain = reverseLL(second);
		second.setNext(head);
		return remain;
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addLast(5);
		ll.addLast(7);
		ll.addLast(9);
		ll.addLast(11);
		ll.display();
		ll.setHead(reverseLL(ll.getHead()));
		System.out.println();
		ll.display();
		
	}
}
