package binarysearchtree;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static util.InitTheTree.initTheTree;

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
			System.out.print(tmp.value + " ");
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
		TreeNode root = initTheTree();
		printTree(root);
	}
}
