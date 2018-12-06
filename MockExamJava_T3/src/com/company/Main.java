package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int sum = 0;

        while ( 99 < input && input < 1000) {
            int lastDigit = input % 10;
            int middleDigit = (input / 10) % 10;
            int firstDigit = input / 100;

            if (lastDigit + firstDigit == middleDigit) {
                sum += input;
            }
            else {
                break;
            }
            input = scanner.nextInt();
        };

        System.out.println(sum);
    }
}
