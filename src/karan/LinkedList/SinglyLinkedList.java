package karan.LinkedList;

import karan.Node.Node;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private int count = 0;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tail = head;
	}
	
	public void addLast(int value){
		Node temp = new Node(value);
		temp.setNext(null);
		if(head == null){
			head = temp;
			tail = head;
		}else{
			tail.setNext(temp);
			tail = temp;
		}
		setCount(getCount() + 1) ;
	}
	
	public void addFirst(int value){
		Node temp = new Node(value);
		if(head == null){
			head = temp;
			tail = temp;
		}else{
			temp.setNext(head);
			head = temp;
		}
		setCount(getCount() + 1) ;
	}
	
	public Node removeLast(){
		setCount(getCount() - 1);
		if(tail != null){
			if(head == tail){
				Node temp = head;
				head = null;
				tail = null;
				return temp;
			}else{
				Node current = head;
				while(current.getNext() != tail){
					current = current.getNext();
				}
				Node temp = tail;
				current.setNext(null);
				tail = current;
				return temp;
			}
		}
		return null;
	}
	
	public Node removeFirst(){
		setCount(getCount() - 1);
		if(head != null){
			if(head == tail){
				Node temp = head;
				head = null;
				tail = null;
				return temp;
			}else{
				Node temp = head;
				head = head.getNext();
				return temp;
			}
		}
		return null;
	}
	
	public void delete(int key){
		if(head != null && head.getValue() == key){
			head = head.getNext();
			return;
		}
		Node current = head;
		Node prev = null;
		//1->2->3->4->5->null
		while( current != null && current.getValue() != key){
			prev = current;
			current= current.getNext();
		}
		if(current == null){
			return;
		}
		prev.setNext(current.getNext());
	}
	
	public void display(){
		Node current = head;
		while(current !=null ){
			System.out.print(current.getValue()+"->");
			current = current.getNext();
		}
		System.out.println("null");
		System.out.println();
	}	
	
	public boolean isEmpty(){
		if(tail == null){
			return true;
		}else{
			return false;
		}
	}
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
