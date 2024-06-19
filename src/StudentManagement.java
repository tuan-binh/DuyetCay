import post_order.MyTreeMap;
import post_order.Node;

import java.util.TreeMap;

public class StudentManagement {
	
	public static void main(String[] args) {
		MyTreeMap<Integer> map = new MyTreeMap<>();
		Node<Integer> nodeLeft3 = new Node<>(5, null, null);
		Node<Integer> nodeLeft2 = new Node<>(2, nodeLeft3, null);
		Node<Integer> nodeRight2 = new Node<>(3, null, null);
		/**
		 * 			1
		 * 		2		3
		 * 	5
		 * */
		map.setRoot(new Node<>(1, nodeLeft2, nodeRight2));
		map.inOrder(map.getRoot());
	}
	
}