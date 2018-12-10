package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SubsetSum {

    public static void subsetSum()throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.parseInt(bufferedReader.readLine());

        String[] input = bufferedReader.readLine().split(" ");

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        getSubsetSum(sum, arr);
    }

    private static void getSubsetSum(int sum, int[] arr) {

        System.out.println("sum from 0 = " + getArraySum(arr, 0));
        System.out.println("sum from 1 = " + getArraySum(arr, 1));
        System.out.println("sum from 2 = " + getArraySum(arr, 2));
        System.out.println("sum from 3 = " + getArraySum(arr, 3));
    }

    private static int getArraySum(int[] arr, int index){

        if (index == arr.length - 1){
            return arr[index];
        }

        return arr[index] + getArraySum(arr, index + 1);
    }
}
