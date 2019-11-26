package binarysearchtree;

public class PrintBinaryTree {
	public static void printTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode last = null;
		TreeNode nlast = null;
		queue.offer(root);
		last = root;
		nlast = root;
		while (!queue.isEmpty()) {
			TreeNode t = queue.peek();
			System.out.println(queue.poll() + " ");
			if (t.left != null){
				queue.offer(t.left);
				nlast = t.left;
			}
			if (t.right != null){
				queue.offer(t.right);
				nlast = t.right;
			}
			if (t == last){
				last = nlast;
				System.out.println();
			}
		}
	}

    public static void main(String[] args) {    
		// ¹¹½¨¶þ²æÊ÷
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.right.left.left = new TreeNode(7);
		root.right.left.right = new TreeNode(8);
		Tree test = new Tree();
		test.printTree(root);
    }
}
