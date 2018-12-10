package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MostFrequent {

    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        int[] arr = new int[count];
        
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        
        int mostFrequent = 0;
        int maxFrequency = 0;

        for (int i = 0; i < arr.length; i++) {

            int currentNum = arr[i];
            int numFrequency = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == currentNum){
                    numFrequency++;
                }
            }

            if (numFrequency > maxFrequency){
                mostFrequent = currentNum;
                maxFrequency = numFrequency;
            }
        }

        System.out.println(mostFrequent + "(" + maxFrequency + " times)");
    }
}
