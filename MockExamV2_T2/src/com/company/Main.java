package com.company;

import java.util.Scanner;

public class Main {

    private static int longestSeq = 1;
    private static int biggestSeqSum = 0;
    private static int[] speeds = new int[0];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        speeds = new int[count];

        for (int i = 0; i < count; i++) {
            speeds[i] = scanner.nextInt();
        }

        int groupLeaderIndex = 0;
        int currentSeq = 1;
        biggestSeqSum = speeds[0];

        for (int i = 1; i < count; i++) {
            if (speeds[i] > speeds[groupLeaderIndex]) {

                currentSeq ++;

                if (currentSeq > longestSeq) {
                    longestSeq = currentSeq;
                    biggestSeqSum = GetSequenceSum(i);
                }
                else if (currentSeq == longestSeq) {
                    int currentSeqSum = GetSequenceSum(i);
                    if (currentSeqSum > biggestSeqSum) {
                        biggestSeqSum = currentSeqSum;
                    }
                }
            }
            else {
                groupLeaderIndex = i;
                currentSeq = 1;
            }
        }

        System.out.println(biggestSeqSum);
    }

    private static int GetSequenceSum(int index){
        int currentSum = 0;
        for (int j = index; j > index - longestSeq; j--) {
            currentSum += speeds[j];
        }
        return currentSum;
    }
}
