package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class BSTLowestCommonAncestor {

	public static BTNode getAncestor(BTNode root, int n1, int n2){
		if(root == null ){
			return null;
		}
		if(root.getValue() > n1 && root.getValue() > n2){
			return getAncestor(root.getLeft(),n1,n2);
		}
		if(root.getValue() < n1 && root.getValue() < n2){
			return getAncestor(root.getRight(),n1,n2);
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
		System.out.println(getAncestor(bst.getRoot(), 7, 3).getValue());
	}
}
