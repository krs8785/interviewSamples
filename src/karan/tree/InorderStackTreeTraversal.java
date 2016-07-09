package karan.tree;

import java.util.Stack;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;


public class InorderStackTreeTraversal {

	static void inorderStack(BTNode root){
		if(root == null){
			return ;
		}
		Stack<BTNode> myStack = new Stack<BTNode>();
		BTNode current = root;
		while(current != null){
			myStack.push(current);
			current = current.getLeft();
		}
		
		while(!myStack.isEmpty()){
			current = myStack.pop();
			System.out.println(current.getValue());
			if(current.getRight() != null){
				current = current.getRight();
				
				while(current != null){
					myStack.push(current);
					current = current.getLeft();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(4);
		bst.insert(2);
		bst.insert(7);
		bst.insert(8);
		bst.insert(6);
		inorderStack(bst.getRoot());
		
	}
}
