package karan.LinkedList;

import karan.Node.*;

public class sumLinkedList {

	
	public static SinglyLinkedList add(Node l1, Node l2){
		
		SinglyLinkedList res=  new SinglyLinkedList();
		
		Node p1 = l1;
		Node p2 = l2;
		int carry =0;
		
		while(p1 != null || p2 != null){
			if(p1!=null){
				carry= carry+p1.getValue();
				p1=p1.getNext();
			}
			if(p2!=null){
				carry= carry+p2.getValue();
				p2=p2.getNext();
			}
			
			res.addLast(carry %10);;
			carry = carry/10;
			
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		SinglyLinkedList l1 = new SinglyLinkedList();
		l1.addLast(6);
		l1.addLast(2);
		l1.addLast(1);
		
		SinglyLinkedList l2 = new SinglyLinkedList();
		l2.addLast(5);
		l2.addLast(1);
		
		add(l1.getHead(),l2.getHead()).display();
		
		
	}
}
