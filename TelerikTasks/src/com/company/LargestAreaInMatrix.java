package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LargestAreaInMatrix {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    private static int[][] matrix;
    private static int maxCount = 0;

    public static void main(String[] args)throws IOException {

        String[] input = reader.readLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        matrix = new int[rows][cols];

        initMatrix();

        traverseMatrix();

        System.out.println(maxCount);
    }

    private static void traverseMatrix() {

        byte[][] visited = new byte[matrix.length][matrix[0].length];

        initEmptyMatrix(visited);

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {

                if (visited[r][c] == 1) {
                    continue;
                }
                else{
                    visited[r][c] = 1;
                }

                int currentCount = 1;
                int currentElement = matrix[r][c];
                int row = r;
                int col = c;

                Stack<Integer> rowTracker = new Stack<>();
                Stack<Integer> colTracker = new Stack<>();

                while(true){
                    if (isInside(row, col + 1) && visited[row][col + 1] == 0 && currentElement == matrix[row][col + 1]){
                        visited[row][col + 1] = 1;
                        currentCount++;
                        rowTracker.push(row); colTracker.push(col); col++;
                    }
                    else if (isInside(row + 1, col ) && visited[row + 1][col] == 0 && currentElement == matrix[row + 1][col]){
                        visited[row + 1][col] = 1;
                        currentCount++;
                        rowTracker.push(row); colTracker.push(col); row++;
                    }
                    else if (isInside(row , col - 1) && visited[row][col - 1] == 0 && currentElement == matrix[row][col - 1]){
                        visited[row][col - 1] = 1;
                        currentCount++;
                        rowTracker.push(row); colTracker.push(col); col--;
                    }
                    else if (isInside(row - 1, col ) && visited[row - 1][col] == 0 && currentElement == matrix[row - 1][col]){
                        visited[row - 1][col] = 1;
                        currentCount++;
                        rowTracker.push(row); colTracker.push(col); row--;
                    }
                    else if (rowTracker.isEmpty() && colTracker.isEmpty()){
                        break;
                    }
                    else {
                        row = rowTracker.pop();
                        col = colTracker.pop();
                    }
                }

                if (currentCount > maxCount){
                    maxCount = currentCount;
                }
            }
        }

    }

    private static boolean isInside(int row, int col) {

        if (row < 0 || row >= matrix.length) {
            return false;
        }

        if (col < 0 || col >= matrix[row].length) {
            return false;
        }

        return true;
    }

    private static void initMatrix()throws IOException{

        for (int i = 0; i < matrix.length; i++) {
            String[] input = reader.readLine().split(" ");

            int[] row = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                row[j] = Byte.parseByte(input[j]);
            }
            matrix[i] = row;
        }
    }

    private static void initEmptyMatrix(byte[][] emptyMatrix) {

        for (int r = 0; r < emptyMatrix.length; r++) {
            for (int c = 0; c < emptyMatrix[r].length; c++) {
                emptyMatrix[r][c] = 0;
            }
        }
    }

    private static void printMatrix(byte[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            byte[] row = matrix[i];

            System.out.println(Arrays.toString(row));
        }
    }
}
