package karan.xgeneral;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class MorrisTraversal {

	public static void MorrisTraversal(BTNode node) {
        BTNode current, pre;
         
        if (node == null) {
            return;
        }
         
        current = node;
        while (current != null) {
            if (current.getLeft() == null) {
                System.out.print(current.getValue() + " ");
                current = current.getRight();
            } else {
 
                /* Find the inorder predecessor of current */
                pre = current.getLeft();
                while (pre.getRight() != null && pre.getRight() != current) {
                    pre = pre.getRight();
                }
 
                /* Make current as right child of its inorder predecessor */
                if (pre.getRight() == null) {
                    pre.setRight(current);
                    current = current.getLeft();
                } 
 
                 /* Revert the changes made in if part to restore the original 
                 tree i.e., fix the right child of predecssor */ 
                else {
                    pre.setRight(null);
                    System.out.print(current.getValue() + " ");
                    current = current.getRight();
                }   /* End of if condition pre->right == NULL */
                 
            } /* End of if condition current->left == NULL*/
             
        } /* End of while */
         
    }
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(4);
		bst.insert(2);
		bst.insert(1);
		bst.insert(0);
		bst.insert(7);
		bst.insert(8);
		bst.insert(6);
		MorrisTraversal(bst.getRoot());
	}
}
