package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class isBalance {

	
	public static boolean isBalanced(BTNode root){
	
		if(root == null){
			return true;
		}
		if(getHeight(root) == -1){
			return false;
		}
		return true;
	}
	
	private static int getHeight(BTNode root) {
		// TODO Auto-generated method stub
		if(root == null){
			return 0;
		}
		
		int h1 = getHeight(root.getLeft());
		int h2 = getHeight(root.getRight());
		
		if(h1 == -1 || h2 ==-1){
			return -1;
		}
		
		if(Math.abs(h1 - h2) > 1){
			return -1;
		}
		return Math.max(h1, h2)+1;
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
		
		System.out.println(isBalanced(bst.getRoot()));
	
		BTNode root = new BTNode(5);
		root.setLeft(new BTNode(2));
		root.getLeft().setLeft(new BTNode(7));;


		System.out.println(isBalanced(root));
	
		
	}
	
}
