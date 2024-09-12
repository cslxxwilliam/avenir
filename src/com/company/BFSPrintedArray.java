package com.company;

public class BFSPrintedArray {
    static boolean[] printed;

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
            System.out.println(node.getData() + " ");
            printed[node.getData()] = true;
        }
    }

    public static void main(String[] args)
    {
        final Node root = new Node(0);
        root.setLeft(new Node(1));
        root.setRight(new Node(2));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(4));
        root.getRight().setLeft(new Node(5));
        root.getRight().setRight(new Node(6));

        printed = new boolean[7];
        printTree(root, printed);
    }
}