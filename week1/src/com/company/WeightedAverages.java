package com.company;

import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            float num1, num2, num3;
            for (int i = 0; i < N; i++) {
                num1 = scanner.nextFloat();
                num2 = scanner.nextFloat();
                num3 = scanner.nextFloat();
                float sum = (num1 * 2 + num2 * 3 + num3 * 5);
                System.out.printf("%.1f\n", sum / 10);
            }

    }
}
