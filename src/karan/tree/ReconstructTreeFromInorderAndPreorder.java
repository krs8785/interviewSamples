package karan.tree;
import java.util.Stack;

import karan.Node.BTNode;

public class ReconstructTreeFromInorderAndPreorder {

	
	public static BTNode reconstruct(int [] inorder, int [] preorder){
		
		Stack<BTNode> mystack = new Stack<BTNode>();
		BTNode root = new BTNode(preorder[0]);
		
		mystack.push(root);
		int j=0;
		
		for(int i=1; i<preorder.length;i++){
			BTNode current = mystack.peek();
			if(current.getValue() != inorder[j]){
				current.setLeft(new BTNode(preorder[i]));
				mystack.push(current.getLeft());
			}else{
				while(!mystack.empty() && mystack.peek().getValue() == inorder[j]){
					j++;
					current = mystack.peek();
					mystack.pop();
				}
				if(j < preorder.length){
					current.setRight(new BTNode(preorder[i]));
					mystack.push(current.getRight());
				}
			}
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		BTNode res = new BTNode(0);
		res  = reconstruct(new int[]{1,3,2,4,5}, new int[] {4,3,1,2,5});
		
		res.printInorder(res);
	}
}
