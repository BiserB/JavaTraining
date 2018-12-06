package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = i + 1;
            if (isPrime(numbers[i])) {
                for (int j = 0; j <= i; j++) {
                    int output = isPrime(numbers[j])?1:0;
                    System.out.print(output);
                }
                System.out.println();
            }
        }

    }

    private static boolean isPrime(int number){
        if(number == 0) return  false;
        if (number == 1 || number == 2) return true;
        if (number % 2 == 0) return false;
        int root = (int)Math.sqrt(number);
        for (int i = 3; i <= root; i += 2)
        {
            if (number % i == 0) return false;
        }
        return true;
    }
}
