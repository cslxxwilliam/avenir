package com.avenir;

public class Node {
    private final int data;
    private Node left;
    private Node right;

    public Node(final int item) {
        data = item;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(final Node left) {
        this.left = left;
    }

    public void setRight(final Node right) {
        this.right = right;
    }
}
