package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeGroups {

    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] arr = new int[input.length];

        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {

            int num = Integer.parseInt(input[i]);

            arr[i] = num;

            int reminder = num % 3;

            switch (reminder){
                case 0:
                    group1.add(input[i]);
                    break;
                case 1:
                    group2.add(input[i]);
                    break;
                case 2:
                    group3.add(input[i]);
                    break;
            }
        }

        String row1 = String.join(" ", group1);
        String row2 = String.join(" ", group2);
        String row3 = String.join(" ", group3);

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);


    }
}
