package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class BTMirrorSwap {
	
	public static BTNode doMirror(BTNode root){
		BTNode temp;
		if(root != null){
			
		
		doMirror(root.getLeft());
		doMirror(root.getRight());
		
		temp  = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(temp);
		}
		return root;
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
		bst.displayInorder(bst.getRoot());
		System.out.println("****");
		doMirror(bst.getRoot());
		bst.displayInorder(bst.getRoot());
	}
}
