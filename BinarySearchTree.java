
public class BinarySearchTree {

	Node root;
	
	public BinarySearchTree() {
		root = null;
	}

	/*
	 * Adds the specified node to the BST
	 */
	public String add(String value) {
		
	}
	
	/*
	 * Returns true if the string is found in the BST
	 */
	public boolean contains(String value) {

	}
	
	/*
	 * Checks whether the tree is empty or not
	 */
	public boolean isEmpty() {

	}
	
	/*
	 * Removes the specified string from the BST
	 */
	public boolean remove(String s) {
		// To do

	}

	// Removes the largest node in the given tree,
	// which will be the rightmost node, and returns
	// the value from that node. The largest node
	// will always have 0 or 1 children (if it had
	// 2 children, then the right node would be larger).
	private String removeLargestFromLeftSubtree(Node n) {
		// To do, optional, you can accomplish the same task in the remove method. In that case you don't
		// have to define this method.
		
	}

	
	/**
	 * Prints the inorder traversal of this tree
	 */
	public void inorderTraversal() {
		inorderTraversal(root);
	}
	private void inorderTraversal(Node root) {
		if(root == null)
			return;
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}
	
	private class Node{
		String data;
		Node left;
		Node right;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	/*
	 * Returns the height of the tree
	 */
	public int getHeight() {
		return getHeight(root);
	}
	
	private int getHeight(Node root) {
		if(root == null)
			return 0;
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		
	}
	
	
	public static void main(String [] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add("D");
		bst.add("B");
		bst.add("F");
		bst.add("A");
		bst.add("C");
		bst.add("E");
		bst.add("G");
		
		System.out.println("The height: " + bst.getHeight());
		
		System.out.print("BST Inorder: ");
		bst.inorderTraversal();
		System.out.println();
		System.out.println(bst.contains("A"));
		System.out.println(bst.contains("B"));
		System.out.println(bst.contains("C"));
		System.out.println(bst.contains("D"));
		System.out.println(bst.contains("E"));
		System.out.println(bst.contains("F"));
		System.out.println(bst.contains("G"));

		System.out.println(bst.contains("X"));
		System.out.println(bst.contains("M"));
		System.out.println(bst.contains("L"));
		
	}

}
