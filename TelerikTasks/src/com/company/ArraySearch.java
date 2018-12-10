package com.company;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySearch {

    static void fakeInput() {
        String test = "1,2,3,3,5";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");

        int[] arr = new int[input.length];

        List<String> missing = new ArrayList<String>();

        for (int i = 0; i < input.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 1; i <= arr.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]){
                    found = true;
                    break;
                }
            }

            if (!found){
                missing.add(Integer.toString(i));
            }
        }

        System.out.println(String.join(",", missing));
    }
}
