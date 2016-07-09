package karan.BinarySearchTree;

import karan.Node.BTNode;

public class BinarySearchTree {
	private BTNode root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert(int value){
		//set root if empty
		BTNode temp = new BTNode(value);
		if(root == null){
			root = temp;
		}else{
			root = insertHelper(root,value);
		}
	}
	
	private BTNode insertHelper(BTNode root, int value) {
		// TODO Auto-generated method stub
		if(root == null){
			return new BTNode(value);	
		}
		if(root.getValue() > value){
			//insert into left
			root.setLeft(insertHelper(root.getLeft(), value));
		}
		if(root.getValue() < value){
			//insert into Right
			root.setRight(insertHelper(root.getRight(), value));
		}
		return root;
		
	}

	public void displayInorder(BTNode root){
		if(root == null) return;
		displayInorder(root.getLeft());
		System.out.println(root.getValue()+" ");
		displayInorder(root.getRight());
	}

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}
	
}
