package karan.tree;

import java.util.ArrayList;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class BTSumPath {
	
	public static void path(BTNode root, ArrayList<BTNode> sol,int target){
		if(root == null){
			return;
		}
		int sum =0;
		sol.add(root);
		for(BTNode i : sol){
			sum=sum+i.getValue();
		}
		if(sum == target){
			for(BTNode i : sol){
				System.out.print(i.getValue());
			}
			System.out.println("-------");
		}
		path(root.getLeft(), sol, target);
		path(root.getRight(),sol,target);
		sol.remove(sol.size()-1);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(4);
		bst.insert(2);
		bst.insert(7);
		bst.insert(8);
		bst.insert(6);
		path(bst.getRoot(), new ArrayList<BTNode>(), 10);

	}

}
