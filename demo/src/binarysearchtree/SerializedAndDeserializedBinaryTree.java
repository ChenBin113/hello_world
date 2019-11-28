package binarysearchtree;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static binarysearchtree.PrintBinaryTree.printTree;
import static util.InitTheTree.initTheTree;

public class SerializedAndDeserializedBinaryTree {

    public static String serializedBinaryTree(TreeNode root) {
        System.out.println("-------------------serializedBinaryTree-------------------");
        StringBuilder sb = new StringBuilder();
        preOrderTraversal(root, sb);
        return sb.toString();
    }

    private static void preOrderTraversal(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#!");
            return;
        }
        sb.append(node.value).append("!");
        preOrderTraversal(node.left, sb);
        preOrderTraversal(node.right, sb);
    }

    public static TreeNode deSerializedBinaryTree(String tree) {
        System.out.println("-------------------deSerializedBinaryTree-------------------");
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
        if (root == null || root.value == Integer.MIN_VALUE) {
            return;
        }
        root.left = queue.poll();
        makeTree(root.left, queue);
        root.right = queue.poll();
        makeTree(root.right, queue);
    }

    public static void main(String[] args) {
        TreeNode root = initTheTree();
        String s = serializedBinaryTree(root);
        System.out.println(s);
        TreeNode tree = deSerializedBinaryTree(s);
        printTree(tree);
    }

}
