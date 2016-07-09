package karan.Node;

public class BTNode {
	private int value;
	private BTNode left;
	private BTNode right;
	
	public BTNode(int _v){
		this.value = _v;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}
	
	public void printInorder(BTNode root){
		if(root == null){
			return;
		}
		printInorder( root.getLeft() );
		System.out.println(root.value);
		printInorder( root.getRight() ); 
	}

	
}

