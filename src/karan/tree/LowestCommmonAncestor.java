package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class LowestCommmonAncestor {

	public static BTNode getAncestor(BTNode root, int n1, int n2){
		if(root == null ){
			return null;
		}
		if(root.getValue() ==n1 || root.getValue() == n2){
			return root;
		}
		BTNode left = getAncestor(root.getLeft(), n1, n2);
		BTNode right = getAncestor(root.getRight(), n1, n2);
		if(left != null && right !=null){
			return root;
		}
		return left!=null?left:right;
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		bt.setRoot(new BTNode(5));
		bt.getRoot().setLeft(new BTNode(7));
		bt.getRoot().setRight(new BTNode(9));
		bt.getRoot().getRight().setLeft(new BTNode(11));
		bt.getRoot().getRight().setRight(new BTNode(3));
		System.out.println(getAncestor(bt.getRoot(), 3, 11).getValue());
	}
}
