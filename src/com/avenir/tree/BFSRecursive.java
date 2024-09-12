package com.avenir.tree;

public class BFSRecursive implements TreePrinter {
    private final Node root;
    private final StringBuilder output = new StringBuilder();

    public BFSRecursive(final Node root) {
        this.root = root;
    }

    @Override
    public void printTree() {
        final int height = findHeight(root);

        for (int i = 1; i <= height; i++) {
            printNodeAtLevel(root, i);
        }

        System.out.print(output);
    }

    private void printNodeAtLevel(final Node node, final int level) {
        if (node == null) {
            return;
        }

        if (level == 1) {
            output.append(node.getData()).append(" ");
        }

        printNodeAtLevel(node.getLeft(), level - 1);
        printNodeAtLevel(node.getRight(), level - 1);
    }

    private int findHeight(final Node root) {
        if (root == null) {
            return 0;
        }

        final int leftHeight = findHeight(root.getLeft());
        final int rightHeight = findHeight(root.getRight());

        if (leftHeight >= rightHeight) {
            return (leftHeight + 1);
        } else {
            return (rightHeight + 1);
        }
    }

}