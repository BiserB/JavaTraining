package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummingSubset {
    public static void subset()throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.parseInt(reader.readLine());

        String[] input = reader.readLine().split(" ");

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        boolean match = false;

        for (int size = 0; size < arr.length; size++) {

            for (int i = 0; i < arr.length; i++) {

                int currentSum = 0;

                for (int j = i; j < arr.length; j++) {
                    currentSum += arr[i] + arr[j];


                    if (currentSum == sum)
                    {
                        match = true;
                        break;
                    }
                }

                if (match){
                    break;
                }
            }


            if (match){
                break;
            }
        }

        if (match){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
