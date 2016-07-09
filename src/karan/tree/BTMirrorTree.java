package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class BTMirrorTree {

	public static void  doMirror(BTNode root){
		
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
		bst.displayInorder(bst.getRoot());
	}
}
