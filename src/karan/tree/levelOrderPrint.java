package karan.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class levelOrderPrint {
	
	public static List<List<Integer>> levelOrder2(BTNode root) {
        if (root == null) {return null;}
        
        LinkedList<BTNode> current = new LinkedList<BTNode>();
        LinkedList<BTNode> child = new LinkedList<BTNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        current.add(root);
        
        List<Integer> res = new ArrayList<Integer>();
        while(!current.isEmpty()){
        	BTNode temp = current.remove();
            res.add(temp.getValue());
            if(temp.getLeft() != null){
                child.add(temp.getLeft());
            }
            if(temp.getRight() != null){
                child.add(temp.getRight());
            }
            if(current.isEmpty()){
                current = child;
                child = new LinkedList<BTNode>();
                result.add(res);
                res  =  new ArrayList<Integer>();
            }
           
            
        }
        
        
        return result;
        
    }
	
	
	public static void levelOrder(BTNode root){
		if (root == null) {
			return;
		}
		
		LinkedList<BTNode> parent = new LinkedList<BTNode>();
		LinkedList<BTNode> child = new LinkedList<BTNode>();
		
		parent.add(root);
		
		while(!parent.isEmpty()){
			BTNode temp = parent.remove();
			System.out.print(temp.getValue()+" ");
			if(temp.getRight() != null){
				child.add(temp.getRight());
			}
			if(temp.getLeft() != null){
				child.add(temp.getLeft());
			}
			if(parent.isEmpty()){
				parent = child;
				child = new LinkedList<BTNode>();
				System.out.println();
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
		Object k = levelOrder2(bst.getRoot());
	}
}
