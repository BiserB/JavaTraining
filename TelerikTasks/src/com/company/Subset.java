package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subset {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean match = false;
    private static String result = "no";
    private static int[] arr;
    private static int sum;

    public static void main(String[] args)throws IOException {

        readInput();

        for (int groupSize = 1; groupSize <= arr.length; groupSize++) {

            for (int index = 0; index <= arr.length - groupSize; index++) {

                int currentSum = 0;

                for (int additive = 0; additive < groupSize; additive++) {

                    currentSum += arr[index + additive];

                    if (currentSum == sum)
                    {
                        match = true;
                        result = "yes";
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

        System.out.println(result);
    }

    private static void readInput()throws IOException{

        sum = Integer.parseInt(reader.readLine());

        String[] input = reader.readLine().trim().split(" ");

        arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
    }
}
