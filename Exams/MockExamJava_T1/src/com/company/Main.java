package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        String filtered = "";

        for (int i = 0; i < input.length; i++) {

            if (Character.isDigit(input[i])) {
                filtered += input[i];
            }
        }

        while (filtered.length() > 1) {
            int num = 0;

            String[] digits = filtered.split("");

            for (int i = 0; i < digits.length; i++) {
                num += Integer.parseInt(digits[i]);
            }
            filtered = Integer.toString(num);
        }

        System.out.println(filtered);
    }
}
