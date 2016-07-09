package karan.LinkedList;

import karan.Node.Node;

public class intersectionLinkedList {

	
	static class Result{
		public Node tail ;
		public int size;
		public Result(int _size, Node _tail) {
			// TODO Auto-generated constructor stub
			this.size = _size;
			this.tail = _tail;
		}
	}
	
	public static Node getIntersection(Node a1, Node b1){
		if(a1 == null || b1 == null){
			return null;
		}
		Result r1 = getTailAndSize(a1);
		Result r2 = getTailAndSize(b1);
		
		if(r1.tail != r2.tail){
			return null;
		}
		
		Node shorter = r1.size < r2.size ? a1:b1;

		Node longer = r1.size < r2.size ? b1:a1;
		
		int diff = Math.abs(r1.size - r2.size);
		for (int i = 0; i < diff; i++) {
			longer = longer.getNext();
		}
		
		while(shorter!=longer){
			shorter = shorter.getNext();
			longer = longer.getNext();
					
		}
		return shorter;
		
	}
	
	public static Result getTailAndSize(Node start){
		
		if(start == null){
			return null;
		}
		int size =1 ;
		Node current = start;
		while(current.getNext()!= null){
			size++;
			current = current.getNext();
		}
		return new Result(size, current);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a1 = new Node(4);
		Node a2 = new Node(1);
		Node a3 = new Node(5);
		Node a4 = new Node(9);
		
		a1.setNext(a2);
		a2.setNext(a3);
		a3.setNext(a4);
		
		Node b1 = new Node(4);
		Node b2 = new Node(6);
		
		b1.setNext(b2);
		
		Node inter = new Node(99);
		
		a4.setNext(inter);
		b2.setNext(inter);
		
		Node c1 = new Node(2);
		Node c2 = new Node(1);
		Node c3 = new Node(8);
		
		inter.setNext(c1);
		c1.setNext(c2);
		c2.setNext(c3);
		
		System.out.println(getIntersection(a1, b1).getValue());
	}

}
