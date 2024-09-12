package util;

import com.avenir.tree.Node;

public class TreeUtils {
    public static Node populateTree() {
        final Node root = new Node(0);
        root.setLeft(new Node(1));
        root.setRight(new Node(2));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(4));
        root.getRight().setLeft(new Node(5));
        root.getRight().setRight(new Node(6));
        return root;
    }
}
