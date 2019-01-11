package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String[] input = scanner.next().split("");

      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);
      int c = Integer.parseInt(input[2]);

      int maxSum = 0;

        maxSum = (a * b * c)  > (a + b + c) ? (a * b * c) : (a + b + c);
        if ((a + b * c) > maxSum) {
            maxSum = (a + b * c);
        }
        if ((a * b + c) > maxSum) {
            maxSum = (a + b * c);
        }
        System.out.println(maxSum);
    }
}
