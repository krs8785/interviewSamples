package karan.LinkedList;

import karan.Node.Node;

public class testSinglyLinkedList {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLast(1);
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		list.addLast(8);
		list.display();
		list.delete(8);
		list.display();
		list.addFirst(0);
		list.display();
		list.removeFirst();
		list.display();
		list.removeFirst();
		list.display();
		Node temp = list.removeFirst();
		System.out.println("->"+temp.getValue());
	}
}
