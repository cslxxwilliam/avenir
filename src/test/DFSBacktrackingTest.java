package test;

import com.avenir.matrix.DFSBacktracking;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DFSBacktrackingTest {
    @Test
    public void testPrintAllPaths() {
        final int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        final DFSBacktracking DFSBacktracking = new DFSBacktracking(matrix);
        final int noOfPossiblePaths = DFSBacktracking.printAllPaths();

        System.setOut(originalOut);

        final String expectedOutput =
                """
                        1, 2, 3, 4, 8, 12, 16,\s
                        1, 2, 3, 7, 8, 12, 16,\s
                        1, 2, 3, 7, 11, 12, 16,\s
                        1, 2, 3, 7, 11, 15, 16,\s
                        1, 2, 6, 7, 8, 12, 16,\s
                        1, 2, 6, 7, 11, 12, 16,\s
                        1, 2, 6, 7, 11, 15, 16,\s
                        1, 2, 6, 10, 11, 12, 16,\s
                        1, 2, 6, 10, 11, 15, 16,\s
                        1, 2, 6, 10, 14, 15, 16,\s
                        1, 5, 6, 7, 8, 12, 16,\s
                        1, 5, 6, 7, 11, 12, 16,\s
                        1, 5, 6, 7, 11, 15, 16,\s
                        1, 5, 6, 10, 11, 12, 16,\s
                        1, 5, 6, 10, 11, 15, 16,\s
                        1, 5, 6, 10, 14, 15, 16,\s
                        1, 5, 9, 10, 11, 12, 16,\s
                        1, 5, 9, 10, 11, 15, 16,\s
                        1, 5, 9, 10, 14, 15, 16,\s
                        1, 5, 9, 13, 14, 15, 16,\s
                        """
                ;

        assertEquals(expectedOutput, outputStream.toString());
        assertEquals(20, noOfPossiblePaths);
    }
}