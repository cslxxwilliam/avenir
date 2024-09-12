package com.avenir.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSQueue implements TreePrinter {
    private final Node root;
    private final Queue<Node> queue = new LinkedList<>();
    private final StringBuilder output= new StringBuilder();

    public BFSQueue(final Node root) {
        this.root = root;
        queue.add(root);
    }

    @Override
    public void printTree() {
        if (root == null) {
            return;
        }

        while (!queue.isEmpty()) {
            // Removes the queue head
            final Node curr = queue.poll();
            output.append(curr.getData()).append(" ");

            // Enqueue left child
            if (curr.getLeft() != null) {
                queue.add(curr.getLeft());
            }

            // Enqueue right child
            if (curr.getRight() != null) {
                queue.add(curr.getRight());
            }
        }

        System.out.print(output);
    }
}