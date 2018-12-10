package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

//        int[] arrNumbers = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();

        String[] strArr = scanner.nextLine().split(" ");

        String result = "";

        for (int i = strArr.length - 1; i > 0; i--) {
            result += (strArr[i] + ", ");
        }
        result += strArr[0];


        System.out.println(result);
    }
}
