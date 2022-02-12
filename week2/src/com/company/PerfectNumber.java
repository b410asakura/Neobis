package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int caseNumber = scanner.nextInt();
        int[] testArray = new int[caseNumber];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = scanner.nextInt();
            int sum = 0;
            for (int j = 1; j < testArray[i]; j++) {
                if(testArray[i] % j == 0) sum = sum + j;
            }
            if (sum == testArray[i]) System.out.printf("%d eh perfeito\n", testArray[i]);
            else System.out.printf("%d nao eh perfeito\n", testArray[i]);
        }


    }
}
