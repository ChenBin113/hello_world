package binarysearchtree;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static binarysearchtree.PrintBinaryTree.printTree;

public class SerializedAndDeserializedBinaryTree {

    public static String serializedBinaryTree(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrderTraversal(root, sb);
        return sb.toString();
    }

    private static void preOrderTraversal(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#!");
            return;
        }
        sb.append(node.val).append("!");
        preOrderTraversal(node.left, sb);
        preOrderTraversal(node.right, sb);
    }

    public static TreeNode deSerializedBinaryTree(String tree) {
        String[] s = tree.split("!");
        Queue<TreeNode> queue = new LinkedList<>();
        for (int i = 0; i < s.length; i++) {
            TreeNode node = null;
            if (s[i].equals("#")) {
                node = new TreeNode(Integer.MIN_VALUE);
            } else {
                node = new TreeNode(Integer.parseInt(s[i]));
            }
            queue.offer(node);
        }
        TreeNode root = queue.poll();
        makeTree(root, queue);
        return root;
    }

    private static void makeTree(TreeNode root, Queue<TreeNode> queue) {
        if (root == null || root.val == Integer.MIN_VALUE) {
            return;
        }
        root.left = queue.poll();
        makeTree(root.left, queue);
        root.right = queue.poll();
        makeTree(root.right, queue);
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
        System.out.println(serializedBinaryTree(root));

        String s = serializedBinaryTree(root);
        TreeNode tree = deSerializedBinaryTree(s);
        printTree(tree);
    }

}
