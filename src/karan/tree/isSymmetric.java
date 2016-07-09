package karan.tree;

import karan.Node.BTNode;

public class isSymmetric {

	
	    public static boolean isSymmetric(BTNode root) {
	        if (root==null) {
	            return true;
	        }

	        return isSymmetric(root.getLeft(), root.getRight());
	    }


	    public static boolean isSymmetric(BTNode left, BTNode right) {
	        if (left==null) {
	            return right==null;
	        }
	        //left is not null
	        if (right==null) {
	            return false;
	        }        
	        //both left and right are not null
	        if (left.getValue() != right.getValue()) {
	            return false;
	        }

	        return isSymmetric(left.getLeft(), right.getRight()) && isSymmetric(left.getRight(), right.getLeft());

	    }
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			BTNode root = new BTNode(1);
			BTNode l1 = new BTNode(2);
			BTNode r1 = new BTNode(2);
			BTNode l2 = new BTNode(3);
			BTNode r2 = new BTNode(3);
			BTNode l3 = new BTNode(4);
			BTNode r3 = new BTNode(4);
			
			root.setLeft(l1);
			root.setRight(r1);
			l1.setLeft(l2);
			l1.setRight(r3);
			r1.setLeft(l3);
			r1.setRight(r2);
			
			System.out.println(isSymmetric(root));
			
			
			
			
		}

}
