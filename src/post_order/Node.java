package post_order;

public class Node<E> {
	private E data;
	private Node<E> right;
	private Node<E> left;
	
	public Node() {
	}
	
	public Node(E data, Node<E> left, Node<E> right) {
		this.data = data;
		this.right = right;
		this.left = left;
	}
	
	public E getData() {
		return data;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	public Node<E> getRight() {
		return right;
	}
	
	public void setRight(Node<E> right) {
		this.right = right;
	}
	
	public Node<E> getLeft() {
		return left;
	}
	
	public void setLeft(Node<E> left) {
		this.left = left;
	}
}
