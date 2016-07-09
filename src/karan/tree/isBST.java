package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class isBST {
	
	public static boolean isBSTree(BTNode root,int max, int min){
		if(root == null ){
			return true;
		}
		if(root.getValue() > max){
			return false;
		}
		if(root.getValue() < min){
			return false;
		}
		return isBSTree(root.getLeft(),root.getValue(),min) && isBSTree(root.getRight(),max,root.getValue());
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
		System.out.println(isBSTree(bst.getRoot(),Integer.MAX_VALUE,Integer.MIN_VALUE));
	}

}
