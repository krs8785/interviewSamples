package karan.tree;

import karan.BinarySearchTree.BinarySearchTree;
import karan.Node.BTNode;

public class BTMirrorTree {

	public static BTNode doMirror(BTNode root){
        if(root == null){
            return root;
        }else{
            BTNode naya = new BTNode();
            naya.setValue(root.getValue());
            naya.setRight(doMirror(root.getLeft()));
            naya.setLeft(doMirror(root.getRight()));
            return  naya;
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.insert(8);
        bst.insert(6);
        bst.displayInorder(bst.getRoot());
        System.out.println("***-*");
        BTNode temp  = doMirror(bst.getRoot());
        temp.printInorder(temp);

    }
}
