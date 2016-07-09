package karan.LinkedList;

import karan.Node.Node;

public class reverseLinkedListIterative {
	
	public static Node reverseLL(Node head){
		if(head == null || head.getNext() == null){
			return head;
		}
		Node first = head;
		Node second = head.getNext();
		head.setNext(null);
		
		while(first != null && second != null){
			Node third = second.getNext();
			second.setNext(first);
			first = second;
			if(third != null){
				second = third;
			}else{
				break;
			}
		}
		return second;
		
		
	}
	
	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		ll.display();
		ll.setHead(reverseLL(ll.getHead()));
		System.out.println();
		ll.display();
	}
}
