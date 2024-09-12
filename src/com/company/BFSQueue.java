package com.company;

import java.util.LinkedList;
import java.util.Queue;

class BFSQueue {
    static void printTree(final Node root) {
        if (root == null) {
            return;
        }

        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        final StringBuilder output = new StringBuilder();

        while (!queue.isEmpty()) {
            // removes the queue head
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

        System.out.println(output);
    }

    public static void main(final String[] args) {
        final Node root = new Node(0);
        root.setLeft(new Node(1));
        root.setRight(new Node(2));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(4));
        root.getRight().setLeft(new Node(5));
        root.getRight().setRight(new Node(6));

        printTree(root);
    }
}