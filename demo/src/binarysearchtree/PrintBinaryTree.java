package binarysearchtree;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTree {
	public static void printTree(TreeNode root) {
		TreeNode last = null;
		TreeNode nlast = null;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		last = root;
		nlast = root;
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			System.out.print(tmp.val + " ");
			if (tmp.left != null) {
				queue.offer(tmp.left);
				nlast = tmp.left;
			}
			if (tmp.right != null) {
				queue.offer(tmp.right);
				nlast = tmp.right;
			}
			if (tmp == last) {
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
		printTree(root);
	}
}
