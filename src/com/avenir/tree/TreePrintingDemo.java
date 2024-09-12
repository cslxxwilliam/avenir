package com.avenir.tree;

import static util.TreeUtils.populateTree;

public class TreePrintingDemo {
    public static void main(final String[] args) {
        final Node root = populateTree();

        System.out.println("BFSQueue output:");
        final TreePrinter bfsQueue = new BFSQueue(root);
        bfsQueue.printTree();

        System.out.println("\nBFSRecursive output:");
        final TreePrinter bfsPrintedArray = new BFSRecursive(root);
        bfsPrintedArray.printTree();
    }
}