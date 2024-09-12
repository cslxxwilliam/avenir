package com.company;

import java.util.LinkedList;
import java.util.Queue;

class BFSQueue {
    static void printTree(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        final StringBuilder output = new StringBuilder();

        while (!queue.isEmpty()) {
            // removes the present head.
            Node curr = queue.poll();
            output.append(curr.data).append(" ");

            // Enqueue left child
            if (curr.left != null) {
                queue.add(curr.left);
            }

            // Enqueue right child
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

        System.out.println(output);
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        printTree(root);
    }
}