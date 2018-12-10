package com.company;

import java.util.Scanner;

public class SymmetricArrays {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        scanner.nextLine();

        String[] resultStr =  new String[cnt];

        for (int i = 0; i < cnt; i++) {
            String result = "Yes";
            String[] arr = scanner.nextLine().split(" ");

            int middle = arr.length / 2;

            for (int j = 0; j < middle; j++) {
                if (!arr[j].equals(arr[arr.length - 1 - j])){
                    result = "No";
                    break;
                }
            }
            resultStr[i] = result;
        }
        System.out.println(String.join("\n", resultStr));
    }
}
