package test;

import com.company.BFSPrintedArray;
import com.company.BFSQueue;
import com.company.Node;
import com.company.TreePrinter;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintTreeTest {

    @Test
    public void testPrintTreeBFSQueue() {
        final Node root = populateTree();

        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        final TreePrinter bfsQueue = new BFSQueue(root);
        bfsQueue.printTree();

        System.setOut(originalOut);

        final String expectedOutput = "0 1 2 3 4 5 6 ";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintTreeBFSPrintedArray() {
        final Node root = populateTree();

        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        final BFSPrintedArray bfsPrintedArray = new BFSPrintedArray(root);
        bfsPrintedArray.printTree();

        System.setOut(originalOut);

        final String expectedOutput = "0 1 2 3 4 5 6 ";
        assertEquals(expectedOutput, outputStream.toString());
    }

    private static Node populateTree() {
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
