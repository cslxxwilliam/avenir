package com.avenir;

import static util.TreeUtils.populateTree;

public class TreePrintingDemo {
    public static void main(final String[] args) {
        final Node root = populateTree();

        System.out.println("BFSQueue output:");
        final TreePrinter bfsQueue = new BFSQueue(root);
        bfsQueue.printTree();

        System.out.println("\nBFSPrintedArray output:");
        final TreePrinter bfsPrintedArray = new BFSPrintedArray(root);
        bfsPrintedArray.printTree();
    }
}