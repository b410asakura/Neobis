package com.company;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long[] fibonacciArray = new long[61];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        int numberCase = scanner.nextInt();
        int[] caseArray = new int[numberCase];
        for (int i = 0; i < caseArray.length; i++) {
            caseArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < caseArray.length; i++) {
            System.out.printf("Fib(%d) = %d\n", caseArray[i], fibonacciArray[caseArray[i]]);
        }
    }
}
