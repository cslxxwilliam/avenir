package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BFSQueue implements TreePrinter {
    private final Node root;

    public BFSQueue(final Node root) {
        this.root = root;
    }

    @Override
    public void printTree() {
        if (root == null) {
            return;
        }

        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        final StringBuilder output = new StringBuilder();

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