package karan.BinarySearchTree;

public class runBST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(4);
		bst.insert(2);
		bst.insert(7);
		bst.insert(8);
		bst.insert(6);
		bst.displayInorder(bst.getRoot());
	}
}
