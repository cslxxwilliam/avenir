package com.company;

public class BFSPrintedArray {
    static boolean[] printed;

    static void printTree(Node node, boolean[] printed)
    {
        if(node==null){
            return;
        }

        printNode(node, printed);
        printNode(node.left, printed);
        printNode(node.right, printed);

        printTree(node.left, printed);
        printTree(node.right, printed);
    }

    private static void printNode(Node node, boolean[] printed) {
        if(node==null){
            return;
        }

        if(!printed[node.data]){
            System.out.println(node.data + " ");
            printed[node.data] = true;
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        printed = new boolean[7];
        printTree(root, printed);
    }
}
