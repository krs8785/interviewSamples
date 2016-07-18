package karan.LinkedList;

import karan.Node.Node;

public class sortLinkedListMergeSort {

	
	public static void main(String[] args) {
		Node head = new Node();
		head.setValue(9);
		
		Node second = new Node(2);
		Node third = new Node(1);
		Node fourth = new Node(6);
		
		third.setNext(fourth);
		second.setNext(third);
		head.setNext(second);
		
		Node result  = mergeSortLinkedList(head);
	}

	private static Node mergeSortLinkedList(Node head) {
		if(head == null || head.getNext() == null){
			return head;
		}
		int count = 0;
		Node current = head;
		while(current!=null){
			current = current.getNext();
			count++;
		}
		int middle = count/2;
		Node left = head;
		Node right = null;
		
				
				
		return head;
	}
}
