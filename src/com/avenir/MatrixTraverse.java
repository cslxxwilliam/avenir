package com.avenir;

import java.util.ArrayList;
import java.util.List;

public class MatrixTraverse {
    //matrix dimensions and total no. of combinations
    static int colLen, rowLen, noOfCombination;

    static void printPath(final List<Integer> path) {
        for (int i : path) {
            System.out.print(i + ", ");
        }

        noOfCombination++;
        System.out.println();
    }

    static void searchPaths(final int[][] arr,
                            final List<Integer> path,
                            final int i,
                            final int j) {
        // Recursion terminal condition:
        // Reach the target bottom right cell, print the path
        if (i == colLen - 1 && j == rowLen - 1) {
            path.add(arr[i][j]);
            printPath(path);

            //backtracking
            path.remove(path.size() - 1);
            return;
        }

        // Include current cell in the path
        path.add(arr[i][j]);

        // Move right
        if (j + 1 < rowLen) {
            searchPaths(arr, path, i, j + 1);
        }

        // Move down
        if (i + 1 < colLen) {
            searchPaths(arr, path, i + 1, j);
        }

        // Backtracking
        path.remove(path.size() - 1);
    }

    public static void main(final String[] args) {
        int[][] matrix
                = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        List<Integer> path = new ArrayList<>();

        int i = 0, j = 0;
        colLen = matrix.length;
        rowLen = matrix[0].length;
        searchPaths(matrix, path, i, j);
        System.out.println("No. of combination: " + noOfCombination);
    }
}
