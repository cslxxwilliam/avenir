package test;

import com.avenir.tree.BFSRecursive;
import com.avenir.tree.BFSQueue;
import com.avenir.tree.Node;
import com.avenir.tree.TreePrinter;
import org.junit.jupiter.api.Test;
import util.TreeUtils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintTreeTest {

    @Test
    public void testPrintTreeBFSQueue() {
        final Node root = TreeUtils.populateTree();

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
    public void testPrintTreeBFSRecursive() {
        final Node root = TreeUtils.populateTree();

        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        final BFSRecursive bfsPrintedArray = new BFSRecursive(root);
        bfsPrintedArray.printTree();

        System.setOut(originalOut);

        final String expectedOutput = "0 1 2 3 4 5 6 ";
        assertEquals(expectedOutput, outputStream.toString());
    }
}
