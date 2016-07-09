package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class InorderSuccessor {
	
	public static BTNode inorder(BTNode root, BTNode q){
		if (root == null || q ==null) 
				return null;
		
		if(q.getRight() != null ){
			return findMin(q.getRight());
		}
		//case 2 right is null
		BTNode succ = null;
		BTNode p = root;
		while(p != null){
			if(p.getValue() > q.getValue()){
				succ = p;
				p = p.getLeft();
			}else if(p.getValue() < q.getValue()){
				 p = p.getRight();
			}else{
				break;
			}
		}
		return succ;
		
	}
	

	private static BTNode findMin(BTNode right) {
		// TODO Auto-generated method stub
		BTNode p = right;
		while(p.getLeft()!=null){
			p = p.getLeft();
		}
		return p;
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
		System.out.println(inorder(bst.getRoot(), new BTNode(7)).getValue());
	}
}
