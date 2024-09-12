package com.avenir;

import java.util.ArrayList;
import java.util.List;

public class MatrixTraverse {
    private final int colSize;
    private final int rowSize;
    private final int[][] matrix;
    private final List<Integer> path = new ArrayList<>();
    private int noOfCombination;

    public MatrixTraverse(final int[][] matrix) {
        this.matrix = matrix;
        this.colSize = matrix.length;
        this.rowSize = matrix[0].length;
    }

    void printPath(final List<Integer> path) {
        final StringBuilder output = new StringBuilder();

        for (final int i : path) {
            output.append(i).append(", ");
        }

        noOfCombination++;
        output.append("\n");
        System.out.print(output);
    }

    public void searchPaths(final int[][] matrix,
                            final List<Integer> path,
                            final int i,
                            final int j) {
        // Recursion terminal condition:
        // Reach the target bottom right cell, print the path
        if (i == colSize - 1 && j == rowSize - 1) {
            this.path.add(matrix[i][j]);
            printPath(path);

            //backtracking
            path.remove(path.size() - 1);
            return;
        }

        // Include current cell in the path
        path.add(matrix[i][j]);

        // Move right
        if (j + 1 < rowSize) {
            searchPaths(matrix, path, i, j + 1);
        }

        // Move down
        if (i + 1 < colSize) {
            searchPaths(matrix, path, i + 1, j);
        }

        // Backtracking
        path.remove(path.size() - 1);
    }

    public int printAllPaths() {
        searchPaths(matrix,path,0,0);
        return noOfCombination;
    }
}