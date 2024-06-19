package post_order;

public class MyTreeMap<E> {
	private Node<E> root;
	private int size;
	
	public MyTreeMap() {
	}
	
	public Node<E> getRoot() {
		return root;
	}
	
	public void setRoot(Node<E> root) {
		this.root = root;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void postOrder(Node<E> root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.println(root.getData());
		}
	}
	
	public void preOrder(Node<E> root) {
		if (root != null) {
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	
	public void inOrder(Node<E> root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}
	
}
