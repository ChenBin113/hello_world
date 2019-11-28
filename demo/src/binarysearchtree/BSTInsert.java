package binarysearchtree;

import util.TreeNode;

public class BSTInsert {
    void BSTInsert(TreeNode node, TreeNode insertNode) {
        if (insertNode.value < node.value) {
            if (node.left != null) {
                BSTInsert(node.left, insertNode);
            } else {
                node.left = insertNode;
            }
        } else {
            if (node.right != null) {
                BSTInsert(node.right, insertNode);
            } else {
                node.right = insertNode;
            }
        }
    }
}
