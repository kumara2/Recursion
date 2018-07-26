package numOfBinaryTrees;
import java.util.*;

public class BinaryTree {
	public List<Node> createBinaryTree(int num) {
		List<Node> allTrees = new ArrayList<Node>();
		if(num == 0) {
			allTrees.add(null);
			return allTrees;
		}
		for(int i = 0; i < num; i++) {
			List<Node> left = createBinaryTree(i);
			List<Node> right = createBinaryTree(num - i - 1);
			for(Node l: left) {
				for(Node r: right) {
					Node n = new Node(0);
					allTrees.add(n);
					n.left = l;
					n.right = r;
				}
			}
		}
		return allTrees;
	}

	public static void main(String[] args) {
		List<Node> result = new BinaryTree().createBinaryTree(5);
		System.out.println(result.size());
	}
}
