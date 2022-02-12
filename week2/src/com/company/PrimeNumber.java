package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        int[] testArray = new int[testNumber];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < testArray.length; i++) {
            int count = 0;
            for (int j = 1; j <= testArray[i]; j++) {
                if(testArray[i] % j == 0) count++;
            }
            if(count == 2) System.out.println(testArray[i] + " eh primo");
            else System.out.println(testArray[i] + " nao eh primo");
        }
    }
}
