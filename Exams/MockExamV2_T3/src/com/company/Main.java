package com.company;

import java.util.Scanner;

public class Main {

    private static int size = 0;
    private static int[][] matrix = new int[0][0];
    private static int move = 1;
    private static int row = 0;
    private static int col = 0;

    private static int[] pos1 = {-2, -1};
    private static int[] pos2 = {-2, 1};
    private static int[] pos3 = {-1, -2};
    private static int[] pos4 = {-1, 2};
    private static int[] pos5 = {1, -2};
    private static int[] pos6 = {1, 2};
    private static int[] pos7 = {2, -1};
    private static int[] pos8 = {2, 1};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();

        matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 0;
            }
        }

        // first move
        matrix[row][col] = move;
        move++;
        int moves = size * size;

        while(move <= moves){
            if (canJump(pos1)) {Jump(pos1);}
            else if (canJump(pos2)) {Jump(pos2);}
            else if (canJump(pos3)) {Jump(pos3);}
            else if (canJump(pos4)) {Jump(pos4);}
            else if (canJump(pos5)) {Jump(pos5);}
            else if (canJump(pos6)) {Jump(pos6);}
            else if (canJump(pos7)) {Jump(pos7);}
            else if (canJump(pos8)) {Jump(pos8);}
            else findFreeCell();
        }

        printMatrix();
    }

    private static void findFreeCell(){
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][c] = move;
                    move++;
                    row = r;
                    col = c;
                    return;
                }
            }
        }
    }

    private static void Jump(int[] pos){
        int r = row + pos[0];
        int c = col + pos[1];
        matrix[r][c] = move;
        row = r;
        col = c;
        move++;
    }

    private static boolean canJump(int[] pos){
        int r = row + pos[0];
        int c = col + pos[1];

        if (isInside(r,c) && matrix[r][c] == 0){
            return true;
        }
        return false;
    }

    private static boolean isInside(int r, int c){
        if (r < 0 || r >= size) {
            return false;
        }
        if (c < 0 || c >= size) {
            return false;
        }
        return true;
    }

    private static void printMatrix(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < size - 1){
                    System.out.print(matrix[i][j] + " ");
                }
                else{
                    System.out.print(matrix[i][j] + "\n");
                }
            }
        }
    }
}
