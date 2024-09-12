package com.avenir.matrix;

public class MatrixTraverseDemo {
    public static void main(final String[] args) {
        final int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        final DFSBacktracking DFSBacktracking = new DFSBacktracking(matrix);

        final int noOfPossiblePaths = DFSBacktracking.printAllPaths();
        System.out.println("Total number of possible paths: " + noOfPossiblePaths);
    }
}