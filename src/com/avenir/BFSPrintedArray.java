package com.avenir;

public class BFSPrintedArray implements TreePrinter {
    private final Node root;
    private static boolean[] printed;

    public BFSPrintedArray(final Node root) {
        this.root = root;
    }

    @Override
    public void printTree() {
        printed = new boolean[7];
        printTree(root, printed);
    }

    private void printTree(final Node node, final boolean[] printed)
    {
        if(node==null){
            return;
        }

        final StringBuilder output = new StringBuilder();

        printNode(node, printed, output);
        printNode(node.getLeft(), printed, output);
        printNode(node.getRight(), printed, output);

        printTree(node.getLeft(), printed);
        printTree(node.getRight(), printed);

        System.out.print(output);
    }

    private void printNode(final Node node, final boolean[] printed, final StringBuilder output) {
        if(node==null){
            return;
        }

        if(!printed[node.getData()]){
            output.append(node.getData()).append(" ");
            printed[node.getData()] = true;
        }
    }
}