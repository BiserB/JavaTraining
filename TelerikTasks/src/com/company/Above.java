package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Above {

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
        int offset = 0;

        for (int row = 0; row < count; row++) {
            for (int col = offset; col < count; col++) {
                sum+=matrix[row][col];
            }
            offset++;
        }
        System.out.println(sum);
    }


}



