package com.company;

import java.util.Scanner;

public class Flask {

    public static void solution(){

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int liters = scanner.nextInt();

        int previousVolume = 0;
        int flaskNumber = 0;

        for (int i = 1; i < count * 2; i++) {

            int currentVolume = previousVolume + i - 1;

            if (currentVolume > liters && i % 2 != 0){
                flaskNumber = i;
                break;
            }
            previousVolume = currentVolume;
        }

        System.out.println(flaskNumber);
    }
}
