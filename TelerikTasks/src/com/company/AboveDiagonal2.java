package com.company;

import java.util.Scanner;

public class AboveDiagonal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        long[][] matrix = new long[count][];

        long firstElement = 1;

        for (int i = 0; i < count; i++) {

            long[] row = new long[count];
            row[0] = firstElement;
            firstElement *= 2;

            for (int j = 1; j < count; j++) {
                row[j] = row[j-1] * 2;
            }

            matrix[i] = row;
        }

        long sum = 0;
        int initial = 1;

        for (int row = 0; row < count; row++) {
            for (int col = initial; col < count; col++) {
                sum+=matrix[row][col];
            }
            initial++;
        }
        System.out.println(sum);
    }


}
