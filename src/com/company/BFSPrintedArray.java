package com.company;

public class BFSPrintedArray implements TreePrinter {
    private final Node root;
    private static boolean[] printed;
    private StringBuilder output = new StringBuilder();

    public BFSPrintedArray(final Node root) {
        this.root = root;
    }

    @Override
    public void printTree() {
        printed = new boolean[7];
        printTree(root, printed);
    }

    static void printTree(final Node node, final boolean[] printed)
    {
        if(node==null){
            return;
        }

        printNode(node, printed);
        printNode(node.getLeft(), printed);
        printNode(node.getRight(), printed);

        printTree(node.getLeft(), printed);
        printTree(node.getRight(), printed);


    }

    private static void printNode(final Node node, final boolean[] printed) {
        if(node==null){
            return;
        }

        if(!printed[node.getData()]){
            System.out.print(node.getData() + " ");
            printed[node.getData()] = true;
        }
    }
}