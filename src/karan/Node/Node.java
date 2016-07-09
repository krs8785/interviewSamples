package karan.Node;

public class Node {
	private int value;
	private Node next;
	
	public Node(int _v){
		this.value = _v;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
